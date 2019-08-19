package com.uspring.sdsmesplus.dao.generate;

import com.uspring.sdsmesplus.entity.po.ProdBatchLogPO;
import com.uspring.sdsmesplus.entity.po.ProdBatchLogPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProdBatchLogPODao {
    long countByExample(ProdBatchLogPOExample example);

    int deleteByExample(ProdBatchLogPOExample example);

    int deleteByPrimaryKey(Integer batchId);

    int insert(ProdBatchLogPO record);

    int insertSelective(ProdBatchLogPO record);

    List<ProdBatchLogPO> selectByExample(ProdBatchLogPOExample example);

    ProdBatchLogPO selectByPrimaryKey(Integer batchId);

    int updateByExampleSelective(@Param("record") ProdBatchLogPO record, @Param("example") ProdBatchLogPOExample example);

    int updateByExample(@Param("record") ProdBatchLogPO record, @Param("example") ProdBatchLogPOExample example);

    int updateByPrimaryKeySelective(ProdBatchLogPO record);

    int updateByPrimaryKey(ProdBatchLogPO record);
}