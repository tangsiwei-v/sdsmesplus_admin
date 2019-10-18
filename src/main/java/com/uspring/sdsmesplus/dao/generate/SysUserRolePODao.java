package com.uspring.sdsmesplus.dao.generate;

import com.uspring.sdsmesplus.entity.po.SysUserRolePO;
import com.uspring.sdsmesplus.entity.po.SysUserRolePOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysUserRolePODao {
    long countByExample(SysUserRolePOExample example);

    int deleteByExample(SysUserRolePOExample example);

    int deleteByPrimaryKey(Integer syrId);

    int insert(SysUserRolePO record);

    int insertSelective(SysUserRolePO record);

    List<SysUserRolePO> selectByExample(SysUserRolePOExample example);

    SysUserRolePO selectByPrimaryKey(Integer syrId);

    int updateByExampleSelective(@Param("record") SysUserRolePO record, @Param("example") SysUserRolePOExample example);

    int updateByExample(@Param("record") SysUserRolePO record, @Param("example") SysUserRolePOExample example);

    int updateByPrimaryKeySelective(SysUserRolePO record);

    int updateByPrimaryKey(SysUserRolePO record);
}