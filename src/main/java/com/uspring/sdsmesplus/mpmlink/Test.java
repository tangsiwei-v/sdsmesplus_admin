package com.uspring.sdsmesplus.mpmlink;


import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import com.uspring.sdsmesplus.exception.ServiceException;



public class Test {
	
	public static void main(String[] args) {

		List<ProcessStep> processSteps = new ArrayList<>();
//		String filePath = getFilePathHelp(prodCode,lineCode);
		String filePath ="D:\\20190717\\01337629171_0000003121_20190717_02D.xml";
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
					String matCode=element2.attribute("PartNumber").getText()== null ? ""
							:element2.attribute("PartNumber").getText();
							
					bom.setMaterialCode(matCode);
					
					String matUnit=element2.attribute("Qty").getText()== null ? "": element2.attribute("Qty").getText();
//					bom.setMaterialUnit(Double.parseDouble(matUnit));
					
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
		System.out.println(processSteps.get(0).getDevCodes().get(0)+"hhhhh"+processSteps.get(0).getMaterials().get(0).getMaterialCode());
		
	}
	
	}              

