package com.uspring.sdsmesplus.dao.generate;

import com.uspring.sdsmesplus.entity.po.SysShiftPO;
import com.uspring.sdsmesplus.entity.po.SysShiftPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysShiftPODao {
    long countByExample(SysShiftPOExample example);

    int deleteByExample(SysShiftPOExample example);

    int deleteByPrimaryKey(Integer sfId);

    int insert(SysShiftPO record);

    int insertSelective(SysShiftPO record);

    List<SysShiftPO> selectByExample(SysShiftPOExample example);

    SysShiftPO selectByPrimaryKey(Integer sfId);

    int updateByExampleSelective(@Param("record") SysShiftPO record, @Param("example") SysShiftPOExample example);

    int updateByExample(@Param("record") SysShiftPO record, @Param("example") SysShiftPOExample example);

    int updateByPrimaryKeySelective(SysShiftPO record);

    int updateByPrimaryKey(SysShiftPO record);
}