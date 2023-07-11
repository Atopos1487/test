package com.kkb.mapper;

import com.kkb.pojo.Hospitaluser;
import com.kkb.pojo.HospitaluserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HospitaluserMapper {
    long countByExample(HospitaluserExample example);

    int deleteByExample(HospitaluserExample example);

    int deleteByPrimaryKey(String u_phone);

    int insert(Hospitaluser record);

    int insertSelective(Hospitaluser record);

    List<Hospitaluser> selectByExample(HospitaluserExample example);

    Hospitaluser selectByPrimaryKey(String u_phone);

    int updateByExampleSelective(@Param("record") Hospitaluser record, @Param("example") HospitaluserExample example);

    int updateByExample(@Param("record") Hospitaluser record, @Param("example") HospitaluserExample example);

    int updateByPrimaryKeySelective(Hospitaluser record);

    int updateByPrimaryKey(Hospitaluser record);
}