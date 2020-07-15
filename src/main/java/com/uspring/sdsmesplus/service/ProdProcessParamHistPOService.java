package com.uspring.sdsmesplus.service;

import com.uspring.sdsmesplus.entity.po.ProdProcessParamHistPO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProdProcessParamHistPOService {
    int selectByRfid(@Param("rfid")String rfid);
}
