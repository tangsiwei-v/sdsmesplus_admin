package com.uspring.sdsmesplus.dao.generate;

import com.uspring.sdsmesplus.entity.po.SysDeviceVerifyItemPO;
import com.uspring.sdsmesplus.entity.po.SysDeviceVerifyItemPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysDeviceVerifyItemPODao {
    long countByExample(SysDeviceVerifyItemPOExample example);

    int deleteByExample(SysDeviceVerifyItemPOExample example);

    int deleteByPrimaryKey(Integer dviId);

    int insert(SysDeviceVerifyItemPO record);

    int insertSelective(SysDeviceVerifyItemPO record);

    List<SysDeviceVerifyItemPO> selectByExample(SysDeviceVerifyItemPOExample example);

    SysDeviceVerifyItemPO selectByPrimaryKey(Integer dviId);

    int updateByExampleSelective(@Param("record") SysDeviceVerifyItemPO record, @Param("example") SysDeviceVerifyItemPOExample example);

    int updateByExample(@Param("record") SysDeviceVerifyItemPO record, @Param("example") SysDeviceVerifyItemPOExample example);

    int updateByPrimaryKeySelective(SysDeviceVerifyItemPO record);

    int updateByPrimaryKey(SysDeviceVerifyItemPO record);
}