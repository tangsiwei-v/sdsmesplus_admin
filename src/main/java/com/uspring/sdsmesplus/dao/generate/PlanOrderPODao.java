package com.uspring.sdsmesplus.dao.generate;

import com.uspring.sdsmesplus.entity.po.PlanOrderPO;
import com.uspring.sdsmesplus.entity.po.PlanOrderPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PlanOrderPODao {
    long countByExample(PlanOrderPOExample example);

    int deleteByExample(PlanOrderPOExample example);

    int deleteByPrimaryKey(Integer poId);

    int insert(PlanOrderPO record);

    int insertSelective(PlanOrderPO record);

    List<PlanOrderPO> selectByExample(PlanOrderPOExample example);

    PlanOrderPO selectByPrimaryKey(Integer poId);

    int updateByExampleSelective(@Param("record") PlanOrderPO record, @Param("example") PlanOrderPOExample example);

    int updateByExample(@Param("record") PlanOrderPO record, @Param("example") PlanOrderPOExample example);

    int updateByPrimaryKeySelective(PlanOrderPO record);

    int updateByPrimaryKey(PlanOrderPO record);
}