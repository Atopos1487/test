package com.kkb.service;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kkb.mapper.PatientMapper;
import com.kkb.pojo.Chargeproject;
import com.kkb.pojo.Patient;
import com.kkb.pojo.PatientExample;
import com.kkb.vo.PatientVO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * 病人的业务逻辑层；
 */
@Service
public class PatientService {
    @Resource
    private PatientMapper patientMapper;

    /**
     *
     */
    @Transactional(propagation = Propagation.REQUIRED, readOnly = true)
    public PageInfo<Patient> queryByPage(Integer pageNum, Integer pageSize, PatientVO vo) {
        //多条件
        PatientExample example = new PatientExample();
        //创建条件的容器；
        PatientExample.Criteria criteria = example.createCriteria();

        if (vo != null) {         //trim()是去除前后的空格；
            if (vo.getP_id() != null) {
                criteria.andP_idEqualTo(vo.getP_id());
            }
            if (vo.getP_name() != null && !"".equals(vo.getP_name().trim())) {
                criteria.andP_nameLike("%" + vo.getP_name().trim() + "%");
            }

        }
        //分页插件的使用（仅对相邻的单个 有效）
        PageHelper.startPage(pageNum, pageSize);
        System.out.println(pageNum);
        System.out.println(pageSize);
        List<Patient> list = patientMapper.selectByExample(example);

        return new PageInfo<>(list);

    }

    /**
     * 根据主键去查询；
     */
    @Transactional(propagation = Propagation.REQUIRED,readOnly = true)
    public Patient queryById(int p_id){
        return patientMapper.selectByPrimaryKey(p_id);
    }





}