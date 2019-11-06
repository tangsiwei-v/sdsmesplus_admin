package com.uspring.sdsmesplus.dao.generate;

import com.uspring.sdsmesplus.entity.po.ProdProductMaterialPO;
import com.uspring.sdsmesplus.entity.po.ProdProductMaterialPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProdProductMaterialPODao {
    long countByExample(ProdProductMaterialPOExample example);

    int deleteByExample(ProdProductMaterialPOExample example);

    int deleteByPrimaryKey(Integer pmbId);

    int insert(ProdProductMaterialPO record);

    int insertSelective(ProdProductMaterialPO record);

    List<ProdProductMaterialPO> selectByExample(ProdProductMaterialPOExample example);

    ProdProductMaterialPO selectByPrimaryKey(Integer pmbId);

    int updateByExampleSelective(@Param("record") ProdProductMaterialPO record, @Param("example") ProdProductMaterialPOExample example);

    int updateByExample(@Param("record") ProdProductMaterialPO record, @Param("example") ProdProductMaterialPOExample example);

    int updateByPrimaryKeySelective(ProdProductMaterialPO record);

    int updateByPrimaryKey(ProdProductMaterialPO record);
}