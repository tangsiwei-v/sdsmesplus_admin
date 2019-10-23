package com.uspring.sdsmesplus.dao.generate;

import com.uspring.sdsmesplus.entity.po.SysRolePO;
import com.uspring.sdsmesplus.entity.po.SysRolePOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysRolePODao {
    long countByExample(SysRolePOExample example);

    int deleteByExample(SysRolePOExample example);

    int deleteByPrimaryKey(Integer roleId);

    int insert(SysRolePO record);

    int insertSelective(SysRolePO record);

    List<SysRolePO> selectByExample(SysRolePOExample example);

    SysRolePO selectByPrimaryKey(Integer roleId);

    int updateByExampleSelective(@Param("record") SysRolePO record, @Param("example") SysRolePOExample example);

    int updateByExample(@Param("record") SysRolePO record, @Param("example") SysRolePOExample example);

    int updateByPrimaryKeySelective(SysRolePO record);

    int updateByPrimaryKey(SysRolePO record);
}