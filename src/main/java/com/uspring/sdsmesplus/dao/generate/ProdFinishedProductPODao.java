package com.uspring.sdsmesplus.dao.generate;

import com.uspring.sdsmesplus.entity.po.ProdFinishedProductPO;
import com.uspring.sdsmesplus.entity.po.ProdFinishedProductPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProdFinishedProductPODao {
    long countByExample(ProdFinishedProductPOExample example);

    int deleteByExample(ProdFinishedProductPOExample example);

    int deleteByPrimaryKey(Integer fpId);

    int insert(ProdFinishedProductPO record);

    int insertSelective(ProdFinishedProductPO record);

    List<ProdFinishedProductPO> selectByExample(ProdFinishedProductPOExample example);

    ProdFinishedProductPO selectByPrimaryKey(Integer fpId);

    int updateByExampleSelective(@Param("record") ProdFinishedProductPO record, @Param("example") ProdFinishedProductPOExample example);

    int updateByExample(@Param("record") ProdFinishedProductPO record, @Param("example") ProdFinishedProductPOExample example);

    int updateByPrimaryKeySelective(ProdFinishedProductPO record);

    int updateByPrimaryKey(ProdFinishedProductPO record);
}