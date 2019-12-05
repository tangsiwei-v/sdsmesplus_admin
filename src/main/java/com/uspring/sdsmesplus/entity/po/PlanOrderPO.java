package com.uspring.sdsmesplus.entity.po;

import java.util.Date;

import org.springframework.util.StringUtils;

public class PlanOrderPO {
    private Integer poId;

    private String fcCode;

    private String poCode;

    private String prodCode;

    private String prodNumber;

    private String prodName;

    private String prodTuhao;

    private String customerCode;

    private String poCustMatcode;

    private String poCustMatdesc;

    private String poCustMatdesc2;

    private String poProdVersion;

    private Date poStartDate;

    private Date poStartTime;

    private Date poEndDate;

    private Date poEndTime;

    private Date poStartDatetime;

    private Date poEndDatetime;

    private Integer poCount;

    private String poCountUnit;

    private Integer lineId;

    private Integer vsmId;

    private String poStatus;

    private Date createTime;

    private Date updateTime;
    
    private String lineName;
    
    private String shopName;
    
    private String fcName;

    public Integer getPoId() {
        return poId;
    }

    public void setPoId(Integer poId) {
        this.poId = poId;
    }

    public String getFcCode() {
        return fcCode;
    }

    public void setFcCode(String fcCode) {
        this.fcCode = fcCode == null ? null : fcCode.trim();
    }

    public String getPoCode() {
        return poCode;
    }

    public void setPoCode(String poCode) {
        this.poCode = poCode == null ? null : poCode.trim();
    }

    public String getProdCode() {
        return prodCode;
    }

    public void setProdCode(String prodCode) {
        this.prodCode = prodCode == null ? null : prodCode.trim();
    }

    public String getProdNumber() {
        return prodNumber;
    }

    public void setProdNumber(String prodNumber) {
        this.prodNumber = prodNumber == null ? null : prodNumber.trim();
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName == null ? null : prodName.trim();
    }

    public String getProdTuhao() {
        return prodTuhao;
    }

    public void setProdTuhao(String prodTuhao) {
        this.prodTuhao = prodTuhao == null ? null : prodTuhao.trim();
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode == null ? null : customerCode.trim();
    }

    public String getPoCustMatcode() {
        return poCustMatcode;
    }

    public void setPoCustMatcode(String poCustMatcode) {
        this.poCustMatcode = poCustMatcode == null ? null : poCustMatcode.trim();
    }

    public String getPoCustMatdesc() {
        return poCustMatdesc;
    }

    public void setPoCustMatdesc(String poCustMatdesc) {
        this.poCustMatdesc = poCustMatdesc == null ? null : poCustMatdesc.trim();
    }

    public String getPoCustMatdesc2() {
        return poCustMatdesc2;
    }

    public void setPoCustMatdesc2(String poCustMatdesc2) {
        this.poCustMatdesc2 = poCustMatdesc2 == null ? null : poCustMatdesc2.trim();
    }

    public String getPoProdVersion() {
        return poProdVersion;
    }

    public void setPoProdVersion(String poProdVersion) {
        this.poProdVersion = poProdVersion == null ? null : poProdVersion.trim();
    }

    public Date getPoStartDate() {
        return poStartDate;
    }

    public void setPoStartDate(Date poStartDate) {
        this.poStartDate = poStartDate;
    }

    public Date getPoStartTime() {
        return poStartTime;
    }

    public void setPoStartTime(Date poStartTime) {
        this.poStartTime = poStartTime;
    }

    public Date getPoEndDate() {
        return poEndDate;
    }

    public void setPoEndDate(Date poEndDate) {
        this.poEndDate = poEndDate;
    }

    public Date getPoEndTime() {
        return poEndTime;
    }

    public void setPoEndTime(Date poEndTime) {
        this.poEndTime = poEndTime;
    }

    public Date getPoStartDatetime() {
        return poStartDatetime;
    }

    public void setPoStartDatetime(Date poStartDatetime) {
        this.poStartDatetime = poStartDatetime;
    }

    public Date getPoEndDatetime() {
        return poEndDatetime;
    }

    public void setPoEndDatetime(Date poEndDatetime) {
        this.poEndDatetime = poEndDatetime;
    }

    public Integer getPoCount() {
        return poCount;
    }

    public void setPoCount(Integer poCount) {
        this.poCount = poCount;
    }

    public String getPoCountUnit() {
        return poCountUnit;
    }

    public void setPoCountUnit(String poCountUnit) {
        this.poCountUnit = poCountUnit == null ? null : poCountUnit.trim();
    }

    public Integer getLineId() {
        return lineId;
    }

    public void setLineId(Integer lineId) {
        this.lineId = lineId;
    }

    public Integer getVsmId() {
        return vsmId;
    }

    public void setVsmId(Integer vsmId) {
        this.vsmId = vsmId;
    }

    public String getPoStatus() {
        return poStatus;
    }

    public void setPoStatus(String poStatus) {
        this.poStatus = poStatus == null ? null : poStatus.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
    public boolean equals(Object obj) {
        if(this == obj){
            return true;//地址相等
        }

        if(obj == null){
            return false;//非空性：对于任意非空引用x，x.equals(null)应该返回false。
        }

        if(obj instanceof PlanOrderPO){
        	PlanOrderPO other = (PlanOrderPO) obj;
            //需要比较的字段相等，则这两个对象相等
            if(equalsStr(this.poCode, other.poCode)){
                return true;
            }
        }

        return false;
    }
    
    

	public String getLineName() {
		return lineName;
	}

	public void setLineName(String lineName) {
		this.lineName = lineName;
	}

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public String getFcName() {
		return fcName;
	}

	public void setFcName(String fcName) {
		this.fcName = fcName;
	}

	private boolean equalsStr(String poCode2, String poCode3) {
		 if(StringUtils.isEmpty(poCode2) && StringUtils.isEmpty(poCode3)){
	            return true;
	        }
	        if(!StringUtils.isEmpty(poCode2) && poCode2.equals(poCode3)){
	            return true;
	        }
	        return false;
	}

}