package com.uspring.sdsmesplus.dao.generate;

import com.uspring.sdsmesplus.entity.po.NonconformProductLogPO;
import com.uspring.sdsmesplus.entity.po.NonconformProductLogPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NonconformProductLogPODao {
    long countByExample(NonconformProductLogPOExample example);

    int deleteByExample(NonconformProductLogPOExample example);

    int deleteByPrimaryKey(Integer nplId);

    int insert(NonconformProductLogPO record);

    int insertSelective(NonconformProductLogPO record);

    List<NonconformProductLogPO> selectByExample(NonconformProductLogPOExample example);

    NonconformProductLogPO selectByPrimaryKey(Integer nplId);

    int updateByExampleSelective(@Param("record") NonconformProductLogPO record, @Param("example") NonconformProductLogPOExample example);

    int updateByExample(@Param("record") NonconformProductLogPO record, @Param("example") NonconformProductLogPOExample example);

    int updateByPrimaryKeySelective(NonconformProductLogPO record);

    int updateByPrimaryKey(NonconformProductLogPO record);
}