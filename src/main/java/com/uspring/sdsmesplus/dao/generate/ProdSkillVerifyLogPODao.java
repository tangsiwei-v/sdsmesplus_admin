package com.uspring.sdsmesplus.dao.generate;

import com.uspring.sdsmesplus.entity.po.ProdSkillVerifyLogPO;
import com.uspring.sdsmesplus.entity.po.ProdSkillVerifyLogPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProdSkillVerifyLogPODao {
    long countByExample(ProdSkillVerifyLogPOExample example);

    int deleteByExample(ProdSkillVerifyLogPOExample example);

    int deleteByPrimaryKey(Integer svId);

    int insert(ProdSkillVerifyLogPO record);

    int insertSelective(ProdSkillVerifyLogPO record);

    List<ProdSkillVerifyLogPO> selectByExample(ProdSkillVerifyLogPOExample example);

    ProdSkillVerifyLogPO selectByPrimaryKey(Integer svId);

    int updateByExampleSelective(@Param("record") ProdSkillVerifyLogPO record, @Param("example") ProdSkillVerifyLogPOExample example);

    int updateByExample(@Param("record") ProdSkillVerifyLogPO record, @Param("example") ProdSkillVerifyLogPOExample example);

    int updateByPrimaryKeySelective(ProdSkillVerifyLogPO record);

    int updateByPrimaryKey(ProdSkillVerifyLogPO record);
}