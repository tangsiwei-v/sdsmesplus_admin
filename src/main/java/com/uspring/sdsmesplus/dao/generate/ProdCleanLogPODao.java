package com.uspring.sdsmesplus.dao.generate;

import com.uspring.sdsmesplus.entity.po.ProdCleanLogPO;
import com.uspring.sdsmesplus.entity.po.ProdCleanLogPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProdCleanLogPODao {
    long countByExample(ProdCleanLogPOExample example);

    int deleteByExample(ProdCleanLogPOExample example);

    int deleteByPrimaryKey(Integer clId);

    int insert(ProdCleanLogPO record);

    int insertSelective(ProdCleanLogPO record);

    List<ProdCleanLogPO> selectByExample(ProdCleanLogPOExample example);

    ProdCleanLogPO selectByPrimaryKey(Integer clId);

    int updateByExampleSelective(@Param("record") ProdCleanLogPO record, @Param("example") ProdCleanLogPOExample example);

    int updateByExample(@Param("record") ProdCleanLogPO record, @Param("example") ProdCleanLogPOExample example);

    int updateByPrimaryKeySelective(ProdCleanLogPO record);

    int updateByPrimaryKey(ProdCleanLogPO record);
}