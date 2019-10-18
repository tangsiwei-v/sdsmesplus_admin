package com.uspring.sdsmesplus.entity.po;

public class SysUserRolePO {
    private Integer syrId;

    private Integer userId;

    private String userAccount;

    private Integer roleId;

    private Integer factoryId;

    private Integer shopId;

    private Integer vsmId;

    private Integer lineId;

    public Integer getSyrId() {
        return syrId;
    }

    public void setSyrId(Integer syrId) {
        this.syrId = syrId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount == null ? null : userAccount.trim();
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getFactoryId() {
        return factoryId;
    }

    public void setFactoryId(Integer factoryId) {
        this.factoryId = factoryId;
    }

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public Integer getVsmId() {
        return vsmId;
    }

    public void setVsmId(Integer vsmId) {
        this.vsmId = vsmId;
    }

    public Integer getLineId() {
        return lineId;
    }

    public void setLineId(Integer lineId) {
        this.lineId = lineId;
    }
}