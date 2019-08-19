package com.uspring.sdsmesplus.dao.generate;

import com.uspring.sdsmesplus.entity.po.DictDataPO;
import com.uspring.sdsmesplus.entity.po.DictDataPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DictDataPODao {
    long countByExample(DictDataPOExample example);

    int deleteByExample(DictDataPOExample example);

    int deleteByPrimaryKey(Integer ddId);

    int insert(DictDataPO record);

    int insertSelective(DictDataPO record);

    List<DictDataPO> selectByExample(DictDataPOExample example);

    DictDataPO selectByPrimaryKey(Integer ddId);

    int updateByExampleSelective(@Param("record") DictDataPO record, @Param("example") DictDataPOExample example);

    int updateByExample(@Param("record") DictDataPO record, @Param("example") DictDataPOExample example);

    int updateByPrimaryKeySelective(DictDataPO record);

    int updateByPrimaryKey(DictDataPO record);
}