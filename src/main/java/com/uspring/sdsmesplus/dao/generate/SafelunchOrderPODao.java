package com.uspring.sdsmesplus.dao.generate;

import com.uspring.sdsmesplus.entity.po.SafelunchOrderPO;
import com.uspring.sdsmesplus.entity.po.SafelunchOrderPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SafelunchOrderPODao {
    long countByExample(SafelunchOrderPOExample example);

    int deleteByExample(SafelunchOrderPOExample example);

    int deleteByPrimaryKey(Integer safboxId);

    int insert(SafelunchOrderPO record);

    int insertSelective(SafelunchOrderPO record);

    List<SafelunchOrderPO> selectByExample(SafelunchOrderPOExample example);

    SafelunchOrderPO selectByPrimaryKey(Integer safboxId);

    int updateByExampleSelective(@Param("record") SafelunchOrderPO record, @Param("example") SafelunchOrderPOExample example);

    int updateByExample(@Param("record") SafelunchOrderPO record, @Param("example") SafelunchOrderPOExample example);

    int updateByPrimaryKeySelective(SafelunchOrderPO record);

    int updateByPrimaryKey(SafelunchOrderPO record);
}