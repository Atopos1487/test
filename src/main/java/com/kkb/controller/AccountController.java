package com.kkb.controller;

import com.github.pagehelper.PageInfo;
import com.kkb.pojo.Behospital;
import com.kkb.service.AccountService;
import com.kkb.vo.AccountVO;
import com.kkb.vo.ChargeVO;
import com.kkb.vo.PayVO;
import com.kkb.vo.ResultVO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Description:
 * @Author: Wade
 * @Date: 2021/8/18 11:10
 * @Version: 1.0
 */
@Controller
@ResponseBody
@RequestMapping("pay")
public class AccountController {
    @Resource
    private AccountService service;

    @RequestMapping("list")
    public ResultVO<ChargeVO> queryByPage(Integer pageNum, Integer pageSize, PayVO vo){
        if (pageNum==null || pageNum<=0){
            pageNum=1;
        }
        if (pageSize==null || pageSize<=0){
            pageSize=5;
        }
        PageInfo<ChargeVO> pageInfo = service.queryPage(pageNum,pageSize, vo);
        return new ResultVO<>(pageInfo);
    }

    @RequestMapping(value = "{id}",method = RequestMethod.GET)
    public ResultVO<AccountVO> selectAccountById(@PathVariable Integer id){
        List<AccountVO> list = service.accountCharge(id);
        return new ResultVO<>(list);
    }

    @RequestMapping(value = "{id}",method = RequestMethod.DELETE)
    public ResultVO<Behospital> del(@PathVariable Integer id){
        int i = service.updateState(id);
        if (i == 1){
            return new ResultVO<>();
        }
        return new ResultVO<Behospital>(500,"服务器错误!");
    }

}
