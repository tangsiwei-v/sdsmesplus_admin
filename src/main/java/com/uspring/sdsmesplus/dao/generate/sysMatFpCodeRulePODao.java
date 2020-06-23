package com.uspring.sdsmesplus.dao.generate;

import com.uspring.sdsmesplus.entity.po.sysMatFpCodeRulePO;
import com.uspring.sdsmesplus.entity.po.sysMatFpCodeRulePOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface sysMatFpCodeRulePODao {
    long countByExample(sysMatFpCodeRulePOExample example);

    int deleteByExample(sysMatFpCodeRulePOExample example);

    int deleteByPrimaryKey(Integer mfpcId);

    int insert(sysMatFpCodeRulePO record);

    int insertSelective(sysMatFpCodeRulePO record);

    List<sysMatFpCodeRulePO> selectByExample(sysMatFpCodeRulePOExample example);

    sysMatFpCodeRulePO selectByPrimaryKey(Integer mfpcId);

    int updateByExampleSelective(@Param("record") sysMatFpCodeRulePO record, @Param("example") sysMatFpCodeRulePOExample example);

    int updateByExample(@Param("record") sysMatFpCodeRulePO record, @Param("example") sysMatFpCodeRulePOExample example);

    int updateByPrimaryKeySelective(sysMatFpCodeRulePO record);

    int updateByPrimaryKey(sysMatFpCodeRulePO record);
}