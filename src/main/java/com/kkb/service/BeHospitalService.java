package com.kkb.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kkb.mapper.*;
import com.kkb.pojo.*;
import com.kkb.vo.BeHospitalVO;
import com.kkb.vo.PayDepositVO;
import com.kkb.vo.ResultVO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import javax.print.Doc;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

/**
 * @Description:
 * @Author: Wade
 * @Date: 2021/8/13 23:55
 * @Version: 1.0
 */
@Service
public class BeHospitalService {

    @Resource
    private BehospitalMapper behospitalMapper;
    @Resource
    private DoctorMapper doctorMapper;
    @Resource
    private DepartmentMapper departmentMapper;
    @Resource
    private HosregisterMapper hosregisterMapper;

    /**
     * 分页查询
     * @param pageNum
     * @param vo
     * @return com.github.pagehelper.PageInfo<com.kkb.pojo.Behospital>
     */
    public PageInfo<Behospital> queryByPage(Integer pageNum,Integer pageSize,BeHospitalVO vo){
        BehospitalExample example = new BehospitalExample();
        BehospitalExample.Criteria criteria = example.createCriteria();
        if (vo!=null){
            if (vo.getHosr_id()!=null){
                criteria.andHosr_idEqualTo(vo.getHosr_id());
            }
            if (vo.getD_name()!=null&&!"".equals(vo.getD_name().trim())){
                int id = doctorMapper.selectByDName(vo.getD_name());
                criteria.andD_idEqualTo(id);
            }
            if (vo.getDep_name()!=null&&!"".equals(vo.getDep_name().trim())){
                int i = departmentMapper.selectByDepName(vo.getDep_name());
                criteria.andBeh_depEqualTo(i);
            }
            if (vo.getBeginDate()!=null){
                criteria.andBeh_intimeGreaterThanOrEqualTo(vo.getBeginDate());
            }
            if (vo.getEndDate()!=null){
                criteria.andBeh_intimeLessThanOrEqualTo(vo.getEndDate());
            }
        }
        PageHelper.startPage(pageNum, pageSize);
        List<Behospital> list = behospitalMapper.selectByExample(example);
        for (Behospital behospital : list) {
            behospital.setHosregister(hosregisterMapper.selectByPrimaryKey(behospital.getHosr_id()));
            behospital.setDoctor(doctorMapper.selectByPrimaryKey(behospital.getD_id()));
            behospital.setDepartment(departmentMapper.selectByPrimaryKey(behospital.getBeh_dep()));
        }
        return new PageInfo<>(list);
    }

    /**
     * 通过病历号查询信息
     * @param id
     * @return com.kkb.pojo.Hosregister
     */
    public Hosregister queryById(Integer id){
        return hosregisterMapper.selectByPrimaryKey(id);
    }
    /**
     * 通过住院号查询信息
     * @param id
     * @return com.kkb.pojo.Hosregister
     */
    public Behospital queryByBehId(Integer id){
        Behospital behospital = behospitalMapper.selectByPrimaryKey(id);
        behospital.setHosregister(hosregisterMapper.selectByPrimaryKey(behospital.getHosr_id()));
        behospital.setDoctor(doctorMapper.selectByPrimaryKey(behospital.getD_id()));
        behospital.setDepartment(departmentMapper.selectByPrimaryKey(behospital.getBeh_dep()));
        return behospital;
    }
    /**
     * 添加住院信息
     * @param behospital
     * @return int
     */
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = {Exception.class})
    public int addBehospital(Behospital behospital){
        behospital.setBeh_intime(new Date());
        behospital.setBeh_closeprice(0);
        behospital.setBeh_state(0);
        return behospitalMapper.insertSelective(behospital);
    }
    /**
     * 更新住院信息
     * @param behospital
     * @return int
     */
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = {Exception.class})
    public int updateBehospital(Behospital behospital){
        return behospitalMapper.updateByPrimaryKeySelective(behospital);
    }

    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = {Exception.class})
    public int charge(Integer id){
        //出院
        Hosregister hosregister = new Hosregister();
        hosregister.setHosr_id(id);
        hosregister.setHosr_state(2);
        return hosregisterMapper.updateByPrimaryKeySelective(hosregister);
    }

    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = {Exception.class})
    public int exit(Integer id){
        //出院
        Hosregister hosregister = new Hosregister();
        hosregister.setHosr_id(id);
        hosregister.setHosr_state(4);
        return hosregisterMapper.updateByPrimaryKeySelective(hosregister);
    }
    /**
     * 缴纳押金
     * @param id
     * @param price
     * @return int
     */
    public int updatePay(Integer id,Integer price){
        System.out.println(price);
        Behospital behospital = new Behospital();
        behospital.setBeh_id(id);
        behospital.setBeh_antecedent(price);
        return behospitalMapper.updateByPrimaryKeySelective(behospital);
    }
    /**
     * 查询押金
     * @param id
     * @return com.kkb.vo.PayDepositVO
     */
    public PayDepositVO selectPay(Integer id){
        return behospitalMapper.payDeposit(id);
    }

    public Behospital selectBed(String bhPatBed){
        return behospitalMapper.selectBed(bhPatBed);
    }

    public List<Integer> selectHrId(Integer id){
        return hosregisterMapper.selectHrId(id);
    }
    public Hosregister selectById(Integer id){
        Hosregister hosregister = hosregisterMapper.selectByPrimaryKey(id);
        hosregister.setDoctor(doctorMapper.selectByPrimaryKey(hosregister.getD_id()));
        hosregister.setDepartment(departmentMapper.selectByPrimaryKey(hosregister.getDep_id()));
        return hosregister;
    }


    /**
     *
     * @param pageNum
     * @param pageSize
     * @param beh_id
     * @param beh_name
     * @return
     */
    @Transactional(propagation = Propagation.REQUIRED,readOnly = true)
    public PageInfo<Behospital> queryByPage(Integer pageNum, Integer pageSize, Integer beh_id, String beh_name){
        //多条件
        BehospitalExample example=new BehospitalExample();
        //创建条件的容器
        BehospitalExample.Criteria criteria = example.createCriteria();
        if(beh_id != null && beh_id != 0){
            criteria.andBeh_idEqualTo(beh_id);
        }
        if(beh_name != null && !"".equals(beh_name)){
            criteria.andBeh_nameLike("%" + beh_name + "%");
        }
        //分页
        PageHelper.startPage(pageNum,pageSize);
        List<Behospital> list = behospitalMapper.selectByExample(example);
        return new PageInfo<>(list);
    }



    @Transactional(propagation = Propagation.REQUIRED,readOnly = true)
    public Behospital queryById2(Integer beh_id){
        return behospitalMapper.selectByPrimaryKey(beh_id);
    }

    public List<Department> departments(){
        return departmentMapper.selectDep();
    }

    public List<Doctor> doctors(Integer beh_dep){
        return doctorMapper.selectDoctorByDepId(beh_dep);
    }





}
