package com.kkb.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kkb.mapper.DrugMapper;
import com.kkb.pojo.Drug;
import com.kkb.pojo.DrugExample;
import com.kkb.vo.DrugVO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;


@Service
public class DrugService {
    @Resource
    private DrugMapper drugMapper;
    public PageInfo<Drug> queryByPage(Integer pageNum, Integer pageSize, DrugVO vo) {
        DrugExample drugExample = new DrugExample();
        DrugExample.Criteria drugExampleCriteria = drugExample.createCriteria();
        if(vo!=null){
            if(vo.getDr_name()!=null &&!"".equals(vo.getDr_name().trim())){
                drugExampleCriteria.andDr_nameLike("%"+vo.getDr_name().trim()+"%");
            }
            if(vo.getDr_type()!=null &&!"".equals(vo.getDr_type().trim())){
                drugExampleCriteria.andDr_typeLike(vo.getDr_type().trim()+"%");
            }
        }
        //分页
        PageHelper.startPage(pageNum,pageSize);
        List<Drug> list = drugMapper.selectByExample(drugExample);
        return new PageInfo<>(list);
    }
    @Transactional(propagation = Propagation.REQUIRED,readOnly = true)
    public Drug drugById(Integer dr_id) {
        return drugMapper.selectByPrimaryKey(dr_id);
    }
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = {Exception.class})
    public int updateDrug(Drug drug) {
        return drugMapper.updateByPrimaryKeySelective(drug);
    }
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = {Exception.class})
    public int addDrug(Drug drug) {
        return  drugMapper.insertSelective(drug);
    }

    public List<Drug> queryAll() {
        DrugExample example = new DrugExample();
        DrugExample.Criteria criteria = example.createCriteria();
        return drugMapper.selectByExample(example);
    }
}
