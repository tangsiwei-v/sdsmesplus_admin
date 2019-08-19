package com.uspring.sdsmesplus.dao.generate;

import com.uspring.sdsmesplus.entity.po.SysLineProdmodelPO;
import com.uspring.sdsmesplus.entity.po.SysLineProdmodelPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysLineProdmodelPODao {
    long countByExample(SysLineProdmodelPOExample example);

    int deleteByExample(SysLineProdmodelPOExample example);

    int deleteByPrimaryKey(Integer linemodId);

    int insert(SysLineProdmodelPO record);

    int insertSelective(SysLineProdmodelPO record);

    List<SysLineProdmodelPO> selectByExample(SysLineProdmodelPOExample example);

    SysLineProdmodelPO selectByPrimaryKey(Integer linemodId);

    int updateByExampleSelective(@Param("record") SysLineProdmodelPO record, @Param("example") SysLineProdmodelPOExample example);

    int updateByExample(@Param("record") SysLineProdmodelPO record, @Param("example") SysLineProdmodelPOExample example);

    int updateByPrimaryKeySelective(SysLineProdmodelPO record);

    int updateByPrimaryKey(SysLineProdmodelPO record);
}