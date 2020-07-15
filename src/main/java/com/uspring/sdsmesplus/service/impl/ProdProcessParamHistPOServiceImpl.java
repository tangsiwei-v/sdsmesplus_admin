package com.uspring.sdsmesplus.service.impl;

import com.uspring.sdsmesplus.dao.generate.ProdProcessParamHistPODao;
import com.uspring.sdsmesplus.entity.po.ProdProcessParamHistPO;
import com.uspring.sdsmesplus.service.ProdProcessParamHistPOService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdProcessParamHistPOServiceImpl implements ProdProcessParamHistPOService {
    @Autowired
    private ProdProcessParamHistPODao prodProcessParamHistPODao;


    @Override
    public int selectByRfid(String rfid) {
        return prodProcessParamHistPODao.selectByRfid(rfid);
    }
}
