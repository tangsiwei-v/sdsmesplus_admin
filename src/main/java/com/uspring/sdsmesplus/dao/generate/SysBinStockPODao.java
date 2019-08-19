package com.uspring.sdsmesplus.dao.generate;

import com.uspring.sdsmesplus.entity.po.SysBinStockPO;
import com.uspring.sdsmesplus.entity.po.SysBinStockPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysBinStockPODao {
    long countByExample(SysBinStockPOExample example);

    int deleteByExample(SysBinStockPOExample example);

    int deleteByPrimaryKey(Integer bstkId);

    int insert(SysBinStockPO record);

    int insertSelective(SysBinStockPO record);

    List<SysBinStockPO> selectByExample(SysBinStockPOExample example);

    SysBinStockPO selectByPrimaryKey(Integer bstkId);

    int updateByExampleSelective(@Param("record") SysBinStockPO record, @Param("example") SysBinStockPOExample example);

    int updateByExample(@Param("record") SysBinStockPO record, @Param("example") SysBinStockPOExample example);

    int updateByPrimaryKeySelective(SysBinStockPO record);

    int updateByPrimaryKey(SysBinStockPO record);
}