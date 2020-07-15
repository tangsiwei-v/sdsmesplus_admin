package com.uspring.sdsmesplus.controller;

import com.uspring.sdsmesplus.entity.po.ProdBatchLogPO;
import com.uspring.sdsmesplus.entity.vo.MatBatchCodeVO;
import com.uspring.sdsmesplus.entity.vo.ProdBatchCodeVO;
import com.uspring.sdsmesplus.entity.vo.ProdBoxLogVO;
import com.uspring.sdsmesplus.entity.vo.Result;
import com.uspring.sdsmesplus.enums.StatusCode;
import com.uspring.sdsmesplus.service.RetrospectServer;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author liubo@uspring.cn
 * @Description:
 * @date 2020/5/11 10:13
 */
@Controller
@RequestMapping("/api/batch_trace")
public class RetrospectServerController {


    @Autowired
    private RetrospectServer retrospectServer;





    @ResponseBody
    @RequestMapping(value = "/forward/{matBatchNo}", method = RequestMethod.GET)
    @ApiOperation(value = "根据零件批号正向追溯", response = Result.class)
    public Result queryForwardTrace(@PathVariable("matBatchNo") String matBatchNo
                  ) {
        List<ProdBatchCodeVO> resultList = retrospectServer.listForwardTraceByMatBatchNo(matBatchNo);
        return new Result("查询成功",resultList , StatusCode.SUCCESS);
    }

    @ResponseBody
    @RequestMapping(value = "/reverse/{prodBatchCode}", method = RequestMethod.GET)
    @ApiOperation(value = "根据成品批号反向追溯", response = Result.class)
    public Result queryReverseTrace(@PathVariable("prodBatchCode") String prodBatchCode
    ) {
        return new Result("查询成功", retrospectServer.listReverseTraceByProdBatchCode(prodBatchCode), StatusCode.SUCCESS);
    }

    @ResponseBody
    @RequestMapping(value = "/details",method = RequestMethod.GET)
    @ApiOperation(value = "根据批号获取批号详情", response = Result.class)
    public Result queryBatchDetails(String prodBatchCode
    ) {
        List<ProdBatchLogPO> resutlList = retrospectServer.getByProdBatchCode(prodBatchCode);
        return new Result("查询成功",resutlList , StatusCode.SUCCESS);
    }

    @ResponseBody
    @RequestMapping(value = "/box_log",method = RequestMethod.GET)
    @ApiOperation(value = "根据批号获取箱号信息", response = Result.class)
    public Result queryBox_Log(String prodBatchCode
    ) {
        List<ProdBoxLogVO> resultList = retrospectServer.listBoxLogByProdBatchCode(prodBatchCode);
        return new Result("查询成功",resultList , StatusCode.SUCCESS);
    }



}
