package com.uspring.sdsmesplus.dao.generate;

import com.uspring.sdsmesplus.entity.po.NonconformProductMaterialPO;
import com.uspring.sdsmesplus.entity.po.NonconformProductMaterialPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NonconformProductMaterialPODao {
    long countByExample(NonconformProductMaterialPOExample example);

    int deleteByExample(NonconformProductMaterialPOExample example);

    int deleteByPrimaryKey(Integer nplmId);

    int insert(NonconformProductMaterialPO record);

    int insertSelective(NonconformProductMaterialPO record);

    List<NonconformProductMaterialPO> selectByExample(NonconformProductMaterialPOExample example);

    NonconformProductMaterialPO selectByPrimaryKey(Integer nplmId);

    int updateByExampleSelective(@Param("record") NonconformProductMaterialPO record, @Param("example") NonconformProductMaterialPOExample example);

    int updateByExample(@Param("record") NonconformProductMaterialPO record, @Param("example") NonconformProductMaterialPOExample example);

    int updateByPrimaryKeySelective(NonconformProductMaterialPO record);

    int updateByPrimaryKey(NonconformProductMaterialPO record);
}