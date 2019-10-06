package com.uspring.sdsmesplus.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.uspring.sdsmesplus.entity.po.SysAuthorityPO;

/** * @author  作者 E-mail:
 * @date 创建时间：2019年10月6日 上午11:31:41 
 * @version 1.0 * @parameter  
 * @since  
 * @return  
*/
public interface AuthorityService {
    
	PageInfo<SysAuthorityPO> queryAuth(Integer roleId, Integer page_size, Integer page_num);

	void delAuth(Integer authId, String authCode);

	void putAuth(List<SysAuthorityPO> authorityPOs);

	void addAuth(SysAuthorityPO authorityPO);

}
