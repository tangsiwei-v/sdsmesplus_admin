package com.uspring.sdsmesplus.dao.generate;

import com.uspring.sdsmesplus.entity.po.SysProdPdfPO;
import com.uspring.sdsmesplus.entity.po.SysProdPdfPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysProdPdfPODao {
    long countByExample(SysProdPdfPOExample example);

    int deleteByExample(SysProdPdfPOExample example);

    int deleteByPrimaryKey(Integer spdId);

    int insert(SysProdPdfPO record);

    int insertSelective(SysProdPdfPO record);

    List<SysProdPdfPO> selectByExampleWithBLOBs(SysProdPdfPOExample example);

    List<SysProdPdfPO> selectByExample(SysProdPdfPOExample example);

    SysProdPdfPO selectByPrimaryKey(Integer spdId);

    int updateByExampleSelective(@Param("record") SysProdPdfPO record, @Param("example") SysProdPdfPOExample example);

    int updateByExampleWithBLOBs(@Param("record") SysProdPdfPO record, @Param("example") SysProdPdfPOExample example);

    int updateByExample(@Param("record") SysProdPdfPO record, @Param("example") SysProdPdfPOExample example);

    int updateByPrimaryKeySelective(SysProdPdfPO record);

    int updateByPrimaryKeyWithBLOBs(SysProdPdfPO record);

    int updateByPrimaryKey(SysProdPdfPO record);
}