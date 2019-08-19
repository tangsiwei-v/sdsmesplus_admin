package com.uspring.sdsmesplus.dao.generate;

import com.uspring.sdsmesplus.entity.po.SafelunchProductLogPO;
import com.uspring.sdsmesplus.entity.po.SafelunchProductLogPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SafelunchProductLogPODao {
    long countByExample(SafelunchProductLogPOExample example);

    int deleteByExample(SafelunchProductLogPOExample example);

    int deleteByPrimaryKey(Integer resId);

    int insert(SafelunchProductLogPO record);

    int insertSelective(SafelunchProductLogPO record);

    List<SafelunchProductLogPO> selectByExample(SafelunchProductLogPOExample example);

    SafelunchProductLogPO selectByPrimaryKey(Integer resId);

    int updateByExampleSelective(@Param("record") SafelunchProductLogPO record, @Param("example") SafelunchProductLogPOExample example);

    int updateByExample(@Param("record") SafelunchProductLogPO record, @Param("example") SafelunchProductLogPOExample example);

    int updateByPrimaryKeySelective(SafelunchProductLogPO record);

    int updateByPrimaryKey(SafelunchProductLogPO record);
}