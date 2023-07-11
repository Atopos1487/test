package com.kkb.service;

import com.kkb.mapper.DepartmentMapper;
import com.kkb.pojo.Department;
import com.kkb.pojo.DepartmentExample;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


import javax.annotation.Resource;
import java.util.List;

/**
 * （两表联查）附属类
 */
@Service
public class DepartmentService {
    @Resource
    private DepartmentMapper departmentMapper;

    //获取科室所有的信息
    @Transactional(propagation = Propagation.REQUIRED,readOnly = true)
    public List<Department> getAll(){
        return departmentMapper.selectByExample(new DepartmentExample());
    }



    @Transactional(propagation = Propagation.REQUIRED,readOnly = true)
    public Department queryById(Integer dep_id){
        return departmentMapper.selectByPrimaryKey(dep_id);
    }


    @Transactional(propagation = Propagation.REQUIRED,readOnly = true)
    public List<Department> queryByName(String dep_name){
        DepartmentExample example=new DepartmentExample();
        DepartmentExample.Criteria criteria = example.createCriteria();
        criteria.andDep_nameLike("%" +dep_name+ "%");
        return departmentMapper.selectByExample(example);
    }
}

