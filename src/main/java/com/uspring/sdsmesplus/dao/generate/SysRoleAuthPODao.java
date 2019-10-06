package com.uspring.sdsmesplus.dao.generate;

import com.uspring.sdsmesplus.entity.po.SysRoleAuthPO;
import com.uspring.sdsmesplus.entity.po.SysRoleAuthPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysRoleAuthPODao {
    long countByExample(SysRoleAuthPOExample example);

    int deleteByExample(SysRoleAuthPOExample example);

    int deleteByPrimaryKey(Integer raId);

    int insert(SysRoleAuthPO record);

    int insertSelective(SysRoleAuthPO record);

    List<SysRoleAuthPO> selectByExample(SysRoleAuthPOExample example);

    SysRoleAuthPO selectByPrimaryKey(Integer raId);

    int updateByExampleSelective(@Param("record") SysRoleAuthPO record, @Param("example") SysRoleAuthPOExample example);

    int updateByExample(@Param("record") SysRoleAuthPO record, @Param("example") SysRoleAuthPOExample example);

    int updateByPrimaryKeySelective(SysRoleAuthPO record);

    int updateByPrimaryKey(SysRoleAuthPO record);
}