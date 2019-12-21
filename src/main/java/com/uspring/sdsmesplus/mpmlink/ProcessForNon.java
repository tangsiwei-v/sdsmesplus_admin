package com.uspring.sdsmesplus.mpmlink;

import java.util.List;

/**
 * * @author 作者 E-mail:
 * 
 * @date 创建时间：2019年10月12日 上午11:25:52
 * @version 1.0 * @parameter
 * @since
 * @return
 */
public class ProcessForNon {

	private String RoutId;
	private List<ProcessStep> process;



	public void setRoutId(String routId) {
		RoutId = routId;
	}

	public List<ProcessStep> getProcess() {
		return process;
	}

	public void setProcess(List<ProcessStep> process) {
		this.process = process;
	}

	@Override
	public String toString() {
		return "ProcessForNon [RoutId=" + RoutId + ", process=" + process + "]";
	}

	public String getRoutId() {
		return RoutId;
	}

}
