package com.uspring.sdsmesplus.controller;

import com.uspring.sdsmesplus.entity.po.ProdProcessParamHistPO;
import com.uspring.sdsmesplus.entity.po.SysProcedureProcess;
import com.uspring.sdsmesplus.entity.po.SysProcessPO;
import com.uspring.sdsmesplus.entity.vo.ProdProcessParam;
import com.uspring.sdsmesplus.entity.vo.Result;
import com.uspring.sdsmesplus.enums.StatusCode;
import com.uspring.sdsmesplus.service.ProdProcessParamHistPOService;
import com.uspring.sdsmesplus.service.SysProcedureProcessService;
import com.uspring.sdsmesplus.service.SysProcessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.*;

@Controller
@RequestMapping("/api/history")
public class ProdProcessParamHistPOController {

    @Autowired
    private ProdProcessParamHistPOService prodProcessParamHistPOService;

    @Autowired
    private SysProcedureProcessService sysProcedureProcessService;

    @Autowired
    private SysProcessService processService;

    @ResponseBody
    @RequestMapping(value = "/selByrfid",method = RequestMethod.GET)
    public Result selByrfid(String rfid){
        int lineid = prodProcessParamHistPOService.selectByRfid(rfid);                          //依据RFID查询产线id
        Set list = new HashSet();                                                               //不可重复集合存储工位集合
        List<SysProcessPO> slist = processService.selectBylineID(lineid);                       //得到工位id集合
        for(int i = 0;i<slist.size();i++){
            list.add(slist.get(i).getSpCode());
        }
        List<SysProcedureProcess> finallist = new ArrayList<SysProcedureProcess>();
        Iterator it = list.iterator();
        for (int i = 0;i<list.size();i++){                                                       //循环遍历得到每个工位下的集合

            while (it.hasNext()) {
                SysProcedureProcess model = new SysProcedureProcess();
                String spcode = (String) it.next();
                model.setSpcode(spcode);
                List<SysProcedureProcess> chiledlist = sysProcedureProcessService.SelProcessParameters(spcode,rfid);
                if(chiledlist.size()!=0){
                    model.setList(chiledlist);
                    chiledlist.add(chiledlist.get(0));              //添加测试数据
                    finallist.add(model);
                }else {
                    finallist.add(model);
                }
            }
        }

        return new Result("查询成功",finallist, StatusCode.SUCCESS);
    }
}
