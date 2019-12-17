package com.uspring.sdsmesplus.dao.generate;

import com.uspring.sdsmesplus.entity.po.NonconformTroubleCodePO;
import com.uspring.sdsmesplus.entity.po.NonconformTroubleCodePOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NonconformTroubleCodePODao {
    long countByExample(NonconformTroubleCodePOExample example);

    int deleteByExample(NonconformTroubleCodePOExample example);

    int deleteByPrimaryKey(Integer trcId);

    int insert(NonconformTroubleCodePO record);

    int insertSelective(NonconformTroubleCodePO record);

    List<NonconformTroubleCodePO> selectByExample(NonconformTroubleCodePOExample example);

    NonconformTroubleCodePO selectByPrimaryKey(Integer trcId);

    int updateByExampleSelective(@Param("record") NonconformTroubleCodePO record, @Param("example") NonconformTroubleCodePOExample example);

    int updateByExample(@Param("record") NonconformTroubleCodePO record, @Param("example") NonconformTroubleCodePOExample example);

    int updateByPrimaryKeySelective(NonconformTroubleCodePO record);

    int updateByPrimaryKey(NonconformTroubleCodePO record);
}