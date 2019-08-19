package com.uspring.sdsmesplus.dao.generate;

import com.uspring.sdsmesplus.entity.po.SysLinePO;
import com.uspring.sdsmesplus.entity.po.SysLinePOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysLinePODao {
    long countByExample(SysLinePOExample example);

    int deleteByExample(SysLinePOExample example);

    int deleteByPrimaryKey(Integer lineId);

    int insert(SysLinePO record);

    int insertSelective(SysLinePO record);

    List<SysLinePO> selectByExample(SysLinePOExample example);

    SysLinePO selectByPrimaryKey(Integer lineId);

    int updateByExampleSelective(@Param("record") SysLinePO record, @Param("example") SysLinePOExample example);

    int updateByExample(@Param("record") SysLinePO record, @Param("example") SysLinePOExample example);

    int updateByPrimaryKeySelective(SysLinePO record);

    int updateByPrimaryKey(SysLinePO record);

}