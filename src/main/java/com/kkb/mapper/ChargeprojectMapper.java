package com.kkb.mapper;

import com.kkb.pojo.Chargeproject;
import com.kkb.pojo.ChargeprojectExample;
import com.kkb.vo.AccountVO;
import com.kkb.vo.ChargeVO;
import com.kkb.vo.PayVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ChargeprojectMapper {
    long countByExample(ChargeprojectExample example);

    int deleteByExample(ChargeprojectExample example);

    int deleteByPrimaryKey(Integer chap_id);

    int insert(Chargeproject record);

    int insertSelective(Chargeproject record);

    List<Chargeproject> selectByExample(ChargeprojectExample example);

    Chargeproject selectByPrimaryKey(Integer chap_id);

    int updateByExampleSelective(@Param("record") Chargeproject record, @Param("example") ChargeprojectExample example);

    int updateByExample(@Param("record") Chargeproject record, @Param("example") ChargeprojectExample example);

    int updateByPrimaryKeySelective(Chargeproject record);

    int updateByPrimaryKey(Chargeproject record);

    /**
     * 通过病历号查询详细住院结算
     * @param id
     * @return com.kkb.vo.AccountVO
     */
    List<AccountVO> HospitalSettlementDetails(Integer id);
    /**
     * 住院结算分页查询
     * @param vo
     * @return com.kkb.vo.ChargeVO
     */
    List<ChargeVO> HospitalSettlement(PayVO vo);


}