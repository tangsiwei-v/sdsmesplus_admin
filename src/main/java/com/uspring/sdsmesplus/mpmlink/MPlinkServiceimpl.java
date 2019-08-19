package com.uspring.sdsmesplus.mpmlink;

import java.io.File;
import java.rmi.ServerException;
import java.util.ArrayList;

import java.util.List;


import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.uspring.sdsmesplus.dao.generate.SysLinePODao;
import com.uspring.sdsmesplus.entity.po.SysLinePO;
import com.uspring.sdsmesplus.entity.po.SysLinePOExample;
import com.uspring.sdsmesplus.exception.ServiceException;
import com.uspring.sdsmesplus.mpmlink.dao.ProcessPlanDao;


/** * @author  作者 E-mail:chengtengfei
 * @date 创建时间：2019年6月25日 下午1:00:36 
 * @version 1.0 * @parameter  
 * @since  
 * @return  
*/
@Service
public class MPlinkServiceimpl implements MpmlinkService{
	

	@Value("#{prop.mpmlink_xml_dirt}")
	private String DEFULT_MPLINK_XML;
	
	@Autowired
	private ProcessPlanDao processPlanDao;
	
	@Autowired
	private SysLinePODao sysLinePODao;
	
	@Override
	public List<BomMaterial> queryBom(String prodCode, String lineCode) throws Exception {
		List<BomMaterial> boms = new ArrayList<BomMaterial>();
		
		
		// String filePath = getFilePathHelp(prodCode,lineCode);
		String filePath ="D:\\01891013991_0000010486_20190719_02D.xml";		
		File inputXml = new File(filePath);
		if (inputXml.exists()) {
			
			SAXReader saxReader = new SAXReader();
			Document document = null;
			try {
				document = saxReader.read(inputXml);
			} catch (DocumentException e) {
				throw new ServiceException(e);
			}
			// SAX生成和解析XML文档
			Element rootElement = document.getRootElement(); // 获得根节点
			Element element = rootElement.element("Part");
//			String partSimpleCode = element.attribute("SDSLogisticNumber").getText()== null ? ""
//					: element.attribute("SDSLogisticNumber").getText();
			List<Element> elemenets = element.elements("Part");
			for (Element ele : elemenets) {
				BomMaterial bom = new BomMaterial();
				bom.setMaterialCode(ele.attribute("PartNumber").getText()== null ? "": ele.attribute("PartNumber").getText());
				bom.setMaterialUnit(Double.parseDouble(ele.attribute("Qty").getText()== null ? "": ele.attribute("Qty").getText()));
				boms.add(bom);
			}
			
		}
		return boms;
	}

	@Override
	public List<ProcessStep> queryProcessStep(String prodCode, String lineCode) throws Exception {
		List<ProcessStep> processSteps = new ArrayList<>();
//		String filePath = getFilePathHelp(prodCode,lineCode);
		String filePath ="D:\\20190716\\01891013991_0000003106_20190717_02D(2).xml";
		File inputXml = new File(filePath);
		if (inputXml.exists()) {
			SAXReader saxReader = new SAXReader();
			Document document = null;
			try {
				document = saxReader.read(inputXml);
			} catch (DocumentException e) {
				throw new ServiceException(e);
			}
			// SAX生成和解析XML文档
			Element rootElement = document.getRootElement(); // 获得根节点
			Element element = rootElement.element("RoutePlan");
			List<Element> list = element.elements("RouteStep");
			for (Element routeStep : list) {
				ProcessStep pro = new ProcessStep();
				// 工序名称
				String worksequenceName = routeStep.attribute("RouteStepDesc").getText() == null ? ""
						: routeStep.attribute("RouteStepDesc").getText();
				pro.setProcName(worksequenceName);
				String stepNo = routeStep.attribute("RouteStepNO").getText() == null ? ""
						: routeStep.attribute("RouteStepNO").getText();
				//工序编号
				pro.setProcCode(stepNo);

				List<BomMaterial> boms = new ArrayList<BomMaterial>();
				
				List<Element> listBomsElement =routeStep.element("Parameters_Resources").elements("Parameter");
				for (Element element2 : listBomsElement) {
					BomMaterial bom = new BomMaterial();
					String matCode=element2.attribute("SDSLogisticNumber").getText()== null ? ""
							:element2.attribute("SDSLogisticNumber").getText();
							
					bom.setMaterialCode(matCode);
					
					String matUnit=element2.attribute("Qty").getText()== null ? "": element2.attribute("Qty").getText();
					bom.setMaterialUnit(Double.parseDouble(matUnit));
					
					boms.add(bom);
				}
				
				List<Element> listDecElement =routeStep.element("Parameters_Equipment").elements("Parameter");
				List<String> devcodes = new ArrayList<>();
				if(listDecElement.size()>0) {
					for (Element element2 : listDecElement) {
						String devCode=listDecElement.get(0).attribute("DeveceID").getText()== null ? ""
								:listDecElement.get(0).attribute("DeveceID").getText();
						devcodes.add(devCode);			
					}
					pro.setDevCodes(devcodes);
					}
					
				
				pro.setMaterials(boms);
				processSteps.add(pro);
			}
		}
		return processSteps;
	}
    
	String getFilePathHelp(String prodCode,String lineCode) {
	
		String path=processPlanDao.queryBom(prodCode, lineCode);
		return DEFULT_MPLINK_XML+path;
			
	}

	@Override
	public List<ProcessStep> queryProcessSteps(String prodCode, Integer lineId) throws Exception {
		List<ProcessStep> processSteps = new ArrayList<>();
		
		SysLinePOExample sysLinePOExample = new SysLinePOExample();
		sysLinePOExample.createCriteria().andLineIdEqualTo(lineId);
		List<SysLinePO> lists = sysLinePODao.selectByExample(sysLinePOExample);
		
		if(lists.size() < 0) 
			throw new ServerException("暂无数据");
		String lineMpmlinkCode = lists.get(0).getLineMpmlinkCode();
		
		//String filePath = getFilePathHelp(prodCode,lineMpmlinkCode);
		String filePath ="D:\\20190716\\01891013991_0000003106_20190717_02D(2).xml";
		File inputXml = new File(filePath);
		if (inputXml.exists()) {
			SAXReader saxReader = new SAXReader();
			Document document = null;
			try {
				document = saxReader.read(inputXml);
			} catch (DocumentException e) {
				throw new ServiceException(e);
			}
			// SAX生成和解析XML文档
			Element rootElement = document.getRootElement(); // 获得根节点
			Element element = rootElement.element("RoutePlan");
			List<Element> list = element.elements("RouteStep");
			for (Element routeStep : list) {
				ProcessStep pro = new ProcessStep();
				// 工序名称
				String worksequenceName = routeStep.attribute("RouteStepDesc").getText() == null ? ""
						: routeStep.attribute("RouteStepDesc").getText();
				pro.setProcName(worksequenceName);
				String stepNo = routeStep.attribute("RouteStepNO").getText() == null ? ""
						: routeStep.attribute("RouteStepNO").getText();
				//工序编号
				pro.setProcCode(stepNo);

				List<BomMaterial> boms = new ArrayList<BomMaterial>();
				
				List<Element> listBomsElement =routeStep.element("Parameters_Resources").elements("Parameter");
				for (Element element2 : listBomsElement) {
					BomMaterial bom = new BomMaterial();
					String matCode=element2.attribute("SDSLogisticNumber").getText()== null ? ""
							:element2.attribute("SDSLogisticNumber").getText();
							
					bom.setMaterialCode(matCode);
					
					String matUnit=element2.attribute("Qty").getText()== null ? "": element2.attribute("Qty").getText();
					bom.setMaterialUnit(Double.parseDouble(matUnit));
					
					boms.add(bom);
				}
				
				List<Element> listDecElement =routeStep.element("Parameters_Equipment").elements("Parameter");
				List<String> devcodes = new ArrayList<>();
				if(listDecElement.size()>0) {
					for (Element element2 : listDecElement) {
						String devCode=listDecElement.get(0).attribute("DeveceID").getText()== null ? ""
								:listDecElement.get(0).attribute("DeveceID").getText();
						devcodes.add(devCode);			
					}
					pro.setDevCodes(devcodes);
					}
					
				
				pro.setMaterials(boms);
				processSteps.add(pro);
			}
		}
		return processSteps;
	}
}
