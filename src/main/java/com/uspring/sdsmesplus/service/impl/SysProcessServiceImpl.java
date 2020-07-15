package com.uspring.sdsmesplus.service.impl;

import com.uspring.sdsmesplus.dao.generate.SysProcessPODao;
import com.uspring.sdsmesplus.entity.po.SysProcessPO;
import com.uspring.sdsmesplus.service.SysProcessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SysProcessServiceImpl implements SysProcessService {

    @Autowired
    private SysProcessPODao sysProcessPODao;

    @Override
    public List<SysProcessPO> selectBylineID(int lineid) {
        return sysProcessPODao.selectBylineID(lineid);
    }
}
