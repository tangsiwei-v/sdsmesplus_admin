package com.uspring.sdsmesplus.dao.generate;

import com.uspring.sdsmesplus.entity.po.SysProdPdfPO;
import com.uspring.sdsmesplus.entity.po.SysProdPdfPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysProdPdfPODao {
    long countByExample(SysProdPdfPOExample example);

    int deleteByExample(SysProdPdfPOExample example);

    int deleteByPrimaryKey(Integer sppId);

    int insert(SysProdPdfPO record);

    int insertSelective(SysProdPdfPO record);

    List<SysProdPdfPO> selectByExample(SysProdPdfPOExample example);

    SysProdPdfPO selectByPrimaryKey(Integer sppId);

    int updateByExampleSelective(@Param("record") SysProdPdfPO record, @Param("example") SysProdPdfPOExample example);

    int updateByExample(@Param("record") SysProdPdfPO record, @Param("example") SysProdPdfPOExample example);

    int updateByPrimaryKeySelective(SysProdPdfPO record);

    int updateByPrimaryKey(SysProdPdfPO record);
}