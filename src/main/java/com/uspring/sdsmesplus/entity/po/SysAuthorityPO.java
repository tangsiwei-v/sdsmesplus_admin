package com.uspring.sdsmesplus.entity.po;

public class SysAuthorityPO {
    private Integer authId;

    private String authName;

    private String authCode;

    private String authView;

    private String authSystem;

    private Integer parentId;

    private String note;

    public Integer getAuthId() {
        return authId;
    }

    public void setAuthId(Integer authId) {
        this.authId = authId;
    }

    public String getAuthName() {
        return authName;
    }

    public void setAuthName(String authName) {
        this.authName = authName == null ? null : authName.trim();
    }

    public String getAuthCode() {
        return authCode;
    }

    public void setAuthCode(String authCode) {
        this.authCode = authCode == null ? null : authCode.trim();
    }

    public String getAuthView() {
        return authView;
    }

    public void setAuthView(String authView) {
        this.authView = authView == null ? null : authView.trim();
    }

    public String getAuthSystem() {
        return authSystem;
    }

    public void setAuthSystem(String authSystem) {
        this.authSystem = authSystem == null ? null : authSystem.trim();
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }
}