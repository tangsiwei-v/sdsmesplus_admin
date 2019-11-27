package com.uspring.sdsmesplus.dao.generate;

import com.uspring.sdsmesplus.entity.po.SysQrcodeRulePO;
import com.uspring.sdsmesplus.entity.po.SysQrcodeRulePOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysQrcodeRulePODao {
    long countByExample(SysQrcodeRulePOExample example);

    int deleteByExample(SysQrcodeRulePOExample example);

    int deleteByPrimaryKey(Integer sqrId);

    int insert(SysQrcodeRulePO record);

    int insertSelective(SysQrcodeRulePO record);

    List<SysQrcodeRulePO> selectByExample(SysQrcodeRulePOExample example);

    SysQrcodeRulePO selectByPrimaryKey(Integer sqrId);

    int updateByExampleSelective(@Param("record") SysQrcodeRulePO record, @Param("example") SysQrcodeRulePOExample example);

    int updateByExample(@Param("record") SysQrcodeRulePO record, @Param("example") SysQrcodeRulePOExample example);

    int updateByPrimaryKeySelective(SysQrcodeRulePO record);

    int updateByPrimaryKey(SysQrcodeRulePO record);
}