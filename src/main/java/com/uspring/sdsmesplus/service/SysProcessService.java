package com.uspring.sdsmesplus.service;

import com.uspring.sdsmesplus.entity.po.SysProcessPO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SysProcessService {

    List<SysProcessPO> selectBylineID(int lineid);
}
