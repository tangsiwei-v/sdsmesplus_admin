package com.uspring.sdsmesplus.dao.generate;

import com.uspring.sdsmesplus.entity.po.ProdMatFpCodeLogPO;
import com.uspring.sdsmesplus.entity.po.ProdMatFpCodeLogPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProdMatFpCodeLogPODao {
    long countByExample(ProdMatFpCodeLogPOExample example);

    int deleteByExample(ProdMatFpCodeLogPOExample example);

    int deleteByPrimaryKey(Integer mfpclId);

    int insert(ProdMatFpCodeLogPO record);

    int insertSelective(ProdMatFpCodeLogPO record);

    List<ProdMatFpCodeLogPO> selectByExample(ProdMatFpCodeLogPOExample example);

    ProdMatFpCodeLogPO selectByPrimaryKey(Integer mfpclId);

    int updateByExampleSelective(@Param("record") ProdMatFpCodeLogPO record, @Param("example") ProdMatFpCodeLogPOExample example);

    int updateByExample(@Param("record") ProdMatFpCodeLogPO record, @Param("example") ProdMatFpCodeLogPOExample example);

    int updateByPrimaryKeySelective(ProdMatFpCodeLogPO record);

    int updateByPrimaryKey(ProdMatFpCodeLogPO record);
}