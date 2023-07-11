package com.kkb.mapper;

import com.kkb.pojo.Department;
import com.kkb.pojo.Doctor;
import com.kkb.pojo.Hosregister;
import com.kkb.pojo.HosregisterExample;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface HosregisterMapper {

    long countByExample(HosregisterExample example);

    int deleteByExample(HosregisterExample example);

    int deleteByPrimaryKey(Integer hosr_id);

    int insert(Hosregister record);

    int insertSelective(Hosregister record);

    List<Hosregister> selectByExample(HosregisterExample example);

    Hosregister selectByPrimaryKey(Integer hosr_id);

    int updateByExampleSelective(@Param("record") Hosregister record, @Param("example") HosregisterExample example);

    int updateByExample(@Param("record") Hosregister record, @Param("example") HosregisterExample example);

    int updateByPrimaryKeySelective(Hosregister record);

    int updateByPrimaryKey(Hosregister record);

    /**
     * 模糊查询住院id
     * @param id
     * @return java.util.List<java.lang.Integer>
     */
    List<Integer> selectHrId(@Param("id")Integer id);
}