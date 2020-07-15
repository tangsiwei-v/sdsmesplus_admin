package com.uspring.sdsmesplus.service;

import com.uspring.sdsmesplus.entity.po.SysProcedureProcess;

import java.util.List;

public interface SysProcedureProcessService {

    public List<SysProcedureProcess> SelProcessParameters(String spcode, String frid);
}
