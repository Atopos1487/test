package com.kkb.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kkb.mapper.DepartmentMapper;
import com.kkb.mapper.DoctorMapper;
import com.kkb.mapper.HosregisterMapper;
import com.kkb.pojo.*;
import com.kkb.vo.HosregisterVo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Service
public class HosregisterService {
    @Resource
    private HosregisterMapper hosregisterMapper;
    @Resource
    private DoctorMapper doctorMapper;
    @Resource
    private DepartmentMapper departmentMapper;

    /**
     *
     * @param pageNum
     * @param pageSize
     * @param vo
     * @return
     */
    public PageInfo<Hosregister> getAll(Integer pageNum, Integer pageSize, HosregisterVo vo){
        HosregisterExample hosregisterExample = new HosregisterExample();
        HosregisterExample.Criteria criteria = hosregisterExample.createCriteria();
        List<Hosregister> list = new ArrayList<>();
        if (vo!=null) {
            if (vo.getHosr_id()!=null){
                criteria.andHosr_idEqualTo(vo.getHosr_id());
            }
            if (vo.getD_name()!=null && !"".equals(vo.getD_name().trim())){
                DoctorExample doctorExample = new DoctorExample();
                DoctorExample.Criteria criteria1 = doctorExample.createCriteria();
                String d_name = vo.getD_name().trim();
                criteria1.andD_nameLike("%"+d_name+"%");
                List<Doctor> doctors = doctorMapper.selectByExample(doctorExample);
               /* Integer d_id =null;
                for (Doctor doctor : doctors) {
                    d_id = doctor.getD_id();
                }
                criteria.andD_idEqualTo(d_id);
                */
                if(doctors.size()==0){
                    PageHelper.startPage(pageNum,pageSize);
                    return new PageInfo<>(list);
                }
                criteria.andD_idEqualTo(doctors.get(0).getD_id());
            }
            if (vo.getDep_name()!=null && !"".equals(vo.getDep_name().trim())){
                DepartmentExample departmentExample = new DepartmentExample();
                DepartmentExample.Criteria criteria2 = departmentExample.createCriteria();
                String dep_name = vo.getDep_name().trim();
                criteria2.andDep_nameLike("%" + dep_name + "%");
                List<Department> departments = departmentMapper.selectByExample(departmentExample);
            /*    Integer dep_id =null;
                for (Department department : departments) {
                    dep_id = department.getDep_id();
                }
                criteria.andDep_idEqualTo(dep_id);*/
                if(departments.size()==0){
                    PageHelper.startPage(pageNum,pageSize);
                    return new PageInfo<>(list);
                }
                criteria.andD_idEqualTo(departments.get(0).getDep_id());
            }
            if (vo.getMinTime()!=null){
                criteria.andHosr_intimeGreaterThanOrEqualTo(vo.getMinTime());
            }
            if (vo.getMaxTime()!=null){
                criteria.andHosr_intimeLessThanOrEqualTo(vo.getMaxTime());
            }
        }
        PageHelper.startPage(pageNum,pageSize);
        List<Hosregister> hosregisters = hosregisterMapper.selectByExample(hosregisterExample);
        for (Hosregister hosregister : hosregisters) {
            hosregister.setDepartment(departmentMapper.selectByPrimaryKey(hosregister.getDep_id()));
            hosregister.setDoctor(doctorMapper.selectByPrimaryKey(hosregister.getD_id()));
        }
        return new PageInfo<>(hosregisters);
    }

    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = {Exception.class})
    public int add(Hosregister hosregister){
        hosregister.setHosr_intime(new Date());
        hosregister.setHosr_state(0);
        return hosregisterMapper.insert(hosregister);
    }

    public Hosregister queryById(Integer hosr_id){
        Hosregister hosregister = hosregisterMapper.selectByPrimaryKey(hosr_id);
        hosregister.setDepartment(departmentMapper.selectByPrimaryKey(hosregister.getDep_id()));
        hosregister.setDoctor(doctorMapper.selectByPrimaryKey(hosregister.getD_id()));
        return hosregister;
    }


    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = {Exception.class})
    public int update(Hosregister hosregister){
        int i = hosregisterMapper.updateByPrimaryKeySelective(hosregister);
        return i;
    }


    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = {Exception.class})
    public int delete(Integer hosr_id){
        Hosregister hosregister = hosregisterMapper.selectByPrimaryKey(hosr_id);
        if(hosregister.getHosr_state()==0){
            hosregister.setHosr_state(3);
        }else if (hosregister.getHosr_state()==1){
            hosregister.setHosr_state(2);
        }
        int i = hosregisterMapper.updateByPrimaryKeySelective(hosregister);
        return i;
    }

    public Hosregister queryById2(Integer hosr_id){
        Hosregister hosregister = hosregisterMapper.selectByPrimaryKey(hosr_id);
        hosregister.setDepartment(departmentMapper.selectByPrimaryKey(hosregister.getDep_id()));
        hosregister.setDoctor(doctorMapper.selectByPrimaryKey(hosregister.getD_id()));
        return hosregister;
    }


    public List<Department> queryKeShi(){
        DepartmentExample departmentExample = new DepartmentExample();
        List<Department> departments = departmentMapper.selectByExample(departmentExample);
        return departments;
    }

    public List<Doctor> queryDoctor(){
       DoctorExample doctorExample = new DoctorExample();
        List<Doctor> doctors = doctorMapper.selectByExample(doctorExample);
        return doctors;
    }
}
