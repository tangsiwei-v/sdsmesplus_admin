package com.uspring.sdsmesplus.dao.generate;

import com.uspring.sdsmesplus.entity.po.DevicePO;
import com.uspring.sdsmesplus.entity.po.DevicePOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DevicePODao {
    long countByExample(DevicePOExample example);

    int deleteByExample(DevicePOExample example);

    int deleteByPrimaryKey(Integer devId);

    int insert(DevicePO record);

    int insertSelective(DevicePO record);

    List<DevicePO> selectByExample(DevicePOExample example);

    DevicePO selectByPrimaryKey(Integer devId);

    int updateByExampleSelective(@Param("record") DevicePO record, @Param("example") DevicePOExample example);

    int updateByExample(@Param("record") DevicePO record, @Param("example") DevicePOExample example);

    int updateByPrimaryKeySelective(DevicePO record);

    int updateByPrimaryKey(DevicePO record);
}