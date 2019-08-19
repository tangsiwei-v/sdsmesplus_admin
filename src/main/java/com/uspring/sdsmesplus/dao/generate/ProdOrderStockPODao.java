package com.uspring.sdsmesplus.dao.generate;

import com.uspring.sdsmesplus.entity.po.ProdOrderStockPO;
import com.uspring.sdsmesplus.entity.po.ProdOrderStockPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProdOrderStockPODao {
    long countByExample(ProdOrderStockPOExample example);

    int deleteByExample(ProdOrderStockPOExample example);

    int deleteByPrimaryKey(Integer pobId);

    int insert(ProdOrderStockPO record);

    int insertSelective(ProdOrderStockPO record);

    List<ProdOrderStockPO> selectByExample(ProdOrderStockPOExample example);

    ProdOrderStockPO selectByPrimaryKey(Integer pobId);

    int updateByExampleSelective(@Param("record") ProdOrderStockPO record, @Param("example") ProdOrderStockPOExample example);

    int updateByExample(@Param("record") ProdOrderStockPO record, @Param("example") ProdOrderStockPOExample example);

    int updateByPrimaryKeySelective(ProdOrderStockPO record);

    int updateByPrimaryKey(ProdOrderStockPO record);
}