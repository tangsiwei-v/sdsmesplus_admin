package com.uspring.sdsmesplus.dao.generate;

import com.uspring.sdsmesplus.entity.po.ProdProcessCheckPO;
import com.uspring.sdsmesplus.entity.po.ProdProcessCheckPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProdProcessCheckPODao {
    long countByExample(ProdProcessCheckPOExample example);

    int deleteByExample(ProdProcessCheckPOExample example);

    int deleteByPrimaryKey(Integer ppcId);

    int insert(ProdProcessCheckPO record);

    int insertSelective(ProdProcessCheckPO record);

    List<ProdProcessCheckPO> selectByExample(ProdProcessCheckPOExample example);

    ProdProcessCheckPO selectByPrimaryKey(Integer ppcId);

    int updateByExampleSelective(@Param("record") ProdProcessCheckPO record, @Param("example") ProdProcessCheckPOExample example);

    int updateByExample(@Param("record") ProdProcessCheckPO record, @Param("example") ProdProcessCheckPOExample example);

    int updateByPrimaryKeySelective(ProdProcessCheckPO record);

    int updateByPrimaryKey(ProdProcessCheckPO record);
}