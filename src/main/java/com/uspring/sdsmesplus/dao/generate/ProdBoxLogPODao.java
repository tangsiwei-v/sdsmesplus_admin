package com.uspring.sdsmesplus.dao.generate;

import com.uspring.sdsmesplus.entity.po.ProdBoxLogPO;
import com.uspring.sdsmesplus.entity.po.ProdBoxLogPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProdBoxLogPODao {
    long countByExample(ProdBoxLogPOExample example);

    int deleteByExample(ProdBoxLogPOExample example);

    int deleteByPrimaryKey(Integer blId);

    int insert(ProdBoxLogPO record);

    int insertSelective(ProdBoxLogPO record);

    List<ProdBoxLogPO> selectByExample(ProdBoxLogPOExample example);

    ProdBoxLogPO selectByPrimaryKey(Integer blId);

    int updateByExampleSelective(@Param("record") ProdBoxLogPO record, @Param("example") ProdBoxLogPOExample example);

    int updateByExample(@Param("record") ProdBoxLogPO record, @Param("example") ProdBoxLogPOExample example);

    int updateByPrimaryKeySelective(ProdBoxLogPO record);

    int updateByPrimaryKey(ProdBoxLogPO record);
}