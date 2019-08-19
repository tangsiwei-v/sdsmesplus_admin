package com.uspring.sdsmesplus.dao.generate;

import com.uspring.sdsmesplus.entity.po.SysWorkshopPO;
import com.uspring.sdsmesplus.entity.po.SysWorkshopPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysWorkshopPODao {
    long countByExample(SysWorkshopPOExample example);

    int deleteByExample(SysWorkshopPOExample example);

    int deleteByPrimaryKey(Integer shopId);

    int insert(SysWorkshopPO record);

    int insertSelective(SysWorkshopPO record);

    List<SysWorkshopPO> selectByExample(SysWorkshopPOExample example);

    SysWorkshopPO selectByPrimaryKey(Integer shopId);

    int updateByExampleSelective(@Param("record") SysWorkshopPO record, @Param("example") SysWorkshopPOExample example);

    int updateByExample(@Param("record") SysWorkshopPO record, @Param("example") SysWorkshopPOExample example);

    int updateByPrimaryKeySelective(SysWorkshopPO record);

    int updateByPrimaryKey(SysWorkshopPO record);
}