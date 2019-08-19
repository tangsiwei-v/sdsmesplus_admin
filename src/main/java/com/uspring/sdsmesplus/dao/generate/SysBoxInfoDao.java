package com.uspring.sdsmesplus.dao.generate;

import com.uspring.sdsmesplus.entity.po.SysBoxInfoPO;
import com.uspring.sdsmesplus.entity.po.SysBoxInfoPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysBoxInfoDao {
    long countByExample(SysBoxInfoPOExample example);

    int deleteByExample(SysBoxInfoPOExample example);

    int deleteByPrimaryKey(Integer bifId);

    int insert(SysBoxInfoPO record);

    int insertSelective(SysBoxInfoPO record);

    List<SysBoxInfoPO> selectByExample(SysBoxInfoPOExample example);

    SysBoxInfoPO selectByPrimaryKey(Integer bifId);

    int updateByExampleSelective(@Param("record") SysBoxInfoPO record, @Param("example") SysBoxInfoPOExample example);

    int updateByExample(@Param("record") SysBoxInfoPO record, @Param("example") SysBoxInfoPOExample example);

    int updateByPrimaryKeySelective(SysBoxInfoPO record);

    int updateByPrimaryKey(SysBoxInfoPO record);
}