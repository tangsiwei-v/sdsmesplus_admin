package com.uspring.sdsmesplus.dao.generate;

import com.uspring.sdsmesplus.entity.po.SafelunchWorkLinePO;
import com.uspring.sdsmesplus.entity.po.SafelunchWorkLinePOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SafelunchWorkLinePODao {
    long countByExample(SafelunchWorkLinePOExample example);

    int deleteByExample(SafelunchWorkLinePOExample example);

    int deleteByPrimaryKey(Integer saflineId);

    int insert(SafelunchWorkLinePO record);

    int insertSelective(SafelunchWorkLinePO record);

    List<SafelunchWorkLinePO> selectByExample(SafelunchWorkLinePOExample example);

    SafelunchWorkLinePO selectByPrimaryKey(Integer saflineId);

    int updateByExampleSelective(@Param("record") SafelunchWorkLinePO record, @Param("example") SafelunchWorkLinePOExample example);

    int updateByExample(@Param("record") SafelunchWorkLinePO record, @Param("example") SafelunchWorkLinePOExample example);

    int updateByPrimaryKeySelective(SafelunchWorkLinePO record);

    int updateByPrimaryKey(SafelunchWorkLinePO record);
}