/**
 * @Title: MongoDBServiceImpl.java 
 * @Package com.uspring.natiefu.mes.service.impl 
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author lihuan lihuanwk@126.com
 * @date 2018年8月5日 上午9:13:32 
 * @version V1.0 
 */
package com.uspring.sdsmesplus.service.impl;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.SimpleTimeZone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.domain.Sort.Order;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import com.mongodb.WriteResult;
import com.uspring.sdsmesplus.dao.ProcessParamDao;
import com.uspring.sdsmesplus.dao.generate.SysProcessPODao;
import com.uspring.sdsmesplus.dao.generate.SysProcessParamPODao;
import com.uspring.sdsmesplus.entity.po.SysProcessPO;
import com.uspring.sdsmesplus.entity.po.SysProcessPOExample;
import com.uspring.sdsmesplus.entity.po.SysProcessParamPO;
import com.uspring.sdsmesplus.entity.po.SysProcessParamPOExample;
import com.uspring.sdsmesplus.entity.vo.BasePParameter;
import com.uspring.sdsmesplus.entity.vo.LineRFID;
import com.uspring.sdsmesplus.entity.vo.ProdProcess;
import com.uspring.sdsmesplus.entity.vo.ProdProcessParam;
import com.uspring.sdsmesplus.exception.ServiceException;
import com.uspring.sdsmesplus.service.MongoDBService;

/**
 * @ClassName: MongoDBServiceImpl
 * @Description: MongoDB服务实现类
 * @author lihuan lihuan@uspring.cn
 * @date 2018年8月5日 上午9:13:32
 * 
 */
@Service
public class MongoDBServiceImpl implements MongoDBService {

	@Autowired
	private MongoTemplate mongoTemplate;
	
	@Autowired  
	private SysProcessPODao processDao;
	
	@Autowired
	private SysProcessParamPODao processParamDao;
	
	@Autowired
	private ProcessParamDao ParamDao;

	private final String PPARAM_COLLECTIONS = "ProcessParameter";

	@Override
	public Map<String, Object> findPParamByRFID(String rfid) {
		Query query = new Query(Criteria.where("rfid").is(rfid));
		Map<String, Object> map = new HashMap<String, Object>();
		return mongoTemplate.findOne(query, map.getClass(), PPARAM_COLLECTIONS);
	}
	
	@Override
	public Map<String, Object> findPParamByRFIDAndLine(String rfid, String lineId) {
		Criteria criatira = new Criteria();
		criatira.andOperator(Criteria.where("rfid").is(rfid), Criteria.where("line").is(lineId));
		Query query = new Query(criatira);
		Map<String, Object> map = new HashMap<String, Object>();
		return mongoTemplate.findOne(query, map.getClass(), PPARAM_COLLECTIONS);
	}

	@Override
	public String updateCodeByOrder(Integer lineId, String qrCode) {
		// 获取最新的一条记录
		Map<String, Object> nowData = findQrcodeIsEmpty(lineId);

		if (nowData == null) {
			return "无数据";
		}
		Query query = new Query(Criteria.where("rfid").is(nowData.get("rfid")));

		Update update = new Update();
		update.set("qrCode", qrCode);

		WriteResult wr = mongoTemplate.updateFirst(query, update, PPARAM_COLLECTIONS);

		System.out.println("mogoDB数据更新完成，行数为：" + wr.getN());
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return nowData.get("rfid").toString() + "时间 " + sf.format(nowData.get("time"));
	}

	@Override
	public List<Map<String, Object>> findList(Integer lineId) {
		Query query = new Query(Criteria.where("line").is(lineId + ""));
		Sort sort = new Sort(new Order(Direction.DESC, "time"));
		query.with(sort);
		query.skip(1).limit(10);
		Map<String, Object> map = new HashMap<String, Object>();
		List<Map<String, Object>> dataList = (List<Map<String, Object>>) mongoTemplate.find(query, map.getClass(),
				PPARAM_COLLECTIONS);
		System.out.println(dataList.toString());
		return dataList;
	}

	@Override
	public Map<String, Object> getParamBySerial(String qrCode) {
		// 根据二维码获取序列号
		Query query = new Query(Criteria.where("qrCode").is(qrCode));
		Map<String, Object> map = new HashMap<String, Object>();
		return mongoTemplate.findOne(query, map.getClass(), PPARAM_COLLECTIONS);
	}

	@Override
	public Map<String, Object> findPParamByLineId(Integer lineId) {
		Query query = new Query(Criteria.where("line").is("9152"));
		Sort sort = new Sort(new Order(Direction.DESC, "time")); // 结果集进行降序排
		query.with(sort);
		// query.skip(500).limit(1000);

		Map<String, Object> map = new HashMap<String, Object>();
		return mongoTemplate.findOne(query, map.getClass(), PPARAM_COLLECTIONS);
	}

	@Override
	public Map<String, Object> findQrcodeIsEmpty(Integer lineId) {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		// 获取当前班次时间
		/*TimeDeal baseTime = new TimeDeal(shiftDao);
		System.out.println(baseTime.getShift());
		Map<String, Date> timeDate = baseTime.getShiftTime(baseTime.getShift());
		Criteria criteria = new Criteria();
		try {
			criteria.andOperator(Criteria.where("line").is("9152"),
					Criteria.where("time").gte(timeDate.get("beginTime")).lte(timeDate.get("endTime")),
					Criteria.where("qrCode").is(null));
		} catch (Exception e) {

		}

		Query query = new Query(criteria);
		Sort sort = new Sort(new Order(Direction.ASC, "time")); // 结果集进行升序排
		query.with(sort);
		// query.skip(500).limit(1000);

		Map<String, Object> map = new HashMap<String, Object>();
		return mongoTemplate.findOne(query, map.getClass(), PPARAM_COLLECTIONS);*/
		return null;
	}

	/**
	 * mongo 日期查询isodate
	 * 
	 * @param dateStr
	 * @return
	 */
	public static Date dateToISODate(Date date) {
		// T代表后面跟着时间，Z代表UTC统一时间
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
		format.setCalendar(new GregorianCalendar(new SimpleTimeZone(0, "GMT")));
		String isoDate = format.format(date);
		try {
			return format.parse(isoDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}

	/** 时间格式(yyyy-MM-dd HH:mm:ss) */
	public final static String DATE_TIME_PATTERN = "yyyy-MM-dd HH:mm:ss";

	public static Date formatD(String dateStr) {
		return formatD(dateStr, DATE_TIME_PATTERN);
	}

	public static Date formatD(String dateStr, String format) {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
		Date ret = null;
		try {
			ret = simpleDateFormat.parse(dateStr);
		} catch (ParseException e) {
			//
		}
		return ret;
	}

	@Override
	public void bingingRfid(String qrCode, String rfid) {
		Query query = new Query(Criteria.where("rfid").is(rfid));
		Map<String, Object> map = new HashMap<String, Object>();
		map = mongoTemplate.findOne(query, map.getClass(), PPARAM_COLLECTIONS);

		Query qrQuery = new Query(Criteria.where("qrCode").is(qrCode));

		Update update = new Update().set("_id", new Date().getTime());
		for (String key : map.keySet()) {
			if (!key.equals("qrCode") && !key.equals("_id")) {
				update.set(key, map.get(key));
			}
		}
		BasePParameter param = new BasePParameter();
		mongoTemplate.upsert(qrQuery, update, param.getClass());
	}

	@Override
	public void bingingSomeRfid(List<Map<String, Object>> dataList) {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String time = "2018-11-25 20:40:00";
		Calendar c1 = Calendar.getInstance();

		int i = 0;
		try {
			c1.setTime(df.parse(time));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		for (Map<String, Object> dataMap : dataList) {
			i++;
			c1.add(Calendar.SECOND, 28 + i % 5);
			Query query = new Query(Criteria.where("rfid").is(dataMap.get("rfid")));
			Map<String, Object> map = new HashMap<String, Object>();
			map = mongoTemplate.findOne(query, map.getClass(), PPARAM_COLLECTIONS);

			BasePParameter param = new BasePParameter();
			Update update = new Update();

			if (dataMap.get("qrCode") == null) {
				update.set("qrCode", "");
				mongoTemplate.upsert(query, update, param.getClass());
				continue;
			} else {
				if (dataMap.get("qrCode").toString().equals("")) {
					update.set("qrCode", "");
					mongoTemplate.upsert(query, update, param.getClass());
					continue;
				}
				// 如果rfid没有qrcode则绑定qrcode
				if (map.get("qrCode") == null) {
					update.set("qrCode", dataMap.get("qrCode"));
					mongoTemplate.upsert(query, update, param.getClass());
				} else {
					Query qrQuery = new Query(Criteria.where("qrCode").is(dataMap.get("qrCode")));

					Map<String, Object> qrmap = new HashMap<String, Object>();
					qrmap = mongoTemplate.findOne(qrQuery, map.getClass(), PPARAM_COLLECTIONS);

					if (qrmap == null) {
						update.set("_id", new Date().getTime());
					}
					for (String key : map.keySet()) {
						if (!key.equals("qrCode") && !key.equals("_id")) {
							update.set(key, map.get(key));
						}
					}
					update.set("time", c1.getTime());
					mongoTemplate.upsert(qrQuery, update, param.getClass());
				}
			}
		}
	}

	@Override
	public List<String> checkIsExist(List<String> dataList) {
		List<String> resultList = new ArrayList<String>();
		Map<String, Object> map = new HashMap<String, Object>();
		for (String str : dataList) {
			Query qrQuery = new Query(Criteria.where("qrCode").is(str));

			Map<String, Object> qrmap = new HashMap<String, Object>();
			qrmap = mongoTemplate.findOne(qrQuery, map.getClass(), PPARAM_COLLECTIONS);

			if (qrmap == null) {
				resultList.add(str);
			}

		}
		return resultList;
	}

	@Override
	public List<Map<String, Object>> getQualtiyProcess(Integer lineId, String searchTime) {
		/*TimeDeal baseTime = new TimeDeal(shiftDao);
		Map<String, Date> timeDeall = baseTime.getDayPointTime(searchTime);

		// 获取该时间段所有产品的RFID
		ProdProductionLogDOExample prodExample = new ProdProductionLogDOExample();
		prodExample.createCriteria().andLineIdEqualTo(lineId).andCreateTimeBetween(timeDeall.get("beginTime"),
				timeDeall.get("endTime"));

		List<ProdProductionLogDO> prodList = this.productlogDao.selectByExample(prodExample);

		List<String> rfidList = new ArrayList<String>();
		for (ProdProductionLogDO prodDo : prodList) {
			rfidList.add(prodDo.getPlRfid());
		}

		Criteria criteria = new Criteria();
		try {
			criteria.andOperator(Criteria.where("line").is(lineId + ""), Criteria.where("rfid").in(rfidList),
					Criteria.where("time").gte(timeDeall.get("beginTime")).lte(timeDeall.get("endTime")));
		} catch (Exception e) {
			e.printStackTrace();
		}
		Query query = new Query(criteria);
		Sort sort = new Sort(new Order(Direction.ASC, "time")); // 结果集进行升序排
		query.with(sort);

		Map<String, Object> map = new HashMap<String, Object>();
		List<Map<String, Object>> resultLsit = (List<Map<String, Object>>) mongoTemplate.find(query, map.getClass(),
				PPARAM_COLLECTIONS);*/
		return null;
	}

	@Override
	public void fillData(String beginTime, String tuhao, Integer lineId, String orderCode) throws ServiceException {
		
	}

	// 默认给数据填充一个完整的输入
	public List<String> getCompleteRfid(String tuhao) {
		
		return null;
	}

	// 是否缺少数据
	public boolean isEmpty(Map<String, Object> dataMap, String paramNmae) {
		boolean flag = false;
		for (String key : dataMap.keySet()) {
			if (key.equals(paramNmae)) {
				flag = true;
				return flag;
			}
		}
		return flag;
	}

	@Override
	public List<Map<String, Object>> queryRfidData(List<String> rfids, String orderBy) {
		Query query = new Query(Criteria.where("rfid").in(rfids));

		Sort sort = null;
		if ("desc".equals(orderBy)) {
			sort = new Sort(new Order(Direction.DESC, "rfid")); // 结果集进行降序排
		} else if ("asc".equals(orderBy)) {
			sort = new Sort(new Order(Direction.ASC, "rfid")); // 结果集进行降序排
		}
		query.with(sort);

		Map<String, Object> map = new HashMap<String, Object>();
		return (List<Map<String, Object>>) mongoTemplate.find(query, map.getClass(), PPARAM_COLLECTIONS);
	}

	// 获取项为空的数据
	public Map<String, Object> dealData(String key, List<Map<String, Object>> tempList, String rfid) {
		Map<String, Object> dataMap = null;

		for (Map<String, Object> tempData : tempList) {
			if (tempData.get(key) != null) {
				System.out.println(tempData);
				dataMap = (Map<String, Object>) tempData.get(key);

				if (key.equals("gudingjieyaji")) {
					dataMap.put("SN1", "");
					dataMap.put("SN2", "");
				}

				if (key.equals("houjia")) {
					dataMap.put("SN1", "");
				}

				dataMap.put("RFID", rfid);

				return dataMap;
			}
		}
		return dataMap;
	}

	// 根据rfid,填充数据
	public void updateMongoDB(String rfid, String key, Map<String, Object> paramData) {
		Query qrQuery = new Query(Criteria.where("rfid").is(rfid));

		BasePParameter param = new BasePParameter();
		Update update = new Update();
		update.set(key, paramData);
		mongoTemplate.upsert(qrQuery, update, param.getClass());
	}

	@Override
	public void materialBind(List<Map<String, Object>> bindList, String time, Integer lineId) {
		// 1. 产品图号，2.轴编号，3.外星轮编号，4.轴叉编号
		// 将bindList的数据进行反转 excel中的按时间的升序排列， 后台处理的按照时间降序排列
		
	}

	public void dealBindData(Map<String, Object> mongoMap, Map<String, Object> dataMap) {
		// 1.如果轴，外星轮，轴叉
		if (dataMap.get("var1") != null) {
			if (!dataMap.get("var1").equals("")) {
				Map<String, Object> dealMap = (Map<String, Object>) mongoMap.get("gudingjieyaji");
				if (dealMap != null) {
					dealMap.put("SN1", dataMap.get("var1"));
					System.out.println("gudingjieyaji  SN1" + mongoMap.get("rfid") + " " + dataMap.get("var1"));
					updateMongoDB(mongoMap.get("rfid").toString(), "gudingjieyaji", dealMap);
				}
			}
		}
		if (dataMap.get("var2") != null) {
			if (!dataMap.get("var2").equals("")) {
				Map<String, Object> dealMap = (Map<String, Object>) mongoMap.get("gudingjieyaji");
				if (dealMap != null) {
					dealMap.put("SN2", dataMap.get("var2"));
					System.out.println("gudingjieyaji  SN2" + mongoMap.get("rfid") + " " + dataMap.get("var2"));
					updateMongoDB(mongoMap.get("rfid").toString(), "gudingjieyaji", dealMap);
				}
			}
		}
		if (dataMap.get("var3") != null) {
			if (!dataMap.get("var3").equals("")) {
				Map<String, Object> dealMap = (Map<String, Object>) mongoMap.get("houjia");
				if (dealMap != null) {
					dealMap.put("SN1", dataMap.get("var3"));
					System.out.println("houjia  SN1" + mongoMap.get("rfid") + " " + dataMap.get("var3"));
					updateMongoDB(mongoMap.get("rfid").toString(), "houjia", dealMap);
				}
			}
		}

	}

	@Override
	public void getProduceDataByLine(String time, Integer line) {
		

	}

	@Override
	public Map<String, Object> isCheckOk(String rfid, String factoryCode, Integer lineId) {
		// TODO Auto-generated method stub
		/*Map<String, Object> resultMap = new HashMap<String, Object>();
		int status = 0;

		resultMap.put("status", 0);
		resultMap.put("value", "成功");
		Map<String, Object> rfData = findPParamByRFIDAndLine(rfid, lineId+"");
		if (rfData == null) {
			return resultMap;
		}

		DictDataDOExample dictDataExample = new DictDataDOExample();
		dictDataExample.createCriteria().andNote2EqualTo(factoryCode);
		dictDataExample.setOrderByClause("dd_seq asc");
		List<DictDataDO> proceList = this.dictDataDao.selectByExample(dictDataExample);

		// 判断是否存在全部工序
		for (DictDataDO dictData : proceList) {
			if (!isExistProcedure(dictData.getDdCode(), rfData)) {
				// 如果不存在返回该工序名称
				resultMap.put("status", 2);
				resultMap.put("value", "【" + dictData.getDdName() + "】工序没有数据");

				return resultMap;
			}
		}

		for (String key : rfData.keySet()) {
			System.out.println(key);
			if (rfData.get(key) != null) {
				if (rfData.get(key).getClass().getName().equals("java.util.LinkedHashMap")) {

					Map<String, Object> paramMap = (Map<String, Object>) rfData.get(key);
					System.out.println(paramMap);
					if (factoryCode.equals("02D")) {
						if (paramMap.get("SIGNAL_OK").toString().equals("2")) {
							resultMap.put("status", 1);
							resultMap.put("value", "");
							for (DictDataDO dictData : proceList) {
								if (key.equals(dictData.getDdCode())) {
									resultMap.put("value", "【" + dictData.getDdName() + "】工序不合格");
								}
							}
							return resultMap;
						}
					}

					if (factoryCode.equals("04D")) {
						
						 * if(paramMap.get("Result").toString().equals("0")){ return false; }
						 
					}

				}
			}
		}*/

		return null;
	}

	// 判断是否存在该工序
	public boolean isExistProcedure(String procedure, Map<String, Object> rfData) {
		boolean flag = false;
		for (String key : rfData.keySet()) {
			if (procedure.toLowerCase().equals(key.toLowerCase())) {
				flag = true;
				break;
			}
		}
		return flag;
	}

	@Override
	public Map<String, Object> dataReverSearch(Integer type, String value, Integer fcId) {
		// type 1:轴， 2：外星轮，3：轴叉
		Map<String, Object> resultMap = null;
		if (type == 0)
			return null;
		String[] params = new String[] {};
		if (fcId == 3) {
			params = new String[] { "gudingjieyaji.SN1", "gudingjieyaji.SN2", "houjia.SN1" };
		} else if (fcId == 2) {
			params = new String[] { "guDingJieYaRu.gdj_axisCode", "guDingJieYaRu.gdj_forCode", "houjia.tulip_code" };
		} else if (fcId == 1) {
			params = new String[] { "gudingjieyaji.QR_Code" };
		}

		String searchParam = "";
		Criteria criteria = new Criteria();

		if (params.length > 0) {
			searchParam = params[type - 1];

			criteria = Criteria.where(searchParam).regex("^" + value);

			Query query = new Query(criteria);
			Map<String, Object> map = new HashMap<String, Object>();

			resultMap = mongoTemplate.findOne(query, map.getClass(), PPARAM_COLLECTIONS);
		}
		return resultMap;
	}

	@Override
	public LineRFID getProductStatus(String rfid, Integer lineId) {
		// TODO Auto-generated method stub
		LineRFID resultData = new LineRFID();
		resultData.setStatus(true);
		resultData.setMessage("");
		
		List<ProdProcess> resultProcessList = new ArrayList<ProdProcess>();
		Map<String, Object> rfData = findPParamByRFIDAndLine(rfid, lineId+"");
		if (rfData == null) {
			resultData.setMessage("该RFID 绑定的数据为空");
			return resultData;
		}

		SysProcessPOExample processExample = new SysProcessPOExample();
		processExample.createCriteria().andLineIdEqualTo(lineId).andSpCheckEqualTo(true);
		processExample.setOrderByClause("sp_order asc");
		
		List<SysProcessPO> processList = this.processDao.selectByExample(processExample);
		
		if(processList.size() == 0){
			resultData.setMessage("未查询到产线需要校验的工序");
			return resultData;
		}

		// 判断是否存在全部工序 status 0不合格  1合格  2无数据
		for (SysProcessPO processData : processList) {
			
			ProdProcess processDo = new ProdProcess();
			processDo.setProcessCode(processData.getSpCode());
			processDo.setProcessName(processData.getSpName());
			processDo.setProcessStatus(1);
			
			if (!isExistProcedure(processData.getSpCode(), rfData)) {
				// 如果不存在返回该工序名称
				resultData.setStatus(false);
				resultData.setMessage("存在无数据工序");
				
				processDo.setProcessStatus(2);
			}
			resultProcessList.add(processDo);
		}
		
		//获取判断合格的点位信息
		List<ProdProcessParam> paramList = this.ParamDao.getCheckParam(lineId);
		
		//保存不合格工序
		List<String> errorList = new ArrayList<String>();
		
		for (String key : rfData.keySet()) {
			System.out.println(key);
			if (rfData.get(key) != null) {
				if (rfData.get(key).getClass().getName().equals("java.util.LinkedHashMap")) {

					Map<String, Object> paramMap = (Map<String, Object>) rfData.get(key);
					
					//获取判断是否合格的属性。
					String paramValue = getCheckParam(paramList, key);
					
					if(paramValue != null){
						if(paramMap.get(paramValue) != null){
							if(paramMap.get(paramValue).toString().equals("2")){
								errorList.add(key);
							}
						}
					}
				}
			}
		}
		
		//将不合格工序的状态改为0
		for(ProdProcess prodProcessDo : resultProcessList){
			for(String product : errorList){
				if(prodProcessDo.getProcessCode().equals(product)){
					
					resultData.setStatus(false);
					resultData.setMessage("存在不合格工序");
					
					prodProcessDo.setProcessStatus(0);
				}
			}
		}
		resultData.setLineProcess(resultProcessList);

		return resultData;
	}
	
	public String getCheckParam(List<ProdProcessParam> paramList,String processCode){
		String param = null;
		
		for(ProdProcessParam paramData:paramList){
			if(paramData.getProcessCode().equals(processCode)){
				param = paramData.getParamCode();
			}
		}
		
		return param;
	}

	@Override
	public List<Map<String, Object>> getProcessData(String rfid, Integer lineId) {
		// TODO Auto-generated method stub
		List<Map<String,Object>> resultList = new ArrayList<Map<String,Object>>();
		
		Map<String, Object> rfData = findPParamByRFIDAndLine(rfid, lineId+"");
		if (rfData == null) {
			return null;
		}

		SysProcessPOExample processExample = new SysProcessPOExample();
		processExample.createCriteria().andLineIdEqualTo(lineId).andSpShowEqualTo(true);
		processExample.setOrderByClause("sp_order asc");
		
		//查询产品需要显示的工序
		List<SysProcessPO> processList = this.processDao.selectByExample(processExample);
		
		if(processList.size() == 0){
			return null;
		}
		
		for(SysProcessPO processDo:processList){
			Map<String,Object> processMap = new HashMap<String,Object>();
			processMap.put("processName", processDo.getSpName());
			processMap.put("processCode", processDo.getSpCode());
			processMap.put("paramList", new ArrayList());
			
			
			//判断该工序是否有值
			Map<String, Object> processData = (Map<String, Object>) rfData.get(processDo.getSpCode());
			if(processData == null){
				break;
			}
			
			//查询所有的工序参数
			SysProcessParamPOExample paramExample = new SysProcessParamPOExample();
			paramExample.createCriteria().andSpIdEqualTo(processDo.getSpId()).andPpShowEqualTo(true);
			paramExample.setOrderByClause("pp_order asc");
			List<SysProcessParamPO> paramList = this.processParamDao.selectByExample(paramExample);
			
			List<Map<String,Object>> paramValueList = new ArrayList<Map<String,Object>>();
			
			for(SysProcessParamPO paramDo:paramList){
				Map<String,Object> paramMap = new HashMap<String,Object>();
				paramMap.put("paramName", paramDo.getPpName());
				paramMap.put("paramCode", paramDo.getPpCode());
				
				Map<String,Object> paramValueMap = getParamValue(processData,paramDo.getPpCode(),paramDo.getPpType());
				
				paramMap.put("paramValue", paramValueMap.get("dealValue"));
				paramMap.put("paramRealValue", paramValueMap.get("realValue"));
				
				paramValueList.add(paramMap);
			}
			
			processMap.put("paramList", paramValueList);
			
			resultList.add(processMap);
		}
		
		
		return resultList;
	}
	
	/**
	 * 查询指定参数的的值
	 * @param paramData  工序的所有参数
	 * @param paramCode  需要查询的工序编号
	 * @param type 数据类型
	 * @return
	 */
	public Map<String,Object> getParamValue(Map<String,Object> paramData,String paramCode,String type){
		Map<String,Object> resultMap = new HashMap<String,Object>();
		String resultValue = "";
		String realValue = "";
		
		for(String key:paramData.keySet()){
			if(paramCode.equals(key)){
				realValue = paramData.get(key)+"";
				if(type.equals("")){
					resultValue = paramData.get(key)+"";
				}else if(type.equals("String")){
					resultValue = paramData.get(key)+"";
				}else if(type.equals("int")){
					resultValue = paramData.get(key)+"";
				}else if(type.equals("float")){
					DecimalFormat df = new DecimalFormat("##.00");
					resultValue = df.format(Double.parseDouble(paramData.get(key).toString()));
				}else if(type.equals("bit")){
					if(paramData.get(key).equals("2")){
						resultValue = "不合格";
					}else{
						resultValue = "合格";
					}
				}
			}
		}
		resultMap.put("dealValue", resultValue);
		resultMap.put("realValue", realValue);
		
		return resultMap;
	}

}
