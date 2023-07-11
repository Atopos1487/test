package com.kkb.controller;


import com.github.pagehelper.PageInfo;
import com.kkb.pojo.Department;
import com.kkb.pojo.Doctor;
import com.kkb.pojo.Patient;
import com.kkb.service.DepartmentService;
import com.kkb.service.DoctorService;
import com.kkb.vo.DoctorVO;
import com.kkb.vo.PatientVO;
import com.kkb.vo.ResultVO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("doctor")
@ResponseBody
public class DoctorController {
//    两表联查
    @Resource
    private DoctorService doctorService;
    @Resource
    private DepartmentService departmentService;

    //1.多条件分页查询
    @RequestMapping(value = "list",method = RequestMethod.GET)  //RequestParam（给上默认的值 value=“”）
    public ResultVO<Doctor> queryByPage(Integer pageNum, Integer pageSize, DoctorVO vo){
        if(pageNum==null || pageNum<=0){//pageNum不合法时；
            pageNum=1;//给上默认的值；
        }
        if(pageSize==null || pageSize<=0){//pagesize不合法时；
            pageSize=5;//给上默认的值；
        }

        if(vo.getDep_name() != null && !"".equals(vo.getDep_name())){
            vo.setDep_id(departmentService.queryByName(vo.getDep_name()).get(0).getDep_id()) ;
        }

        PageInfo<Doctor> doctorPageInfo = doctorService.queryByPage(pageNum, pageSize, vo);

        List<Doctor> doctors = doctorPageInfo.getList();
        for(Doctor doctor : doctors){
            doctor.setDep_name(departmentService.queryById(doctor.getDep_id()).getDep_name());
        }


        return new ResultVO<>(doctorPageInfo);
    }

//添加所有医生所属部门的信息；
    @RequestMapping(value = "dep/all",method = RequestMethod.GET)
    public ResultVO<List<Department>> queryAllDep(){

        return new ResultVO<List<Department>>(departmentService.getAll());
    }


//    添加医生基本所有的信息；
    @RequestMapping(value = "",method = RequestMethod.POST)
    public ResultVO<Doctor> addDoctor(Doctor doctor){

        doctor.setDep_id(Integer.parseInt(doctor.getDep_name()));

        int i = doctorService.addDoctor(doctor);
        if(i==1){
            return new ResultVO<>();
        }
        return new ResultVO<>(500,"服务器内部异常，请稍后再试！");
    }

//    回显数据
    @RequestMapping(value = "{id}",method = RequestMethod.GET)
    public ResultVO<Doctor> queryById(@PathVariable("id") Integer d_id){
        Doctor doctor = doctorService.queryById(d_id);
        doctor.setDep_name(departmentService.queryById(doctor.getDep_id()).getDep_name());
        return new ResultVO<>(doctor);
    }

//    更新数据；
    @RequestMapping(value = "{id}",method = RequestMethod.PUT)
    public ResultVO<Doctor> updateDoctor(@PathVariable("id")Integer d_id ,   Doctor doctor){
          doctor.setD_id(d_id);
        doctor.setDep_id(Integer.parseInt(doctor.getDep_name()));
        int i = doctorService.updateDoctor(doctor);
        if(i == 1){
            return new ResultVO<>();
        }
        return new ResultVO<>(500,"服务器内部异常，请稍后再试！");
    }


}
