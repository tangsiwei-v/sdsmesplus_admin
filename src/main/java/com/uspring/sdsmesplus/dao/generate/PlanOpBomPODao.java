package com.uspring.sdsmesplus.dao.generate;

import com.uspring.sdsmesplus.entity.po.PlanOpBomPO;
import com.uspring.sdsmesplus.entity.po.PlanOpBomPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PlanOpBomPODao {
    long countByExample(PlanOpBomPOExample example);

    int deleteByExample(PlanOpBomPOExample example);

    int deleteByPrimaryKey(Integer plbmId);

    int insert(PlanOpBomPO record);

    int insertSelective(PlanOpBomPO record);

    List<PlanOpBomPO> selectByExample(PlanOpBomPOExample example);

    PlanOpBomPO selectByPrimaryKey(Integer plbmId);

    int updateByExampleSelective(@Param("record") PlanOpBomPO record, @Param("example") PlanOpBomPOExample example);

    int updateByExample(@Param("record") PlanOpBomPO record, @Param("example") PlanOpBomPOExample example);

    int updateByPrimaryKeySelective(PlanOpBomPO record);

    int updateByPrimaryKey(PlanOpBomPO record);
}