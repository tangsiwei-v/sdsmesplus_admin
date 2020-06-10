package com.uspring.sdsmesplus.dao.generate;

import com.uspring.sdsmesplus.entity.po.ProdWeightPO;
import com.uspring.sdsmesplus.entity.po.ProdWeightPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProdWeightPODao {
    long countByExample(ProdWeightPOExample example);

    int deleteByExample(ProdWeightPOExample example);

    int deleteByPrimaryKey(Integer pwlId);

    int insert(ProdWeightPO record);

    int insertSelective(ProdWeightPO record);

    List<ProdWeightPO> selectByExample(ProdWeightPOExample example);

    ProdWeightPO selectByPrimaryKey(Integer pwlId);

    int updateByExampleSelective(@Param("record") ProdWeightPO record, @Param("example") ProdWeightPOExample example);

    int updateByExample(@Param("record") ProdWeightPO record, @Param("example") ProdWeightPOExample example);

    int updateByPrimaryKeySelective(ProdWeightPO record);

    int updateByPrimaryKey(ProdWeightPO record);
}