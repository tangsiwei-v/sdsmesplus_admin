package com.uspring.sdsmesplus.mpmlink;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.uspring.sdsmesplus.dao.PlanOpBomDao;
import com.uspring.sdsmesplus.dao.PlanOrderDao;
import com.uspring.sdsmesplus.dao.SysFactoryDao;
import com.uspring.sdsmesplus.dao.generate.PlanOpBomPODao;
import com.uspring.sdsmesplus.dao.generate.SysLinePODao;
import com.uspring.sdsmesplus.entity.po.PlanOpBomPO;
import com.uspring.sdsmesplus.entity.po.PlanOpBomPOExample;
import com.uspring.sdsmesplus.entity.po.PlanOrderPO;
import com.uspring.sdsmesplus.entity.po.PlanOrderPOExample;
import com.uspring.sdsmesplus.entity.po.SysFactoryPO;
import com.uspring.sdsmesplus.entity.po.SysFactoryPOExample;
import com.uspring.sdsmesplus.exception.ServiceException;
import com.uspring.sdsmesplus.mpmlink.dao.ProcessPlanDao;

/**
 * * @author 作者 E-mail:chengtengfei
 * 
 * @date 创建时间：2019年6月25日 下午1:00:36
 * @version 1.0 * @parameter
 * @since
 * @return
 */
@Service
public class MPlinkServiceimpl implements MpmlinkService {

	@Value("#{prop.mpmlink_xml_dirt}")
	private String DEFULT_MPLINK_XML;

	@Autowired
	private ProcessPlanDao processPlanDao;
	
	@Autowired 
	private SysFactoryDao factoryDao;
	
	@Autowired
	private PlanOpBomDao bomDao;
	

	@Override
	public List<BomMaterial> queryBom(String prodCode,Integer fcId) throws Exception {
		List<BomMaterial> boms = new ArrayList<BomMaterial>();

		//获取工厂信息
		SysFactoryPO factoryPo = this.factoryDao.selectByPrimaryKey(fcId);
		String fcCode = "";
		if(factoryPo != null){
			fcCode = factoryPo.getFcSite();
		}else{
			return null;
		}
		
		String filePath = "";
		List<Map<String,Object>> filePathList = getFilePathHelp(prodCode);
		for(Map<String,Object> dataMap:filePathList){
			if(dataMap.get("FILE_ADDRESS").toString().contains(fcCode)){
				filePath =  dataMap.get("FILE_ADDRESS").toString();
				break;
			}
		}
		
		
		
		String path = DEFULT_MPLINK_XML + filePath;

		List<BomMaterial> bomsTotal = new ArrayList<BomMaterial>();

		URL url = new URL(path);
		URLConnection urlc = url.openConnection();
		InputStream inputStream = urlc.getInputStream();

		SAXReader saxReader = new SAXReader();
		Document document = null;

		document = saxReader.read(inputStream);

		// SAX生成和解析XML文档
		Element rootElement = document.getRootElement(); // 获得根节点

		Element element1 = rootElement.element("Part");
		List<Element> listBom = element1.elements("Part");

		List<String> matList = new ArrayList<String>();
		for (Element ele : listBom) {
			BomMaterial bom = new BomMaterial();
			bom.setMaterialCode(
					ele.attribute("SDSSAPNumber").getText() == null ? "" : ele.attribute("SDSSAPNumber").getText());
			bom.setMaterialQty(Double
					.parseDouble(ele.attribute("Qty").getText() == null ? "" : ele.attribute("Qty").getText()));
			// 获取单位
			// bom.setMaterialUnit
			matList.add(bom.getMaterialCode());
			
			boms.add(bom);
		}
		
		//获取产品的bom信息
		
		List<PlanOpBomPO> bomBaseList = bomDao.selectBomByMtCode(matList);
		
		for(BomMaterial bom:boms){
			for(PlanOpBomPO baseData:bomBaseList){
				if(bom.getMaterialCode().equals(baseData.getMaterialCode())){
					bom.setMaterialName(baseData.getMaterialName());
					break;
				}
			}
		}
		
		return boms;
	}
	
	List<Map<String,Object>> getFilePathHelp(String prodCode) throws IOException {
		/*SysLinePOExample sysLinePOExample = new SysLinePOExample();
		sysLinePOExample.createCriteria().andLineIdEqualTo(LineId);
		List<SysLinePO> lists = sysLinePODao.selectByExample(sysLinePOExample);

		if (lists.size() <= 0)
			throw new ServiceException("查询不到工艺数据");
		String lineMpmlinkCode = lists.get(0).getLineMpmlinkCode();*/

/*		PlanOrderPOExample exm = new PlanOrderPOExample();
		exm.createCriteria().andProdCodeEqualTo(prodCode);
		PlanOrderPO planPo = planOrderDao.selectByExample(exm).get(0);*/
		List<Map<String,Object>> mapList = processPlanDao.queryBomSimple(prodCode);

		return mapList;
	}
}
