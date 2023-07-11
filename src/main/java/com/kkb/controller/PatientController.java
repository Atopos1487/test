package com.kkb.controller;

import com.github.pagehelper.PageInfo;
import com.kkb.pojo.Chargeproject;
import com.kkb.pojo.Patient;
import com.kkb.service.PatientService;
import com.kkb.vo.PatientVO;
import com.kkb.vo.ResultVO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * 病人的控制器层；
 */
@Controller
@RequestMapping("charge2")
@ResponseBody
public class PatientController {
    @Resource
    private PatientService patientService;


    //1.多条件分页查询
    @RequestMapping(value = "list",method = RequestMethod.GET)  //RequestParam（给上默认的值 value=“”）
    public ResultVO<Patient> queryByPage(Integer pageNum, Integer pageSize, PatientVO vo){
        if(pageNum==null || pageNum<=0){//pageNum不合法时；
            pageNum=1;//给上默认的值；
        }
        if(pageSize==null || pageSize<=0){//pagesize不合法时；
            pageSize=5;//给上默认的值；
        }

        PageInfo<Patient> teamPageInfo = patientService.queryByPage(pageNum, pageSize, vo);
        return new ResultVO<>(teamPageInfo);
    }

    //2.根据主键ID去查询；
    @RequestMapping(value = "{id}",method =RequestMethod.GET)
    public ResultVO<Patient> queryById(@PathVariable("id") Integer p_id){
        Patient  c = patientService.queryById(p_id);

        return  new ResultVO<>(c);
    }





}
