package com.uspring.sdsmesplus.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.uspring.sdsmesplus.entity.vo.RoleVO;

/** * @author  作者 E-mail:
 * @date 创建时间：2019年10月6日 下午2:11:29 
 * @version 1.0 * @parameter  
 * @since  
 * @return  
*/
public interface RoleService {

	PageInfo<RoleVO> queryRole(String user_account, String role_level, Integer page_size, Integer page_num);

	void delRole(Integer role_id);

	void putRole(List<RoleVO> roleVOs);

	void addRole(RoleVO roleVO);

}
