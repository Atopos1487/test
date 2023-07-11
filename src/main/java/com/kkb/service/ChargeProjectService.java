package com.kkb.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kkb.mapper.ChargeprojectMapper;
import com.kkb.pojo.Chargeproject;
import com.kkb.pojo.ChargeprojectExample;
import com.kkb.vo.ChargeProjectVO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ChargeProjectService {
    @Resource
    private ChargeprojectMapper chargeprojectMapper;



    @Transactional(propagation = Propagation.REQUIRED,readOnly = true)
    public List<Chargeproject> queryByName(String chap_name){

        ChargeprojectExample example=new ChargeprojectExample();
        ChargeprojectExample.Criteria criteria = example.createCriteria();

        criteria.andChap_nameEqualTo(chap_name);
        return chargeprojectMapper.selectByExample(example);
    }


    @Transactional(propagation = Propagation.REQUIRED, readOnly = true)
    public PageInfo<Chargeproject> queryByPage(Integer pageNum, Integer pageSize, ChargeProjectVO vo) {
        //多条件
        ChargeprojectExample example = new ChargeprojectExample();
        //创建条件的容器；
        ChargeprojectExample.Criteria criteria = example.createCriteria();

        if (vo != null) {         //trim()是去除前后的空格；

            if (vo.getChap_name()!= null && !"".equals(vo.getChap_name().trim())) {
                criteria.andChap_nameLike("%" + vo.getChap_name().trim() + "%");

            }

        }
        //分页插件的使用（仅对相邻的单个 有效）
        PageHelper.startPage(pageNum, pageSize);
        List<Chargeproject> list = chargeprojectMapper.selectByExample(example);

        return new PageInfo<>(list);

    }

    /**
     * 根据主键去查询全部的数据；
     */
    @Transactional(propagation = Propagation.REQUIRED,readOnly = true)
    public Chargeproject queryById(int chap_id){
        return chargeprojectMapper.selectByPrimaryKey(chap_id);
    }

    /**
     * 添加一个球队；
     */
    //增删改要有（事务）                 事务                     回滚
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = {Exception.class})
    public int add(Chargeproject c){
        return chargeprojectMapper.insertSelective(c);
    }



    /**
     * 根据主键去更新一个球队；
     */
    //增删改的事务相同；
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = {Exception.class})
    public int update(Chargeproject c ){
        //根据主键动态更新（非空列去更新）
        return chargeprojectMapper.updateByPrimaryKeySelective(c);
    }





    /**
     * 根据主键去删除（逻辑删除）一个收费项目；
     */
    //增删改的事务相同；
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = {Exception.class})
    public int deleteChargeProject(int chap_id){
        Chargeproject c=chargeprojectMapper.selectByPrimaryKey(chap_id);
        c.setIsDel(1);//逻辑删除，将标识位进行修改；
        return   chargeprojectMapper.updateByPrimaryKeySelective(c);
    }



}
