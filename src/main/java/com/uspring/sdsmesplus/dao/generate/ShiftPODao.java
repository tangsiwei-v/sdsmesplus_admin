package com.uspring.sdsmesplus.dao.generate;

import com.uspring.sdsmesplus.entity.po.ShiftPO;
import com.uspring.sdsmesplus.entity.po.ShiftPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShiftPODao {
    long countByExample(ShiftPOExample example);

    int deleteByExample(ShiftPOExample example);

    int deleteByPrimaryKey(Integer sfId);

    int insert(ShiftPO record);

    int insertSelective(ShiftPO record);

    List<ShiftPO> selectByExample(ShiftPOExample example);

    ShiftPO selectByPrimaryKey(Integer sfId);

    int updateByExampleSelective(@Param("record") ShiftPO record, @Param("example") ShiftPOExample example);

    int updateByExample(@Param("record") ShiftPO record, @Param("example") ShiftPOExample example);

    int updateByPrimaryKeySelective(ShiftPO record);

    int updateByPrimaryKey(ShiftPO record);
}