/**
 * @Title: PrinterService.java
 * @Package com.uspring.sdsmesplus.mq
 * @Description: 打印服务类
 * @author lihuan lihuanwk@126.com
 * @date 2019年6月12日 上午12:35:07
 * @version V1.0
 */
package com.uspring.sdsmesplus.mq;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.uspring.sdsmesplus.wms.entity.Package;


/** 
 * @ClassName: PrinterService 
 * @Description: 打印机服务类
 * @author lihuan lihuan@uspring.cn 
 * @date 2019年6月21日 下午3:29:03 
 *  
 */
@Service
public class PrinterServiceImpl implements PrinterService{
	
	private final Logger logger = LoggerFactory.getLogger(PrinterServiceImpl.class);
	
	private final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	
	@Autowired
	private AMQPService amqpService;

	@Override
	public void printMatBoxBarcode(Package pkg, int lineId) {
		PrintMessage msgObj = new PrintMessage();
		msgObj.setCmd("matbox");
		msgObj.setTimestamp((new Date()).getTime());
		
		BoxMessagData msgData = new BoxMessagData();
		msgData.setBoxBarcode(pkg.getBoxBarcode());
		msgData.setSapCode(pkg.getMatCode());
		msgData.setProdCode(pkg.getMatCode());
		msgData.setProdName(pkg.getMatName());
		msgData.setTuhao(pkg.getMatTuhao());
		msgData.setCustomerMtCode(pkg.getCustomerMatCode());
		msgData.setBatchNo(pkg.getMatBatchNo());
		msgData.setLuhao(pkg.getMatFurnaceNo());
		msgData.setGlevel(pkg.getMatGlevel());
		msgData.setCount(pkg.getBoxQuan().intValue());
		msgData.setCheckPerson(pkg.getBoxInspector());
		if(pkg.getProdDate() != null)
			msgData.setDate(sdf.format(pkg.getProdDate()));
		
		msgObj.setData(msgData);
		
		String msgStr = JSON.toJSONString(msgObj);
		String topic = "mes." + lineId + ".printer";
		
		logger.debug("send mq message, topic: {}, msg: {}", topic, msgStr);
		amqpService.sendMessage(topic, msgStr);
	}

	@Override
	public void printFPBarcode(String prodCode, String customerCode, int lineId) {
		PrintMessage msgObj = new PrintMessage();
		msgObj.setCmd("fpBarcode");
		msgObj.setTimestamp((new Date()).getTime());
		
		FPBarcodeMessageData msgData = new FPBarcodeMessageData();
		msgData.setProdCode(prodCode);
		msgData.setCustomerCode(customerCode);
		msgObj.setData(msgData);
		String msgStr = JSON.toJSONString(msgObj);
		String topic = "mes." + lineId + ".printer";
		
		logger.debug("send mq message, topic: {}, msg: {}", topic, msgStr);
		amqpService.sendMessage(topic, msgStr);
	}
}
