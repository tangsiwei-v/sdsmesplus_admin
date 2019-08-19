package com.uspring.sdsmesplus.entity.po;

public class SysWorkshopPO {
    private Integer shopId;

    private String shopName;

    private Integer fcId;

    private String shopSdsId;

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName == null ? null : shopName.trim();
    }

    public Integer getFcId() {
        return fcId;
    }

    public void setFcId(Integer fcId) {
        this.fcId = fcId;
    }

    public String getShopSdsId() {
        return shopSdsId;
    }

    public void setShopSdsId(String shopSdsId) {
        this.shopSdsId = shopSdsId == null ? null : shopSdsId.trim();
    }
}