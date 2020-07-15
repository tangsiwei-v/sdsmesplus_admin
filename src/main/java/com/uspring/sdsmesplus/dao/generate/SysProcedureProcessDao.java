package com.uspring.sdsmesplus.dao.generate;

import com.uspring.sdsmesplus.entity.po.SysProcedureProcess;
import com.uspring.sdsmesplus.entity.po.SysProcedureProcessExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysProcedureProcessDao {
    long countByExample(SysProcedureProcessExample example);

    int deleteByExample(SysProcedureProcessExample example);

    int deleteByPrimaryKey(Integer spId);

    int insert(SysProcedureProcess record);

    int insertSelective(SysProcedureProcess record);

    List<SysProcedureProcess> selectByExample(SysProcedureProcessExample example);

    SysProcedureProcess selectByPrimaryKey(Integer spId);

    int updateByExampleSelective(@Param("record") SysProcedureProcess record, @Param("example") SysProcedureProcessExample example);

    int updateByExample(@Param("record") SysProcedureProcess record, @Param("example") SysProcedureProcessExample example);

    int updateByPrimaryKeySelective(SysProcedureProcess record);

    int updateByPrimaryKey(SysProcedureProcess record);

    public List<SysProcedureProcess> SelProcessParameters(@Param("spcode")String spcode,@Param("frid")String frid);
}