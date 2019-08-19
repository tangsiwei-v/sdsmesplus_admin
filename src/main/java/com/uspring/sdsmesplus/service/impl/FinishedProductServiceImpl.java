package com.uspring.sdsmesplus.service.impl;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.uspring.sdsmesplus.dao.PlanOpBomDao;
import com.uspring.sdsmesplus.dao.generate.ProdFinishedProductPODao;
import com.uspring.sdsmesplus.dao.generate.ProdOrderStockPODao;
import com.uspring.sdsmesplus.dao.generate.ProdPrinterLogPODao;
import com.uspring.sdsmesplus.dao.generate.SysPrinterTmplDao;
import com.uspring.sdsmesplus.entity.po.*;
import com.uspring.sdsmesplus.enums.FinishedProductStatus;
import com.uspring.sdsmesplus.exception.ServiceException;
import com.uspring.sdsmesplus.mq.PrinterService;
import com.uspring.sdsmesplus.service.FinishedProductService;
import com.uspring.sdsmesplus.service.PackBoxService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import static org.springframework.transaction.annotation.Isolation.REPEATABLE_READ;
import static org.springframework.transaction.annotation.Isolation.SERIALIZABLE;

/**
 * @Version 1.0
 * @Description:
 * @Author: Wenchao Liu liuwenchao@uspring.cn
 * @date 2019/7/1 11:33
 */
@Service("finishedProductService")
public class FinishedProductServiceImpl implements FinishedProductService {

	@Autowired
	private ProdFinishedProductPODao prodFinishedProductDao;

	@Autowired
	private SysPrinterTmplDao sysPrinterTmplDao;

	@Autowired
	private PlanOpBomDao planOpBomDao;

	@Autowired
	private ProdOrderStockPODao prodOrderStockPODao;

	@Autowired
	private PrinterService printerService;

	@Autowired
	private PackBoxService packBoxService;

    @Autowired
    private ProdPrinterLogPODao prodPrinterLogPODao;

    @Override
    @Transactional(propagation = Propagation.REQUIRED , isolation = SERIALIZABLE)
    public int productOut(String pfBarcode, boolean weightVerifyWithOutRfid, ProdFinishedProductPO prodFinishedProductPO) throws Exception {
        //@TODO: 检验该成品条码是否是本线打印条码；（可选）
        if(weightVerifyWithOutRfid){
            ProdPrinterLogPOExample prodPrinterLogPOExample=new ProdPrinterLogPOExample();
            prodPrinterLogPOExample.createCriteria().andLineIdEqualTo(prodFinishedProductPO.getLineId())
                    .andProdCodeEqualTo(prodFinishedProductPO.getProdCode())
                    .andCustomerCodeEqualTo(prodFinishedProductPO.getCustomerCode()).andBarcodeEqualTo(prodFinishedProductPO.getFpBarcode());
            List<ProdPrinterLogPO> prodPrinterLogPOS = prodPrinterLogPODao.selectByExample(prodPrinterLogPOExample);
            if(prodPrinterLogPOS.size() < 1){
                throw new ServiceException("非本线打印条码");
            }
        }
        //验证条码长度
        SysPrinterTmplPOExample sysPrinterTmplPOExample = new SysPrinterTmplPOExample();
        sysPrinterTmplPOExample.createCriteria().andProdCodeEqualTo(prodFinishedProductPO.getPoCode());
        List<SysPrinterTmplPO> sysPrinterTmplPOS = sysPrinterTmplDao.selectByExample(sysPrinterTmplPOExample);

        if (sysPrinterTmplPOS.size() > 0) {
            if (sysPrinterTmplPOS.get(0).getPtmplSize() != pfBarcode.length()) {
                throw new ServiceException("条码长度不匹配");
            }
        }

        //判断条码是否唯一
        ProdFinishedProductPOExample prodFinishedProductPOExample = new ProdFinishedProductPOExample();
        prodFinishedProductPOExample.createCriteria().andFpBarcodeEqualTo(pfBarcode).andProdCodeEqualTo(prodFinishedProductPO.getProdCode())
        .andCustomerCodeEqualTo(prodFinishedProductPO.getCustomerCode());
        List<ProdFinishedProductPO> prodFinishedProductPOS = prodFinishedProductDao.selectByExample(prodFinishedProductPOExample);
        if (prodFinishedProductPOS.size() > 0) {
            throw new ServiceException("该条码已存在");
        }

        //验证RFID是否存在
        //ProdFinishedProductPOExample prodFinishedProductPOExample=new ProdFinishedProductPOExample();
        prodFinishedProductPOExample.clear();
        prodFinishedProductPOExample.createCriteria().andFpRfidEqualTo(prodFinishedProductPO.getFpRfid());
        List<ProdFinishedProductPO> prodFinishedProductPOS1 = prodFinishedProductDao.selectByExample(prodFinishedProductPOExample);
        if (prodFinishedProductPOS1.size() > 0) {
            throw new ServiceException("RFID已存在！");
        }

        //称重防错
        if (weightVerifyWithOutRfid) {
            
        }
        
        // 扣减线边库存并判断是否需要物料拉动
        removeLineMaterial(prodFinishedProductPO);
  

        //待结箱状态存入数据库
        prodFinishedProductPO.setFpStatus(FinishedProductStatus.ToBoxClose.getCode());
        prodFinishedProductPO.setCreateTime(new Date());
        prodFinishedProductDao.insertSelective(prodFinishedProductPO);
       

        
        // 异步判断是否需要拉料
        final String orderCodeTmp = prodFinishedProductPO.getPoCode();
        packBoxService.materialCallCheck(orderCodeTmp);

        // 打印下一张条码
        printerService.printFPBarcode(prodFinishedProductPO.getProdCode(),prodFinishedProductPO.getCustomerCode(),prodFinishedProductPO.getLineId());

        return 1;
    }

    @Override
    public boolean productReplace(String pfBarcode, String fp_barcode_new) {
        //@TODO: 检验新条码条码是否是本线打印条码；

        ProdFinishedProductPOExample prodFinishedProductPOExample = new ProdFinishedProductPOExample();
        prodFinishedProductPOExample.createCriteria().andFpBarcodeEqualTo(pfBarcode);

        //验证新条码是否已经存在
        //判断条码是否唯一
        ProdFinishedProductPOExample prodFinishedProductPOExample2 = new ProdFinishedProductPOExample();
        prodFinishedProductPOExample2.createCriteria().andFpBarcodeEqualTo(fp_barcode_new);
        List<ProdFinishedProductPO> prodFinishedProductPOS = prodFinishedProductDao.selectByExample(prodFinishedProductPOExample2);
        if (prodFinishedProductPOS.size() > 0) {
            throw new ServiceException("该条码已存在");
        }

        ProdFinishedProductPO prodFinishedProductPO = new ProdFinishedProductPO();
        prodFinishedProductPO.setFpBarcode(fp_barcode_new);

        prodFinishedProductDao.updateByExampleSelective(prodFinishedProductPO, prodFinishedProductPOExample);

        return true;
    }

    @Override
    public boolean productDelete(String pfBarcode) {

        ProdFinishedProductPOExample prodFinishedProductPOExample = new ProdFinishedProductPOExample();
        prodFinishedProductPOExample.createCriteria().andFpBarcodeEqualTo(pfBarcode).andFpStatusEqualTo(FinishedProductStatus.BoxClosed.getCode());

        List<ProdFinishedProductPO> prodFinishedProductPOS = prodFinishedProductDao.selectByExample(prodFinishedProductPOExample);
        if (prodFinishedProductPOS.size() > 0) {
            throw new ServiceException("已装箱，不能删除");
        }

        prodFinishedProductPOExample.clear();
        prodFinishedProductPOExample.createCriteria().andFpBarcodeEqualTo(pfBarcode);
        prodFinishedProductDao.deleteByExample(prodFinishedProductPOExample);

        //@TODO:物料扣减回退

        return true;
    }

    @Override
    public PageInfo<ProdFinishedProductPO> getProds(Map<String, Object> para) throws Exception {

        int page_size = 50;
        int page_num = 1;
        if (para.containsKey("page_size")) {
            page_size = (Integer) para.get("page_size");
        }
        if (para.containsKey("page_num")) {
            page_num = (Integer) para.get("page_num");
        }
        if(para.containsKey("status")) {
        	List<String> statusArr = JSON.parseArray(para.get("status").toString(), String.class);
        	para.put("statusArr", statusArr);
        }

        ProdFinishedProductPOExample prodFinishedProductPOExample = new ProdFinishedProductPOExample();
        ProdFinishedProductPOExample.Criteria fpCriteria = prodFinishedProductPOExample.createCriteria();
        
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        
        if(para.containsKey("order_code")) {
        	fpCriteria.andPoCodeEqualTo(para.get("order_code").toString());
        }
        if(para.containsKey("box_barcode")) {
        	fpCriteria.andBoxBarcodeEqualTo(para.get("box_barcode").toString());
        }
        if(para.containsKey("statusArr")) {
        	fpCriteria.andFpStatusIn((List<String>) para.get("statusArr"));
        }
        if(para.containsKey("line_id")) {
        	fpCriteria.andLineIdEqualTo((Integer) para.get("line_id"));
        }
        if(para.containsKey("start_time") && para.containsKey("end_time")) {
        	fpCriteria.andCreateTimeBetween(simpleDateFormat.parse("start_time"), simpleDateFormat.parse("end_time"));
        }
        prodFinishedProductPOExample.setOrderByClause("create_time desc");
        
        PageHelper.startPage(page_num, page_size);
        List<ProdFinishedProductPO> prodFinishedProductPOS = prodFinishedProductDao.selectByExample(prodFinishedProductPOExample);
        PageInfo<ProdFinishedProductPO> pageInfo = new PageInfo<ProdFinishedProductPO>(prodFinishedProductPOS);

        return pageInfo;
    }

    @Override
    public boolean change_status(String fp_barcode, String to_status) throws Exception {

        FinishedProductStatus finishedProductStatus = FinishedProductStatus.valueOf(to_status);

        if (finishedProductStatus == null) {
            throw new ServiceException("该状态不存在，不能修改");
        }

        ProdFinishedProductPOExample prodFinishedProductPOExample = new ProdFinishedProductPOExample();
        prodFinishedProductPOExample.createCriteria().andFpBarcodeEqualTo(fp_barcode);
        List<ProdFinishedProductPO> prodFinishedProductPOS = prodFinishedProductDao.selectByExample(prodFinishedProductPOExample);
        if (prodFinishedProductPOS.size() < 1) {
            throw new ServiceException("产品不存在");
        }

        String fromStatus = prodFinishedProductPOS.get(0).getFpStatus();

        if (fromStatus.equals(FinishedProductStatus.BoxClosed.getCode())) {
            throw new ServiceException("已装箱，不能修改状态");
        }
        if (fromStatus.equals(FinishedProductStatus.BoxDeleted.getCode())) {
            throw new ServiceException("产品已删除，不能修改状态");
        }

        ProdFinishedProductPO prodFinishedProductPO = new ProdFinishedProductPO();
        prodFinishedProductPO.setFpStatus(to_status);

        prodFinishedProductDao.updateByExampleSelective(prodFinishedProductPO, prodFinishedProductPOExample);

        return true;
    }

    // 扣减库存 1.扣减 
    void removeLineMaterial(ProdFinishedProductPO prodFinishedProductPO) throws Exception {

        // 4.1查询bom表,获取到零件号 和 零件消耗数
    	List<PlanOpBomPO> bomMaterials = planOpBomDao.selectBomByOrdercode(prodFinishedProductPO.getPoCode());
        for (PlanOpBomPO bomMaterial : bomMaterials) {
        	if(!bomMaterial.getMaterialUnit().startsWith("KG")) {
	            String materCode = bomMaterial.getMaterialCode();
	            Double unitCount = bomMaterial.getMaterialCount();
	            
	            // 4.2计算每个零部件消耗
	
	            BigDecimal gigo = new BigDecimal(unitCount);
	            BigDecimal gig = new BigDecimal(0);
	            // 4.3扣减库存
	            ProdOrderStockPOExample orderStockExample = new ProdOrderStockPOExample();
	
	            orderStockExample.createCriteria().andPoCodeEqualTo(prodFinishedProductPO.getPoCode()).andMatCodeEqualTo(materCode)
	                    .andBoxQuanLeftGreaterThan(gig).andIsCleanedNotEqualTo(true);
	            orderStockExample.setOrderByClause("create_time asc");
	            List<ProdOrderStockPO> orders = prodOrderStockPODao.selectByExample(orderStockExample);
	            if(orders.size() == 0)
	            	throw new ServiceException("物料"+materCode+"不足无法生产");
	        	BigDecimal haveTotal = new BigDecimal(0);
	        	
	        	//判断线上物料是否够生产
				for (ProdOrderStockPO prodOrderStockPO : orders) {
					haveTotal = haveTotal.add(prodOrderStockPO.getBoxQuanLeft());
				}
				if (gigo.compareTo(haveTotal) > 0)
					throw new ServiceException("当前线上物料不够扣减，无法生产");
        	}
        }
		for (PlanOpBomPO bomMaterial : bomMaterials) {
			if(!bomMaterial.getMaterialUnit().startsWith("KG")) {
				String materCode = bomMaterial.getMaterialCode();
				Double unitCount = bomMaterial.getMaterialCount();
	
				// 4.2计算每个零部件消耗
	
				BigDecimal gigo = new BigDecimal(unitCount);
				BigDecimal gig = new BigDecimal(0);
				// 4.3扣减库存
				ProdOrderStockPOExample orderStockExample = new ProdOrderStockPOExample();
	
				orderStockExample.createCriteria().andPoCodeEqualTo(prodFinishedProductPO.getPoCode())
						.andMatCodeEqualTo(materCode).andBoxQuanLeftGreaterThan(gig).andIsCleanedNotEqualTo(true);
				orderStockExample.setOrderByClause("create_time asc");
				List<ProdOrderStockPO> orders = prodOrderStockPODao.selectByExample(orderStockExample);
				for (ProdOrderStockPO prodOrderStockPO : orders) {
					// 物料剩余数量
					BigDecimal count = prodOrderStockPO.getBoxQuanLeft();
					if (gigo.compareTo(count) > -1) {
						gigo = gigo.subtract(count).setScale(2, RoundingMode.HALF_UP);
						prodOrderStockPO.setBoxQuanLeft(gig);
						prodOrderStockPO.setIsOpen(true);
						prodOrderStockPO.setUpdateTime(new Date());
						prodOrderStockPODao.updateByPrimaryKey(prodOrderStockPO);
						break;
	
					} else if (gigo.compareTo(gig) == 1 && gigo.compareTo(count) < 1) {
						count = count.subtract(gigo).setScale(2, RoundingMode.HALF_UP);
						prodOrderStockPO.setBoxQuanLeft(count);
						prodOrderStockPO.setIsOpen(true);
						prodOrderStockPO.setUpdateTime(new Date());
						prodOrderStockPODao.updateByPrimaryKey(prodOrderStockPO);
						break;
					}
				}
			}
		}
	}

	@Override
	public void print(String prod_code, String customer_code, Integer line_id) {
		// 1、调用打印服务，打印总成条码
		printerService.printFPBarcode(prod_code, customer_code, line_id);
	}

}
