package com.uspring.sdsmesplus.entity.vo;

/**
 * @author liubo@uspring.cn
 * @Description:
 * @date 2020/5/23 14:46
 */
public class MatBatchVO {

    private String matBatchNo;
    private String matName;
    private String matCount;

    public String getMatName() {
        return matName;
    }

    public void setMatName(String matName) {
        this.matName = matName;
    }

    public String getMatCount() {
        return matCount;
    }

    public void setMatCount(String matCount) {
        this.matCount = matCount;
    }

    public String getMatBatchNo() {
        return matBatchNo;
    }

    public void setMatBatchNo(String matBatchNo) {
        this.matBatchNo = matBatchNo;
    }
}
