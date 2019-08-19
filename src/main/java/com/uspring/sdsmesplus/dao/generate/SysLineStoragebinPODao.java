package com.uspring.sdsmesplus.dao.generate;

import com.uspring.sdsmesplus.entity.po.SysLineStoragebinPO;
import com.uspring.sdsmesplus.entity.po.SysLineStoragebinPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysLineStoragebinPODao {
    long countByExample(SysLineStoragebinPOExample example);

    int deleteByExample(SysLineStoragebinPOExample example);

    int deleteByPrimaryKey(Integer linbinId);

    int insert(SysLineStoragebinPO record);

    int insertSelective(SysLineStoragebinPO record);

    List<SysLineStoragebinPO> selectByExample(SysLineStoragebinPOExample example);

    SysLineStoragebinPO selectByPrimaryKey(Integer linbinId);

    int updateByExampleSelective(@Param("record") SysLineStoragebinPO record, @Param("example") SysLineStoragebinPOExample example);

    int updateByExample(@Param("record") SysLineStoragebinPO record, @Param("example") SysLineStoragebinPOExample example);

    int updateByPrimaryKeySelective(SysLineStoragebinPO record);

    int updateByPrimaryKey(SysLineStoragebinPO record);
}