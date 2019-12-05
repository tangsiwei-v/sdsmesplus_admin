package com.uspring.sdsmesplus.dao.generate;

import com.uspring.sdsmesplus.entity.po.ProdProcessStockPO;
import com.uspring.sdsmesplus.entity.po.ProdProcessStockPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProdProcessStockPODao {
    long countByExample(ProdProcessStockPOExample example);

    int deleteByExample(ProdProcessStockPOExample example);

    int deleteByPrimaryKey(Integer procbId);

    int insert(ProdProcessStockPO record);

    int insertSelective(ProdProcessStockPO record);

    List<ProdProcessStockPO> selectByExample(ProdProcessStockPOExample example);

    ProdProcessStockPO selectByPrimaryKey(Integer procbId);

    int updateByExampleSelective(@Param("record") ProdProcessStockPO record, @Param("example") ProdProcessStockPOExample example);

    int updateByExample(@Param("record") ProdProcessStockPO record, @Param("example") ProdProcessStockPOExample example);

    int updateByPrimaryKeySelective(ProdProcessStockPO record);

    int updateByPrimaryKey(ProdProcessStockPO record);
}