package com.kkb.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import com.kkb.mapper.BehospitalMapper;
import com.kkb.mapper.DrugMapper;
import com.kkb.mapper.DrugpeopleMapper;
import com.kkb.pojo.*;
import com.kkb.vo.DandPVO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class DispensingService {

    @Resource
    BehospitalMapper behospitalMapper;
    @Resource
    DrugpeopleMapper drugpeopleMapper;
    @Resource
    DrugMapper drugMapper;


    //分页查询
    @Transactional(propagation = Propagation.REQUIRED, readOnly = true)
    public PageInfo<Behospital> QueryByPage(Integer pageNum, Integer pageSize, Integer peopleid) {
        BehospitalExample example = new BehospitalExample();
        BehospitalExample.Criteria criteria = example.createCriteria();
        if (peopleid!=null){
            criteria.andBeh_idEqualTo(peopleid);
        }
        PageHelper.startPage(pageNum, pageSize);
        List<Behospital> behospitals = behospitalMapper.selectByExample(example);
       /* if(behospitals.size()!=0) {
            for (Behospital behospital : behospitals) {
                DrugpeopleExample drugpeopleExample = new DrugpeopleExample();
                DrugpeopleExample.Criteria dpCriteria = drugpeopleExample.createCriteria();
                dpCriteria.andPeopleidEqualTo(behospital.getBeh_id());
                List<Drugpeople> drugpeoples = drugpeopleMapper.selectByExample(drugpeopleExample);
                List<Drug> drugs = new ArrayList<>();
                if (drugpeoples.size()!=0) {
                    for (Drugpeople drugpeople : drugpeoples) {
                        Drug drug = drugMapper.selectByPrimaryKey(drugpeople.getDr_id());
                        drugs.add(drug);
                    }
                }
                behospital.setDrugs(drugs);
            }
        }*/
        return new PageInfo<>(behospitals);
    }

    @Transactional(propagation = Propagation.REQUIRED, readOnly = true)
    public PageInfo<DandPVO> QueryByPageAndId(Integer pageNum, Integer pageSize, Integer peopleid) {
        DrugpeopleExample example = new DrugpeopleExample();
        DrugpeopleExample.Criteria criteria = example.createCriteria();
        criteria.andPeopleidEqualTo(peopleid);
        PageHelper.startPage(pageNum, pageSize);
        List<Drugpeople> drugpeople = drugpeopleMapper.selectByExample(example);
        PageInfo<Drugpeople> drugpeoplePageInfo = new PageInfo<>(drugpeople);
        //查询出中间表后，依次根据信息查询各表中的信息，存储到一个查询VO中
        List<DandPVO> dandPVOS = new ArrayList<>();
        for (Drugpeople drugperson : drugpeople) {
            DandPVO dandPVO = new DandPVO();
            dandPVO.setBeh_name(behospitalMapper.selectByPrimaryKey(drugperson.getPeopleid()).getBeh_name());
            Drug drug = drugMapper.selectByPrimaryKey(drugperson.getDr_id());
            Integer dr_number = drugperson.getDr_number();
            if (dr_number == null) {
                dr_number = 0;
            }
            Integer dr_putnumber = drugperson.getDr_putnumber();
            if (dr_putnumber == null) {
                dr_putnumber = 0;
            }
            dandPVO.setDr_id(drug.getDr_id());
            dandPVO.setDr_name(drug.getDr_name());
            dandPVO.setDr_number(dr_number);
            dandPVO.setDr_putnumber(dr_putnumber);
            dandPVO.setNeedNumber(dr_number - dr_putnumber);
            dandPVOS.add(dandPVO);
        }
        PageInfo<DandPVO> dandPVOPageInfo = new PageInfo<>(dandPVOS);
        dandPVOPageInfo.setPageSize(drugpeoplePageInfo.getPageSize());
        dandPVOPageInfo.setPageNum(drugpeoplePageInfo.getPageNum());
        dandPVOPageInfo.setNextPage(drugpeoplePageInfo.getNextPage());
        dandPVOPageInfo.setTotal(drugpeoplePageInfo.getTotal());
        dandPVOPageInfo.setPages(drugpeoplePageInfo.getPages());
        dandPVOPageInfo.setPrePage(drugpeoplePageInfo.getPrePage());
        dandPVOPageInfo.setIsFirstPage(drugpeoplePageInfo.isIsFirstPage());
        dandPVOPageInfo.setIsLastPage(drugpeoplePageInfo.isIsLastPage());
        return dandPVOPageInfo;
    }

    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {Exception.class})
    public int giveDrug(Integer peopleid, Integer dr_id, Integer number) {
        Drugpeople drugpeople = new Drugpeople();
        drugpeople.setDr_number(number);
        drugpeople.setPeopleid(peopleid);
        drugpeople.setDr_id(dr_id);
        drugpeople.setDr_putnumber(0);
        DrugpeopleExample example = new DrugpeopleExample();
        DrugpeopleExample.Criteria criteria = example.createCriteria();
        criteria.andPeopleidEqualTo(peopleid);
        criteria.andDr_idEqualTo(dr_id);
        int i = 0;
        List<Drugpeople> drugpeople1 = drugpeopleMapper.selectByExample(example);
        if (drugpeople1.size() == 0) {
            i = drugpeopleMapper.insertSelective(drugpeople);
            System.out.println("结果是" + i);
        } else {
            i = drugpeopleMapper.updateByExampleSelective(drugpeople, example);
        }
        return i;
    }

    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {Exception.class})
    public int grant(Integer peopleid, Integer dr_id, Integer type) {
        Drugpeople drugpeople = new Drugpeople();
        drugpeople.setPeopleid(peopleid);
        drugpeople.setDr_id(dr_id);
        DrugpeopleExample example = new DrugpeopleExample();
        DrugpeopleExample.Criteria criteria = example.createCriteria();
        criteria.andPeopleidEqualTo(peopleid);
        criteria.andDr_idEqualTo(dr_id);
        List<Drugpeople> drugpeople1 = drugpeopleMapper.selectByExample(example);
        Drugpeople drugpeople2 = drugpeople1.get(0);
        switch (type) {
            case 1: {
                drugpeople.setDr_number(drugpeople2.getDr_number());
                drugpeople.setDr_putnumber(drugpeople2.getDr_number());
            }
            break;
            case 2: {
                Integer dr_number = drugpeople2.getDr_number();
                Integer dr_putnumber = drugpeople2.getDr_putnumber();
                drugpeople.setDr_number(dr_number);
                if (dr_putnumber == dr_number) {
                    return 0;
                } else {
                    drugpeople.setDr_putnumber(dr_putnumber + 1);
                }
            }
            break;
            case 3: {
                Integer dr_number = drugpeople2.getDr_number();
                Integer dr_putnumber = drugpeople2.getDr_putnumber();
                drugpeople.setDr_number(dr_number);
                if (dr_putnumber + 5 > dr_number) {
                    return 0;
                } else {
                    drugpeople.setDr_putnumber(dr_putnumber + 5);
                }
            }
            break;
        }
        int i = drugpeopleMapper.updateByExampleSelective(drugpeople, example);
        return i;
    }

    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {Exception.class})
    public int giveDrugs(List<Integer> peopleids, Integer dr_id, Integer number) {
        int sum = 0;
        for (Integer peopleid : peopleids) {
            Drugpeople drugpeople = new Drugpeople();
            drugpeople.setDr_number(number);
            drugpeople.setDr_putnumber(0);
            drugpeople.setPeopleid(peopleid);
            drugpeople.setDr_id(dr_id);
            DrugpeopleExample example = new DrugpeopleExample();
            DrugpeopleExample.Criteria criteria = example.createCriteria();
            criteria.andPeopleidEqualTo(peopleid);
            criteria.andDr_idEqualTo(dr_id);
            int i = 0;
            List<Drugpeople> drugpeople1 = drugpeopleMapper.selectByExample(example);
            if (drugpeople1.size() == 0) {
                i = drugpeopleMapper.insertSelective(drugpeople);
            } else {
                i = drugpeopleMapper.updateByExampleSelective(drugpeople, example);
            }
            sum += i;
        }
        return sum;
    }
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {Exception.class})
    public int deletePatient(List<Integer> ids) {
        int result = 0;
        for (Integer id : ids) {
            if (ids.size() == 0) {
                return result;
            } else {
                int i = drugpeopleMapper.deleteByPrimaryKey(id);
                result += i;
            }
        }
        return result;
    }
}
