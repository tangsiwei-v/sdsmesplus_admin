package com.uspring.sdsmesplus.dao.generate;

import com.uspring.sdsmesplus.entity.po.SysStoragebinPO;
import com.uspring.sdsmesplus.entity.po.SysStoragebinPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysStoragebinPODao {
    long countByExample(SysStoragebinPOExample example);

    int deleteByExample(SysStoragebinPOExample example);

    int deleteByPrimaryKey(Integer binId);

    int insert(SysStoragebinPO record);

    int insertSelective(SysStoragebinPO record);

    List<SysStoragebinPO> selectByExample(SysStoragebinPOExample example);

    SysStoragebinPO selectByPrimaryKey(Integer binId);

    int updateByExampleSelective(@Param("record") SysStoragebinPO record, @Param("example") SysStoragebinPOExample example);

    int updateByExample(@Param("record") SysStoragebinPO record, @Param("example") SysStoragebinPOExample example);

    int updateByPrimaryKeySelective(SysStoragebinPO record);

    int updateByPrimaryKey(SysStoragebinPO record);
}