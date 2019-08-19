/**
 * @Title: AMQPService.java 
 * @Package com.uspring.cn.opcengine.mq 
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author lihuan lihuanwk@126.com
 * @date 2018年7月21日 下午6:04:11 
 * @version V1.0 
 */
package com.uspring.sdsmesplus.mq;

import java.io.IOException;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.rabbitmq.client.AMQP;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

/** 
 * @ClassName: AMQPService 
 * @Description: AMQP消息队列服务类
 * @author lihuan lihuan@uspring.cn 
 * @date 2018年7月21日 下午6:04:11 
 *  
 */
@Component
public class AMQPService {
	
	@Value("#{prop.rabbitmq_connect_string}")
	private String connStr;
	
	private final String exchangeName = "amq.topic";
	
	private final Logger logger = LoggerFactory.getLogger(AMQPService.class);
	
	private Connection conn = null;
	private Channel channel = null;
	
	@PostConstruct
	public void connectInit(){
		ConnectionFactory factory = new ConnectionFactory();
		try {
			factory.setUri(connStr);
			factory.setAutomaticRecoveryEnabled(true);
			conn = factory.newConnection();
			channel = conn.createChannel();
			
			logger.info("AMQP connect success.");
		} catch (Exception e) {
			logger.error("AMQP connect failed.", e);
		} 
	}
	
	public boolean sendMessage(String topic, String msg){
		try {
			channel.basicPublish(exchangeName, topic,
			        new AMQP.BasicProperties.Builder()
			         .contentType("text/plain")
			         .deliveryMode(2)
			         .priority(1)
			         .build(),
						msg.getBytes("UTF-8"));
			return true;
		} catch (Exception e) {
			logger.error("AMQP publish failed.", e);
			return false;
		}
	}
	
	public void close(){
		try {
			channel.close();
			conn.close();
		} catch (Exception e) {
			logger.error("AMQP close failed.", e);
		}
	}
	
	public void cleanMsgQueue(String queueName){
		try {
			channel.queuePurge(queueName);
		} catch (IOException e) {
			logger.error("AMQP connect failed.", e);
		}
	}
}
