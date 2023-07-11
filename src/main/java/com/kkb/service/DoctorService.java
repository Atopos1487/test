package com.kkb.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kkb.mapper.DoctorMapper;
import com.kkb.pojo.Doctor;
import com.kkb.pojo.DoctorExample;
import com.kkb.vo.DoctorVO;
import com.kkb.vo.PatientVO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * 医生的业务逻辑层；
 */
@Service
public class DoctorService {
    @Resource
    private DoctorMapper doctorMapper;


    @Transactional(propagation = Propagation.REQUIRED, readOnly = true)
    public PageInfo<Doctor> queryByPage(Integer pageNum, Integer pageSize, DoctorVO vo) {
        //多条件
        DoctorExample example = new DoctorExample();
        //创建条件的容器；
        DoctorExample.Criteria criteria = example.createCriteria();

        if (vo != null) {         //trim()是去除前后的空格；
            if (vo.getD_id() != null) {
                criteria.andD_idEqualTo(vo.getD_id());
            }
            if (vo.getD_name() != null && !"".equals(vo.getD_name().trim())) {
                criteria.andD_nameLike("%" + vo.getD_name().trim() + "%");
            }
            if (vo.getDep_id() != null) {
                criteria.andDep_idEqualTo(vo.getDep_id());
            }

        }
        //分页插件的使用（仅对相邻的单个 有效）
        PageHelper.startPage(pageNum, pageSize);
        System.out.println(pageNum);
        System.out.println(pageSize);
        List<Doctor> list = doctorMapper.selectByExample(example);

        return new PageInfo<>(list);

    }

//    设置医生的（d_intime注册时间）和（其他的数据）
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = {Exception.class})
    public int addDoctor(Doctor doctor){
        doctor.setD_intime(new Date());
        return doctorMapper.insertSelective(doctor);
    }

//回显医生的基本数据；
@Transactional(propagation = Propagation.REQUIRED,readOnly = true)
public Doctor queryById(Integer d_id){
    return doctorMapper.selectByPrimaryKey(d_id);
}

//更新医生的全部数据；
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = {Exception.class})
    public int updateDoctor(Doctor doctor){
        return doctorMapper.updateByPrimaryKeySelective(doctor);
    }








}