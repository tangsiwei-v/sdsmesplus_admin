package com.uspring.sdsmesplus.dao.generate;

import com.uspring.sdsmesplus.entity.po.SysMaterialInheritPO;
import com.uspring.sdsmesplus.entity.po.SysMaterialInheritPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysMaterialInheritPODao {
    long countByExample(SysMaterialInheritPOExample example);

    int deleteByExample(SysMaterialInheritPOExample example);

    int deleteByPrimaryKey(Integer mathId);

    int insert(SysMaterialInheritPO record);

    int insertSelective(SysMaterialInheritPO record);

    List<SysMaterialInheritPO> selectByExample(SysMaterialInheritPOExample example);

    SysMaterialInheritPO selectByPrimaryKey(Integer mathId);

    int updateByExampleSelective(@Param("record") SysMaterialInheritPO record, @Param("example") SysMaterialInheritPOExample example);

    int updateByExample(@Param("record") SysMaterialInheritPO record, @Param("example") SysMaterialInheritPOExample example);

    int updateByPrimaryKeySelective(SysMaterialInheritPO record);

    int updateByPrimaryKey(SysMaterialInheritPO record);
}