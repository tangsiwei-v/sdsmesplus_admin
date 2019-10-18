package com.uspring.sdsmesplus.entity.vo;

/**
 * * @author 作者 E-mail:
 * 
 * @date 创建时间：2019年10月16日 下午7:42:32
 * @version 1.0 * @parameter
 * @since
 * @return
 */
public class AuthCode {
	
	private Integer authId;
	
	private String authName;
	
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
		this.authName = authName;
	}

	public String getAuthSystem() {
		return authSystem;
	}

	public void setAuthSystem(String authSystem) {
		this.authSystem = authSystem;
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
		this.note = note;
	}

	@Override
	public String toString() {
		return "AuthCode [authId=" + authId + ", authName=" + authName + ", authSystem=" + authSystem + ", parentId="
				+ parentId + ", note=" + note + "]";
	}

	

}
