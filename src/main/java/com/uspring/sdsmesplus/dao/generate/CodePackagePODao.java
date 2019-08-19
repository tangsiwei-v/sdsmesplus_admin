package com.uspring.sdsmesplus.dao.generate;

import com.uspring.sdsmesplus.entity.po.CodePackagePO;
import com.uspring.sdsmesplus.entity.po.CodePackagePOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CodePackagePODao {
    long countByExample(CodePackagePOExample example);

    int deleteByExample(CodePackagePOExample example);

    int deleteByPrimaryKey(Integer cpId);

    int insert(CodePackagePO record);

    int insertSelective(CodePackagePO record);

    List<CodePackagePO> selectByExample(CodePackagePOExample example);

    CodePackagePO selectByPrimaryKey(Integer cpId);

    int updateByExampleSelective(@Param("record") CodePackagePO record, @Param("example") CodePackagePOExample example);

    int updateByExample(@Param("record") CodePackagePO record, @Param("example") CodePackagePOExample example);

    int updateByPrimaryKeySelective(CodePackagePO record);

    int updateByPrimaryKey(CodePackagePO record);
}