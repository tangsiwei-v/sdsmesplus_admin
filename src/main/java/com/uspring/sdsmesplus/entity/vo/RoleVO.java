package com.uspring.sdsmesplus.entity.vo;

import com.sun.tools.javac.util.List;
import com.uspring.sdsmesplus.entity.po.SysAuthorityPO;
import com.uspring.sdsmesplus.entity.po.SysRolePO;

/** * @author  作者 E-mail:
 * @date 创建时间：2019年10月6日 下午2:06:32 
 * @version 1.0 * @parameter  
 * @since  
 * @return  
*/
public class RoleVO extends SysRolePO{
	
  List<SysAuthorityPO> sysAuthorityPOs;

public List<SysAuthorityPO> getSysAuthorityPOs() {
	return sysAuthorityPOs;
}

public void setSysAuthorityPOs(List<SysAuthorityPO> sysAuthorityPOs) {
	this.sysAuthorityPOs = sysAuthorityPOs;
}

@Override
public String toString() {
	return "RoleVO [sysAuthorityPOs=" + sysAuthorityPOs + "]";
}
  
}
