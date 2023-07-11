package com.kkb.service;

import com.kkb.mapper.PricepeopleMapper;
import com.kkb.pojo.Pricepeople;
import com.kkb.pojo.PricepeopleExample;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
public class PricePeopleService {
    @Resource
    private PricepeopleMapper pricepeopleMapper;

    @Transactional(propagation = Propagation.REQUIRED,readOnly = true)
    public List<Pricepeople> queryByBeh_id(Integer beh_id){

//        多条件查询的容器；
        PricepeopleExample example = new PricepeopleExample();
        PricepeopleExample.Criteria criteria = example.createCriteria();

        criteria.andBeh_idEqualTo(beh_id);
        return pricepeopleMapper.selectByExample(example);
    }

    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = {Exception.class})
    public int addByBeh_idAndChap_id(Integer beh_id, Integer chap_id){
        //创建第三方表的对象；
        Pricepeople pricepeople = new Pricepeople();

        //设置上对应得id值
        pricepeople.setBeh_id(beh_id);
        pricepeople.setChap_id(chap_id);

//        返回对应的mapper中的sql语句 成功返回 1， 失败为 0
        return pricepeopleMapper.insertSelective(pricepeople);
    }
}
