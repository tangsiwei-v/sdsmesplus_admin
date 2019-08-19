package com.uspring.sdsmesplus.dao.generate;

import com.uspring.sdsmesplus.entity.po.PlanOrderProPO;
import com.uspring.sdsmesplus.entity.po.PlanOrderProPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PlanOrderProPODao {
    long countByExample(PlanOrderProPOExample example);

    int deleteByExample(PlanOrderProPOExample example);

    int deleteByPrimaryKey(Integer plopId);

    int insert(PlanOrderProPO record);

    int insertSelective(PlanOrderProPO record);

    List<PlanOrderProPO> selectByExample(PlanOrderProPOExample example);

    PlanOrderProPO selectByPrimaryKey(Integer plopId);

    int updateByExampleSelective(@Param("record") PlanOrderProPO record, @Param("example") PlanOrderProPOExample example);

    int updateByExample(@Param("record") PlanOrderProPO record, @Param("example") PlanOrderProPOExample example);

    int updateByPrimaryKeySelective(PlanOrderProPO record);

    int updateByPrimaryKey(PlanOrderProPO record);
}