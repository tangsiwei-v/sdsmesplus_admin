package com.uspring.sdsmesplus.dao.generate;

import com.uspring.sdsmesplus.entity.po.SysPrinterTmplPO;
import com.uspring.sdsmesplus.entity.po.SysPrinterTmplPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysPrinterTmplPODao {
    long countByExample(SysPrinterTmplPOExample example);

    int deleteByExample(SysPrinterTmplPOExample example);

    int deleteByPrimaryKey(Integer ptmplId);

    int insert(SysPrinterTmplPO record);

    int insertSelective(SysPrinterTmplPO record);

    List<SysPrinterTmplPO> selectByExampleWithBLOBs(SysPrinterTmplPOExample example);

    List<SysPrinterTmplPO> selectByExample(SysPrinterTmplPOExample example);

    SysPrinterTmplPO selectByPrimaryKey(Integer ptmplId);

    int updateByExampleSelective(@Param("record") SysPrinterTmplPO record, @Param("example") SysPrinterTmplPOExample example);

    int updateByExampleWithBLOBs(@Param("record") SysPrinterTmplPO record, @Param("example") SysPrinterTmplPOExample example);

    int updateByExample(@Param("record") SysPrinterTmplPO record, @Param("example") SysPrinterTmplPOExample example);

    int updateByPrimaryKeySelective(SysPrinterTmplPO record);

    int updateByPrimaryKeyWithBLOBs(SysPrinterTmplPO record);

    int updateByPrimaryKey(SysPrinterTmplPO record);
}