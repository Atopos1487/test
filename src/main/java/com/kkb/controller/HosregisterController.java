package com.kkb.controller;

import com.github.pagehelper.PageInfo;
import com.kkb.pojo.Department;
import com.kkb.pojo.Doctor;
import com.kkb.pojo.Hosregister;
import com.kkb.service.HosregisterService;
import com.kkb.vo.HosregisterVo;
import com.kkb.vo.ResultVO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("hosregister")
@ResponseBody
public class HosregisterController {
    @Resource
    private HosregisterService hosregisterService;

    /**
     * 条件分页查询
     * @param pageNum
     * @param pageSize
     * @param vo
     * @return
     */
    @RequestMapping(value = "list",method = RequestMethod.GET)
    public ResultVO<Hosregister> getAll(Integer pageNum, Integer pageSize, HosregisterVo vo){
        if (pageNum==null || pageNum<=0){
            pageNum=1;
        }
        if (pageSize==null || pageSize<=0){
            pageSize=5;
        }
        PageInfo<Hosregister> all = hosregisterService.getAll(pageNum, pageSize, vo);
        return new ResultVO<>(all);
    }

    /**
     * 新增挂号
     * @param hosregister
     * @return
     */
    @RequestMapping(value = "",method = RequestMethod.POST)
    public ResultVO<Hosregister> add(Hosregister hosregister){
        int i = hosregisterService.add(hosregister);
        if (i==1){
            return new ResultVO<>();
        }
        return new ResultVO<>(500,"新增失败!");

    }

    /**
     * 主键查询
     * @param hosr_id
     * @return
     */
    @RequestMapping(value = "{hosr_id}",method = RequestMethod.GET)
    public ResultVO<Hosregister> queryById(@PathVariable("hosr_id")Integer hosr_id){
        Hosregister hosregister = hosregisterService.queryById(hosr_id);
        return new ResultVO<>(hosregister);
    }

    /**
     * 动态修改
     * @param hosr_id
     * @param hosregister
     * @return
     */
    @RequestMapping(value = "{hosr_id}",method = RequestMethod.PUT)
    public ResultVO<Hosregister> update(@PathVariable("hosr_id")Integer hosr_id,Hosregister hosregister){
        hosregister.setHosr_id(hosr_id);
        int i = hosregisterService.update(hosregister);
        if (i==1){
            return new ResultVO<>();
        }
        return new ResultVO<>(500,"更新失败!");
    }

    /**
     * 逻辑删除
     * @param hosr_id
     * @return
     */
    @RequestMapping(value = "{hosr_id}",method = RequestMethod.DELETE)
    public ResultVO<Hosregister> delete(@PathVariable("hosr_id")Integer hosr_id){
        int i = hosregisterService.delete(hosr_id);
        if (i==1){
            return new ResultVO<>();
        }
        return new ResultVO<>(500,"更新失败!");
    }
    /**
     * 主键查询2
     * @param hosr_id
     * @return
     */
    @RequestMapping(value = "/get/{id}",method = RequestMethod.GET)
    public ResultVO<Hosregister> queryById2(@PathVariable("id")Integer hosr_id){
        Hosregister hosregister = hosregisterService.queryById2(hosr_id);
        return new ResultVO<>(hosregister);
    }
    /**
     * 主键查询3
     * @param hosr_id
     * @return
     */
    @RequestMapping(value = "/get2/{beh_id}",method = RequestMethod.GET)
    public ResultVO<Hosregister> queryById3(@PathVariable("beh_id")Integer hosr_id){
        Hosregister hosregister = hosregisterService.queryById2(hosr_id);
        return new ResultVO<>(hosregister);
    }
    /**
     * 查询科室
     * @return
     */
    @RequestMapping(value = "/keshi/list",method = RequestMethod.GET)
    public ResultVO<Department> queryKeShi(){
        List<Department> departments = hosregisterService.queryKeShi();
        return new ResultVO<>(departments);
    }
    /**
     * 查询医生
     * @return
     */
    @RequestMapping(value = "/doctor/list1",method = RequestMethod.GET)
    public ResultVO<Doctor> queryDoctor(){
        List<Doctor> doctors = hosregisterService.queryDoctor();
        return new ResultVO<>(doctors);
    }

    /**
     * 查询
     * @param dep_id
     * @return
     */
    /**
    @RequestMapping(value = "/getOne/{dep_id}",method = RequestMethod.GET)
    public ResultVO<Doctor> queryById4(@PathVariable("dep_id")Integer dep_id){
        List<Doctor> doctors = hosregisterService.queryById3(dep_id);
        return new ResultVO<>(doctors);
    }**/
}
