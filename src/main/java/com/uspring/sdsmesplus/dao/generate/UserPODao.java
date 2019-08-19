package com.uspring.sdsmesplus.dao.generate;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.uspring.sdsmesplus.entity.po.UserPO;
import com.uspring.sdsmesplus.entity.po.UserPOExample;

public interface UserPODao {
    long countByExample(UserPOExample example);

    int deleteByExample(UserPOExample example);

    int deleteByPrimaryKey(Integer userId);

    int insert(UserPO record);

    int insertSelective(UserPO record);

    List<UserPO> selectByExample(UserPOExample example);

    UserPO selectByPrimaryKey(Integer userId);

    int updateByExampleSelective(@Param("record") UserPO record, @Param("example") UserPOExample example);

    int updateByExample(@Param("record") UserPO record, @Param("example") UserPOExample example);

    int updateByPrimaryKeySelective(UserPO record);

    int updateByPrimaryKey(UserPO record);
}