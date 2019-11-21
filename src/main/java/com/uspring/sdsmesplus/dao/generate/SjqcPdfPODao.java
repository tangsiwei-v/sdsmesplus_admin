package com.uspring.sdsmesplus.dao.generate;

import com.uspring.sdsmesplus.entity.po.SjqcPdfPO;
import com.uspring.sdsmesplus.entity.po.SjqcPdfPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SjqcPdfPODao {
    long countByExample(SjqcPdfPOExample example);

    int deleteByExample(SjqcPdfPOExample example);

    int deleteByPrimaryKey(Integer qcpId);

    int insert(SjqcPdfPO record);

    int insertSelective(SjqcPdfPO record);

    List<SjqcPdfPO> selectByExampleWithBLOBs(SjqcPdfPOExample example);

    List<SjqcPdfPO> selectByExample(SjqcPdfPOExample example);

    SjqcPdfPO selectByPrimaryKey(Integer qcpId);

    int updateByExampleSelective(@Param("record") SjqcPdfPO record, @Param("example") SjqcPdfPOExample example);

    int updateByExampleWithBLOBs(@Param("record") SjqcPdfPO record, @Param("example") SjqcPdfPOExample example);

    int updateByExample(@Param("record") SjqcPdfPO record, @Param("example") SjqcPdfPOExample example);

    int updateByPrimaryKeySelective(SjqcPdfPO record);

    int updateByPrimaryKeyWithBLOBs(SjqcPdfPO record);

    int updateByPrimaryKey(SjqcPdfPO record);
}