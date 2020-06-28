package com.uspring.sdsmesplus.entity.vo;

import java.util.List;

/**
 * @author liubo@uspring.cn
 * @Description:
 * @date 2020/5/23 14:46
 */
public class BackMatBatchCodeVO {

    private String matCode;
    private List<MatBatchCodeVO> matBatchNos;
	public String getMatCode() {
		return matCode;
	}
	public void setMatCode(String matCode) {
		this.matCode = matCode;
	}
	public List<MatBatchCodeVO> getMatBatchNos() {
		return matBatchNos;
	}
	public void setMatBatchNos(List<MatBatchCodeVO> matBatchNos) {
		this.matBatchNos = matBatchNos;
	}
	@Override
	public String toString() {
		return "BackMatBatchCodeVO [matCode=" + matCode + ", matBatchNos=" + matBatchNos + "]";
	}
   
}
