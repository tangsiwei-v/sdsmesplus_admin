/**
 * @Title: UserRoleVO.java 
 * @Package com.uspring.sdsMaintenance.entity.vo 
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author lihuan lihuanwk@126.com
 * @date 2018年9月24日 上午1:57:46 
 * @version V1.0 
 */
package com.uspring.sdsmesplus.entity.vo;

/** 
 * @ClassName: UserRoleVO 
 * @Description: 用户角色类
 * @author lihuan lihuan@uspring.cn 
 * @date 2018年9月24日 上午1:57:46 
 *  
 */
public class UserRoleVO {

	private int roleId;
	
	//主键
	private int syrId;
	
	private String roleName;
	
	private String roleLevel;
	
	//所属部门信息
	private String factoryName;
	
	private int factoryId;
	
	private String workshopName;
	
	private int shopId;
	
	private String vsmName;
	
	private int vsmId;
	
	private String lineName;
	
	private int lineId;
	
	//是否管理员
	private Boolean isAdmin ;

	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getFactoryName() {
		return factoryName;
	}

	public void setFactoryName(String factoryName) {
		this.factoryName = factoryName;
	}

	public String getWorkshopName() {
		return workshopName;
	}

	public void setWorkshopName(String workshopName) {
		this.workshopName = workshopName;
	}

	public String getLineName() {
		return lineName;
	}

	public void setLineName(String lineName) {
		this.lineName = lineName;
	}

	public int getFactoryId() {
		return factoryId;
	}

	public void setFactoryId(int factoryId) {
		this.factoryId = factoryId;
	}

	public int getShopId() {
		return shopId;
	}

	public void setShopId(int shopId) {
		this.shopId = shopId;
	}

	public int getLineId() {
		return lineId;
	}

	public void setLineId(int lineId) {
		this.lineId = lineId;
	}

	public String getVsmName() {
		return vsmName;
	}

	public void setVsmName(String vsmName) {
		this.vsmName = vsmName;
	}

	public int getVsmId() {
		return vsmId;
	}

	public void setVsmId(int vsmId) {
		this.vsmId = vsmId;
	}

	public String getRoleLevel() {
		return roleLevel;
	}

	public void setRoleLevel(String roleLevel) {
		this.roleLevel = roleLevel;
	}

	public int getSyrId() {
		return syrId;
	}

	public void setSyrId(int syrId) {
		this.syrId = syrId;
	}

	public Boolean getIsAdmin() {
		return isAdmin;
	}

	public void setIsAdmin(Boolean isAdmin) {
		this.isAdmin = isAdmin;
	}
}
