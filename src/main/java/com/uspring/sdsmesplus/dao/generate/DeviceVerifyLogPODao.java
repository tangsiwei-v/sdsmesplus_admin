package com.uspring.sdsmesplus.dao.generate;

import com.uspring.sdsmesplus.entity.po.DeviceVerifyLogPO;
import com.uspring.sdsmesplus.entity.po.DeviceVerifyLogPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeviceVerifyLogPODao {
    long countByExample(DeviceVerifyLogPOExample example);

    int deleteByExample(DeviceVerifyLogPOExample example);

    int deleteByPrimaryKey(Integer dvId);

    int insert(DeviceVerifyLogPO record);

    int insertSelective(DeviceVerifyLogPO record);

    List<DeviceVerifyLogPO> selectByExample(DeviceVerifyLogPOExample example);

    DeviceVerifyLogPO selectByPrimaryKey(Integer dvId);

    int updateByExampleSelective(@Param("record") DeviceVerifyLogPO record, @Param("example") DeviceVerifyLogPOExample example);

    int updateByExample(@Param("record") DeviceVerifyLogPO record, @Param("example") DeviceVerifyLogPOExample example);

    int updateByPrimaryKeySelective(DeviceVerifyLogPO record);

    int updateByPrimaryKey(DeviceVerifyLogPO record);
}