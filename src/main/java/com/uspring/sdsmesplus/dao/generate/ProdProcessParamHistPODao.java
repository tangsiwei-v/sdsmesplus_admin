package com.uspring.sdsmesplus.dao.generate;

import com.uspring.sdsmesplus.entity.po.ProdProcessParamHistPO;
import com.uspring.sdsmesplus.entity.po.ProdProcessParamHistPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProdProcessParamHistPODao {
    long countByExample(ProdProcessParamHistPOExample example);

    int deleteByExample(ProdProcessParamHistPOExample example);

    int deleteByPrimaryKey(Integer ppphId);

    int insert(ProdProcessParamHistPO record);

    int insertSelective(ProdProcessParamHistPO record);

    List<ProdProcessParamHistPO> selectByExample(ProdProcessParamHistPOExample example);

    ProdProcessParamHistPO selectByPrimaryKey(Integer ppphId);

    int updateByExampleSelective(@Param("record") ProdProcessParamHistPO record, @Param("example") ProdProcessParamHistPOExample example);

    int updateByExample(@Param("record") ProdProcessParamHistPO record, @Param("example") ProdProcessParamHistPOExample example);

    int updateByPrimaryKeySelective(ProdProcessParamHistPO record);

    int updateByPrimaryKey(ProdProcessParamHistPO record);

    int selectByRfid(@Param("rfid")String rfid);
}