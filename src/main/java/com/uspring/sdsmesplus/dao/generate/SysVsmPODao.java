package com.uspring.sdsmesplus.dao.generate;

import com.uspring.sdsmesplus.entity.po.SysVsmPO;
import com.uspring.sdsmesplus.entity.po.SysVsmPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysVsmPODao {
    long countByExample(SysVsmPOExample example);

    int deleteByExample(SysVsmPOExample example);

    int deleteByPrimaryKey(Integer vsmId);

    int insert(SysVsmPO record);

    int insertSelective(SysVsmPO record);

    List<SysVsmPO> selectByExample(SysVsmPOExample example);

    SysVsmPO selectByPrimaryKey(Integer vsmId);

    int updateByExampleSelective(@Param("record") SysVsmPO record, @Param("example") SysVsmPOExample example);

    int updateByExample(@Param("record") SysVsmPO record, @Param("example") SysVsmPOExample example);

    int updateByPrimaryKeySelective(SysVsmPO record);

    int updateByPrimaryKey(SysVsmPO record);
}