package com.uspring.sdsmesplus.dao.generate;

import com.uspring.sdsmesplus.entity.po.ProdPrinterLogPO;
import com.uspring.sdsmesplus.entity.po.ProdPrinterLogPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProdPrinterLogPODao {
    long countByExample(ProdPrinterLogPOExample example);

    int deleteByExample(ProdPrinterLogPOExample example);

    int deleteByPrimaryKey(Integer fpId);

    int insert(ProdPrinterLogPO record);

    int insertSelective(ProdPrinterLogPO record);

    List<ProdPrinterLogPO> selectByExample(ProdPrinterLogPOExample example);

    ProdPrinterLogPO selectByPrimaryKey(Integer fpId);

    int updateByExampleSelective(@Param("record") ProdPrinterLogPO record, @Param("example") ProdPrinterLogPOExample example);

    int updateByExample(@Param("record") ProdPrinterLogPO record, @Param("example") ProdPrinterLogPOExample example);

    int updateByPrimaryKeySelective(ProdPrinterLogPO record);

    int updateByPrimaryKey(ProdPrinterLogPO record);
}