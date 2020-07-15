package com.uspring.sdsmesplus.dao.generate;

import com.uspring.sdsmesplus.entity.po.SysProcessPO;
import com.uspring.sdsmesplus.entity.po.SysProcessPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysProcessPODao {
    long countByExample(SysProcessPOExample example);

    int deleteByExample(SysProcessPOExample example);

    int insert(SysProcessPO record);

    int insertSelective(SysProcessPO record);

    List<SysProcessPO> selectByExample(SysProcessPOExample example);

    int updateByExampleSelective(@Param("record") SysProcessPO record, @Param("example") SysProcessPOExample example);

    int updateByExample(@Param("record") SysProcessPO record, @Param("example") SysProcessPOExample example);

    List<SysProcessPO> selectBylineID(@Param("lineid") int lineid);
}