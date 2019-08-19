package com.uspring.sdsmesplus.dao.generate;

import com.uspring.sdsmesplus.entity.po.EmployeePO;
import com.uspring.sdsmesplus.entity.po.EmployeePOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EmployeePODao {
    long countByExample(EmployeePOExample example);

    int deleteByExample(EmployeePOExample example);

    int deleteByPrimaryKey(String badge);

    int insert(EmployeePO record);

    int insertSelective(EmployeePO record);

    List<EmployeePO> selectByExample(EmployeePOExample example);

    EmployeePO selectByPrimaryKey(String badge);

    int updateByExampleSelective(@Param("record") EmployeePO record, @Param("example") EmployeePOExample example);

    int updateByExample(@Param("record") EmployeePO record, @Param("example") EmployeePOExample example);

    int updateByPrimaryKeySelective(EmployeePO record);

    int updateByPrimaryKey(EmployeePO record);
}