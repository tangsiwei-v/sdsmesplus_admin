package com.uspring.sdsmesplus.dao.generate;

import com.uspring.sdsmesplus.entity.po.SysAuthorityPO;
import com.uspring.sdsmesplus.entity.po.SysAuthorityPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysAuthorityPODao {
    long countByExample(SysAuthorityPOExample example);

    int deleteByExample(SysAuthorityPOExample example);

    int deleteByPrimaryKey(Integer authId);

    int insert(SysAuthorityPO record);

    int insertSelective(SysAuthorityPO record);

    List<SysAuthorityPO> selectByExample(SysAuthorityPOExample example);

    SysAuthorityPO selectByPrimaryKey(Integer authId);

    int updateByExampleSelective(@Param("record") SysAuthorityPO record, @Param("example") SysAuthorityPOExample example);

    int updateByExample(@Param("record") SysAuthorityPO record, @Param("example") SysAuthorityPOExample example);

    int updateByPrimaryKeySelective(SysAuthorityPO record);

    int updateByPrimaryKey(SysAuthorityPO record);
}