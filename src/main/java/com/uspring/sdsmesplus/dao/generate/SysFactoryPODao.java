package com.uspring.sdsmesplus.dao.generate;

import com.uspring.sdsmesplus.entity.po.SysFactoryPO;
import com.uspring.sdsmesplus.entity.po.SysFactoryPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysFactoryPODao {
    long countByExample(SysFactoryPOExample example);

    int deleteByExample(SysFactoryPOExample example);

    int deleteByPrimaryKey(Integer fcId);

    int insert(SysFactoryPO record);

    int insertSelective(SysFactoryPO record);

    List<SysFactoryPO> selectByExample(SysFactoryPOExample example);

    SysFactoryPO selectByPrimaryKey(Integer fcId);

    int updateByExampleSelective(@Param("record") SysFactoryPO record, @Param("example") SysFactoryPOExample example);

    int updateByExample(@Param("record") SysFactoryPO record, @Param("example") SysFactoryPOExample example);

    int updateByPrimaryKeySelective(SysFactoryPO record);

    int updateByPrimaryKey(SysFactoryPO record);
}