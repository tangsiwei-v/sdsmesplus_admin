package com.uspring.sdsmesplus.dao.generate;

import com.uspring.sdsmesplus.entity.po.SysProcessParamPO;
import com.uspring.sdsmesplus.entity.po.SysProcessParamPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysProcessParamPODao {
    long countByExample(SysProcessParamPOExample example);

    int deleteByExample(SysProcessParamPOExample example);

    int deleteByPrimaryKey(Integer ppId);

    int insert(SysProcessParamPO record);

    int insertSelective(SysProcessParamPO record);

    List<SysProcessParamPO> selectByExample(SysProcessParamPOExample example);

    SysProcessParamPO selectByPrimaryKey(Integer ppId);

    int updateByExampleSelective(@Param("record") SysProcessParamPO record, @Param("example") SysProcessParamPOExample example);

    int updateByExample(@Param("record") SysProcessParamPO record, @Param("example") SysProcessParamPOExample example);

    int updateByPrimaryKeySelective(SysProcessParamPO record);

    int updateByPrimaryKey(SysProcessParamPO record);
}