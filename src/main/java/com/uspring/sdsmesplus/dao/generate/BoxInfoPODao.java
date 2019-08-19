package com.uspring.sdsmesplus.dao.generate;

import com.uspring.sdsmesplus.entity.po.BoxInfoPO;
import com.uspring.sdsmesplus.entity.po.BoxInfoPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BoxInfoPODao {
    long countByExample(BoxInfoPOExample example);

    int deleteByExample(BoxInfoPOExample example);

    int deleteByPrimaryKey(Integer bifId);

    int insert(BoxInfoPO record);

    int insertSelective(BoxInfoPO record);

    List<BoxInfoPO> selectByExample(BoxInfoPOExample example);

    BoxInfoPO selectByPrimaryKey(Integer bifId);

    int updateByExampleSelective(@Param("record") BoxInfoPO record, @Param("example") BoxInfoPOExample example);

    int updateByExample(@Param("record") BoxInfoPO record, @Param("example") BoxInfoPOExample example);

    int updateByPrimaryKeySelective(BoxInfoPO record);

    int updateByPrimaryKey(BoxInfoPO record);
}