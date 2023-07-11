package com.kkb.controller;

import com.github.pagehelper.PageInfo;
import com.kkb.pojo.Behospital;
import com.kkb.pojo.Department;
import com.kkb.pojo.Doctor;
import com.kkb.pojo.Hosregister;
import com.kkb.service.BeHospitalService;
import com.kkb.vo.BeHospitalVO;
import com.kkb.vo.PayDepositVO;
import com.kkb.vo.ResultVO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Description:
 * @Author: Wade
 * @Date: 2021/8/15 18:56
 * @Version: 1.0
 */
@Controller
@ResponseBody
@RequestMapping("beHospital")
public class BeHospitalController {
    @Resource
    private BeHospitalService service;

    @RequestMapping("list")
    public ResultVO<Behospital> queryByPage(Integer pageNum, Integer pageSize,BeHospitalVO vo){
        if (pageNum==null || pageNum<=0){
            pageNum=1;
        }
        if (pageSize==null || pageSize<=0){
            pageSize=5;
        }
        PageInfo<Behospital> pageInfo = service.queryByPage(pageNum,pageSize, vo);
        return new ResultVO<>(pageInfo);
    }
    @RequestMapping(value = "",method = RequestMethod.POST)
    public ResultVO<Behospital> add(Behospital behospital){
        int i = service.addBehospital(behospital);
        if (i==1){
            return new ResultVO<>();
        }
        return new ResultVO<Behospital>(500,"服务器错误!");
    }
    @RequestMapping(value = "{id}",method = RequestMethod.PUT)
    public ResultVO<Behospital> update(@PathVariable Integer id,Behospital behospital){
        behospital.setBeh_id(id);
        int i = service.updateBehospital(behospital);
        if (i==1){
            return new ResultVO<>();
        }
        return new ResultVO<Behospital>(500,"服务器错误!");
    }

    @RequestMapping(value = "charge/{id}",method = RequestMethod.DELETE)
    public ResultVO<Behospital> charge(@PathVariable Integer id){
        int i = service.charge(id);
        if (i == 1){
            return new ResultVO<>();
        }
        return new ResultVO<Behospital>(500,"服务器错误!");
    }

    @RequestMapping(value = "exit/{id}",method = RequestMethod.DELETE)
    public ResultVO<Behospital> exit(@PathVariable Integer id){
        int i = service.exit(id);
        if (i == 1){
            return new ResultVO<>();
        }
        return new ResultVO<Behospital>(500,"服务器错误!");
    }

    @RequestMapping(value = "{id}",method = RequestMethod.GET)
    public ResultVO<Behospital> queryByBehId(@PathVariable Integer id){
        Behospital behospital = service.queryByBehId(id);
        return new ResultVO<>(behospital);
    }
    @RequestMapping(value = "pay",method = RequestMethod.PUT)
    public ResultVO<Behospital> updatePay(@RequestParam("id") Integer id, @RequestParam("price") Integer price){
        int i = service.updatePay(id,price);
        if (i == 1){
            return new ResultVO<>();
        }
        return new ResultVO<Behospital>(500,"服务器错误!");
    }
    @RequestMapping(value = "pay/{id}",method = RequestMethod.GET)
    public ResultVO<PayDepositVO> selectPay(@PathVariable Integer id){
        PayDepositVO payDepositVO = service.selectPay(id);
        return new ResultVO<>(payDepositVO);
    }

    @RequestMapping(value = "bed/{bhPatBed}",method = RequestMethod.GET)
    public ResultVO<Behospital> selectBed(@PathVariable String bhPatBed){
        Behospital behospital = service.selectBed(bhPatBed);
        if (behospital==null){
            return new ResultVO<>();
        }
        return new ResultVO<Behospital>(500,"服务器错误!");
    }
    @RequestMapping(value = "hrIdLike/{id}",method = RequestMethod.GET)
    public ResultVO<Integer> selectHrIdList(@PathVariable Integer id){
        List<Integer> list = service.selectHrId(id);
        return new ResultVO<>(list);
    }
    @RequestMapping(value = "hrId/{id}",method = RequestMethod.GET)
    public ResultVO<Hosregister> selectHrId(@PathVariable Integer id){
        Hosregister hosregister = service.selectById(id);
        return new ResultVO<>(hosregister);
    }


    @RequestMapping(value = "doctor",method = RequestMethod.GET)
    public ResultVO<Department> selectDepartments(){
        List<Department> departments = service.departments();
        return new ResultVO<>(departments);
    }
    @RequestMapping(value = "doctor/{beh_dep}",method = RequestMethod.GET)
    public ResultVO<Doctor> selectDoctors(@PathVariable Integer beh_dep){
        List<Doctor> doctors = service.doctors(beh_dep);
        return new ResultVO<>(doctors);
    }


}
