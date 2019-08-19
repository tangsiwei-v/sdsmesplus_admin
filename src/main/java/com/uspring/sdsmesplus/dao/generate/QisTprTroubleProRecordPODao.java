package com.uspring.sdsmesplus.dao.generate;

import com.uspring.sdsmesplus.entity.po.QisTprTroubleProRecordPO;
import com.uspring.sdsmesplus.entity.po.QisTprTroubleProRecordPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QisTprTroubleProRecordPODao {
    long countByExample(QisTprTroubleProRecordPOExample example);

    int deleteByExample(QisTprTroubleProRecordPOExample example);

    int deleteByPrimaryKey(Integer tprId);

    int insert(QisTprTroubleProRecordPO record);

    int insertSelective(QisTprTroubleProRecordPO record);

    List<QisTprTroubleProRecordPO> selectByExample(QisTprTroubleProRecordPOExample example);

    QisTprTroubleProRecordPO selectByPrimaryKey(Integer tprId);

    int updateByExampleSelective(@Param("record") QisTprTroubleProRecordPO record, @Param("example") QisTprTroubleProRecordPOExample example);

    int updateByExample(@Param("record") QisTprTroubleProRecordPO record, @Param("example") QisTprTroubleProRecordPOExample example);

    int updateByPrimaryKeySelective(QisTprTroubleProRecordPO record);

    int updateByPrimaryKey(QisTprTroubleProRecordPO record);
}