package com.uspring.sdsmesplus.dao.generate;

import com.uspring.sdsmesplus.entity.po.AgvConfigKqPO;
import com.uspring.sdsmesplus.entity.po.AgvConfigKqPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AgvConfigKqPODao {
    long countByExample(AgvConfigKqPOExample example);

    int deleteByExample(AgvConfigKqPOExample example);

    int deleteByPrimaryKey(Integer agvcfgId);

    int insert(AgvConfigKqPO record);

    int insertSelective(AgvConfigKqPO record);

    List<AgvConfigKqPO> selectByExample(AgvConfigKqPOExample example);

    AgvConfigKqPO selectByPrimaryKey(Integer agvcfgId);

    int updateByExampleSelective(@Param("record") AgvConfigKqPO record, @Param("example") AgvConfigKqPOExample example);

    int updateByExample(@Param("record") AgvConfigKqPO record, @Param("example") AgvConfigKqPOExample example);

    int updateByPrimaryKeySelective(AgvConfigKqPO record);

    int updateByPrimaryKey(AgvConfigKqPO record);
}