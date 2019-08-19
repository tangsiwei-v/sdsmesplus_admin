package com.uspring.sdsmesplus.entity.po;

public class SysVsmPO {
    private Integer vsmId;

    private String vsmName;

    private Integer shopId;

    private String vsmSdsId;

    public Integer getVsmId() {
        return vsmId;
    }

    public void setVsmId(Integer vsmId) {
        this.vsmId = vsmId;
    }

    public String getVsmName() {
        return vsmName;
    }

    public void setVsmName(String vsmName) {
        this.vsmName = vsmName == null ? null : vsmName.trim();
    }

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public String getVsmSdsId() {
        return vsmSdsId;
    }

    public void setVsmSdsId(String vsmSdsId) {
        this.vsmSdsId = vsmSdsId == null ? null : vsmSdsId.trim();
    }
}