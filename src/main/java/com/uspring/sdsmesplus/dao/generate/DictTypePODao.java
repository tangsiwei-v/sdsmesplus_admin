package com.uspring.sdsmesplus.dao.generate;

import com.uspring.sdsmesplus.entity.po.DictTypePO;
import com.uspring.sdsmesplus.entity.po.DictTypePOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DictTypePODao {
    long countByExample(DictTypePOExample example);

    int deleteByExample(DictTypePOExample example);

    int deleteByPrimaryKey(String dtCode);

    int insert(DictTypePO record);

    int insertSelective(DictTypePO record);

    List<DictTypePO> selectByExample(DictTypePOExample example);

    DictTypePO selectByPrimaryKey(String dtCode);

    int updateByExampleSelective(@Param("record") DictTypePO record, @Param("example") DictTypePOExample example);

    int updateByExample(@Param("record") DictTypePO record, @Param("example") DictTypePOExample example);

    int updateByPrimaryKeySelective(DictTypePO record);

    int updateByPrimaryKey(DictTypePO record);
}