/**
 * @Title: PrintMessage.java 
 * @Package com.uspring.natiefu.mes.mq 
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author lihuan lihuanwk@126.com
 * @date 2019年6月24日 上午10:46:51 
 * @version V1.0 
 */
package com.uspring.sdsmesplus.mq;

/** 
 * @ClassName: PrintMessage 
 * @Description: 打印消息类
 * @author lihuan lihuan@uspring.cn 
 * @date 2019年6月24日 上午10:46:51 
 *  
 */
public class PrintMessage {

	private String cmd;
	
	private Object data;
	
	private long timestamp;
	
	public String getCmd() {
		return cmd;
	}

	public void setCmd(String cmd) {
		this.cmd = cmd;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}
}
