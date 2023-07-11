package com.kkb.mapper;

import com.kkb.pojo.Behospital;
import com.kkb.pojo.BehospitalExample;
import java.util.List;

import com.kkb.vo.PayDepositVO;
import org.apache.ibatis.annotations.Param;

public interface BehospitalMapper {
    long countByExample(BehospitalExample example);

    int deleteByExample(BehospitalExample example);

    int deleteByPrimaryKey(Integer beh_id);

    int insert(Behospital record);

    int insertSelective(Behospital record);

    List<Behospital> selectByExample(BehospitalExample example);

    Behospital selectByPrimaryKey(Integer beh_id);

    int updateByExampleSelective(@Param("record") Behospital record, @Param("example") BehospitalExample example);

    int updateByExample(@Param("record") Behospital record, @Param("example") BehospitalExample example);

    int updateByPrimaryKeySelective(Behospital record);

    int updateByPrimaryKey(Behospital record);
    /**
     * 查询押金
     * @param id
     * @return com.kkb.vo.PayDepositVO
     */
    PayDepositVO payDeposit(Integer id);

    /**
     * 查询病床号
     * @param bhPatBed
     * @return com.kkb.pojo.Behospital
     */
    Behospital selectBed(String bhPatBed);
    
}