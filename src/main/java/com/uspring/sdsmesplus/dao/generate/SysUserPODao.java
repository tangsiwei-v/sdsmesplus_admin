package com.uspring.sdsmesplus.dao.generate;

import com.uspring.sdsmesplus.entity.po.SysUserPO;
import com.uspring.sdsmesplus.entity.po.SysUserPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysUserPODao {
    long countByExample(SysUserPOExample example);

    int deleteByExample(SysUserPOExample example);

    int deleteByPrimaryKey(Integer userId);

    int insert(SysUserPO record);

    int insertSelective(SysUserPO record);

    List<SysUserPO> selectByExample(SysUserPOExample example);

    SysUserPO selectByPrimaryKey(Integer userId);

    int updateByExampleSelective(@Param("record") SysUserPO record, @Param("example") SysUserPOExample example);

    int updateByExample(@Param("record") SysUserPO record, @Param("example") SysUserPOExample example);

    int updateByPrimaryKeySelective(SysUserPO record);

    int updateByPrimaryKey(SysUserPO record);
}