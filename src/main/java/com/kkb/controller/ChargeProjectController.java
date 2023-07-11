package com.kkb.controller;


import com.github.pagehelper.PageInfo;
import com.kkb.pojo.Behospital;
import com.kkb.pojo.Chargeproject;
import com.kkb.pojo.Patient;
import com.kkb.pojo.Pricepeople;
import com.kkb.service.BeHospitalService;
import com.kkb.service.ChargeProjectService;
import com.kkb.service.PatientService;
import com.kkb.service.PricePeopleService;
import com.kkb.vo.ChargeProjectVO;
import com.kkb.vo.ResultVO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * 收费的项目的控制器层；
 */
@Controller
@RequestMapping("charge")
@ResponseBody
public class ChargeProjectController {
    /**
     * 三表联查；
     */
    @Resource
    private ChargeProjectService chargeProjectService;
    @Resource
    private PatientService patientService;
    @Resource
    private PricePeopleService pricePeopleService;



        //填充不同表中的数据；
    @RequestMapping(value = "beh",method = RequestMethod.GET)
    public ResultVO<List<Chargeproject>> queryChapByBeh_id(Integer beh_id){

// 1、创建（第三方关系表）的集合 根据病人的id（beh_id） 去建立关系 获取到（第三方关系表）中全部数据；
//        主要获取的是收费项目的（chap_id）
        List<Pricepeople> pricepeoples = pricePeopleService.queryByBeh_id(beh_id);

// 2、提前创建（甲方关系表）收费项目的集合；
        List<Chargeproject> chargeprojects = new ArrayList<>();

//循环遍历（第三方表中的（chap_id） ） 去匹配上甲方（本身的id）并获取（甲方）全部的数据 添加（add）到甲方的集合
        for(Pricepeople pricepeople : pricepeoples){
//            找出相对应于beh_id 的 甲方（收费项目）的全部数据进行添加
            chargeprojects.add(chargeProjectService.queryById(pricepeople.getChap_id()));
        }
        return new ResultVO<List<Chargeproject>>(chargeprojects);
    }

        //根据（病号） 和  （项目编号）添加到第三方的表中；
    //根据病号（beh_id 和 chap_id） 搞一下
    @RequestMapping(value = "beh",method = RequestMethod.POST)
    public ResultVO<Behospital> addByBeh_idAndChap_id(Integer beh_id, Integer chap_id){
        if( pricePeopleService.addByBeh_idAndChap_id(beh_id, chap_id) == 1)
            return new ResultVO<>();

        else return  new ResultVO<>(500,"服务器错误，添加失败");
    }

        //点击（详情）进入 （多表联查）数据；
    @RequestMapping(value = "beh/{id}",method = RequestMethod.GET)
    public ResultVO<Patient> queryBehById(@PathVariable("id") Integer p_id){
        Patient patient = patientService.queryById(p_id);
        return new ResultVO<>(patient);
    }

// 根据收费项目名称去查询 输入的项目是否存在,并返回相对应的收费金额（chap_money）;
    @RequestMapping(value = "name",method = RequestMethod.GET)
    public ResultVO<Chargeproject> queryChapByIName(String chap_name){
        List<Chargeproject> chargeprojects = chargeProjectService.queryByName(chap_name);

        if(chargeprojects.size() != 0){

            return new ResultVO<>(chargeprojects.get(0));
        }
        return new ResultVO<>(500, "项目名输入错误");
    }

    //1.多条件分页查询
    @RequestMapping(value = "list",method = RequestMethod.GET)  //RequestParam（给上默认的值 value=“”）
    public ResultVO<Chargeproject> queryByPage(Integer pageNum, Integer pageSize, ChargeProjectVO vo){
        if(pageNum==null || pageNum<=0){//pageNum不合法时；
            pageNum=1;//给上默认的值；
        }
        if(pageSize==null || pageSize<=0){//pagesize不合法时；
            pageSize=5;//给上默认的值；
        }

        PageInfo<Chargeproject> teamPageInfo = chargeProjectService.queryByPage(pageNum, pageSize, vo);
        return new ResultVO<>(teamPageInfo);
    }

    //2.根据主键ID去查询；
    @RequestMapping(value = "{id}",method =RequestMethod.GET)
    public ResultVO<Chargeproject> queryById(@PathVariable("id") Integer chap_id){
        Chargeproject  c = chargeProjectService.queryById(chap_id);

        return  new ResultVO<>(c);
    }

//   3.添加一个：
@RequestMapping(value = "",method =RequestMethod.POST)
public ResultVO<Chargeproject> add(Chargeproject c){

    int i = chargeProjectService.add(c);
    if(i==1){
        return new ResultVO<Chargeproject>();
    }
    return new  ResultVO<>(500,"添加失败！异常请 重试；");
}


    //4.根据主键ID去更新某一支球队  （restful风格）
    @RequestMapping(value = "{id}",method =RequestMethod.PUT)
    public ResultVO<Chargeproject> updateTeam(@PathVariable("id")Integer Id , Chargeproject c){
        //前端的<input name="teamId"  type="text" disabled/> 后台获取不到
        c.setChap_id(Id);//通过路径的value = “{id}”去获取对应的id值;
        int i = chargeProjectService.update(c);
        if(i==1){
            return new ResultVO<Chargeproject>();
        }
        return new  ResultVO<>(500,"更新异常！请重试");

    }



    //5.根据主键ID去删除（restful风格）本质是更新状态标志；
    @RequestMapping(value = "{id}", method=RequestMethod.DELETE)
    public  ResultVO<Chargeproject> deleteChargeProject(@PathVariable("id")Integer  Id){
        int i = chargeProjectService.deleteChargeProject(Id);
        if(i==1){
            return new ResultVO<Chargeproject>();
        }
        return new  ResultVO<>(500,"更新异常！请重试");
    }

}
