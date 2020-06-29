package com.uspring.sdsmesplus.entity.vo;

/**
 * @author liubo@uspring.cn
 * @Description:
 * @date 2020/5/23 14:46
 */
public class MatBatchCodeVO {

    private String matCode;
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
    public String getMatCode() {
        return matCode;
    }

    public void setMatCode(String matCode) {
        this.matCode = matCode;
    }

    public String getMatBatchNo() {
        return matBatchNo;
    }

    public void setMatBatchNo(String matBatchNo) {
        this.matBatchNo = matBatchNo;
    }
}
