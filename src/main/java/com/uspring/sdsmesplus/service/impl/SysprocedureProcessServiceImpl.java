package com.uspring.sdsmesplus.service.impl;

import com.uspring.sdsmesplus.dao.generate.SysProcedureProcessDao;
import com.uspring.sdsmesplus.entity.po.SysProcedureProcess;
import com.uspring.sdsmesplus.service.SysProcedureProcessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SysprocedureProcessServiceImpl implements SysProcedureProcessService {

    @Autowired
    private SysProcedureProcessDao dao;

    @Override
    public List<SysProcedureProcess> SelProcessParameters(String spcode, String frid) {
        return dao.SelProcessParameters(spcode,frid);
    }
}
