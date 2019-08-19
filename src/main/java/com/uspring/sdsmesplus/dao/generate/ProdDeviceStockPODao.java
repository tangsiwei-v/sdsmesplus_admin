package com.uspring.sdsmesplus.dao.generate;

import com.uspring.sdsmesplus.entity.po.ProdDeviceStockPO;
import com.uspring.sdsmesplus.entity.po.ProdDeviceStockPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProdDeviceStockPODao {
    long countByExample(ProdDeviceStockPOExample example);

    int deleteByExample(ProdDeviceStockPOExample example);

    int deleteByPrimaryKey(Integer devbId);

    int insert(ProdDeviceStockPO record);

    int insertSelective(ProdDeviceStockPO record);

    List<ProdDeviceStockPO> selectByExample(ProdDeviceStockPOExample example);

    ProdDeviceStockPO selectByPrimaryKey(Integer devbId);

    int updateByExampleSelective(@Param("record") ProdDeviceStockPO record, @Param("example") ProdDeviceStockPOExample example);

    int updateByExample(@Param("record") ProdDeviceStockPO record, @Param("example") ProdDeviceStockPOExample example);

    int updateByPrimaryKeySelective(ProdDeviceStockPO record);

    int updateByPrimaryKey(ProdDeviceStockPO record);
}