package com.kkb.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kkb.mapper.BehospitalMapper;
import com.kkb.mapper.ChargeprojectMapper;
import com.kkb.mapper.HosregisterMapper;
import com.kkb.pojo.Behospital;
import com.kkb.pojo.BehospitalExample;
import com.kkb.vo.AccountVO;
import com.kkb.vo.ChargeVO;
import com.kkb.vo.PayVO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Description:
 * @Author: Wade
 * @Date: 2021/8/16 22:57
 * @Version: 1.0
 */
@Service
public class AccountService {
    @Resource
    private ChargeprojectMapper chargeprojectMapper;
    @Resource
    private BehospitalMapper behospitalMapper;
    @Resource
    private HosregisterMapper hosregisterMapper;

    /**
     * 通过病历号查询住院结算
     * @param id
     * @return com.kkb.vo.AccountVO
     */
    public List<AccountVO> accountCharge(Integer id){
        return chargeprojectMapper.HospitalSettlementDetails(id);
    }
    /**
     * 分页查询住院结算
     * @param pageNum
     * @param vo
     * @return com.github.pagehelper.PageInfo<com.kkb.vo.ChargeVO>
     */
    public PageInfo<ChargeVO> queryPage(Integer pageNum,Integer pageSize,PayVO vo){
        PageHelper.startPage(pageNum, pageSize);
        List<ChargeVO> list = chargeprojectMapper.HospitalSettlement(vo);
        for (ChargeVO chargeVO : list) {
            chargeVO.setHosregister(hosregisterMapper.selectByPrimaryKey(chargeVO.getHosr_id()));
        }
        return new PageInfo<>(list);
    }
    /**
     * 结算
     * @param id
     * @return int
     */
    public int updateState(Integer id){
        Behospital behospital = behospitalMapper.selectByPrimaryKey(id);
        behospital.setBeh_closeprice(1);
        return behospitalMapper.updateByPrimaryKeySelective(behospital);
    }

}
