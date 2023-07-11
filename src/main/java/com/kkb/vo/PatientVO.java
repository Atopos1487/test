package com.kkb.vo;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

//多条件查询（patient）类
public class PatientVO {
    private Integer p_id;
    private String p_name;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date p_date;


    public Date getP_date() {
        return p_date;
    }

    public void setP_date(Date p_date) {
        this.p_date = p_date;
    }

    public Integer getP_id() {
        return p_id;
    }

    public void setP_id(Integer p_id) {
        this.p_id = p_id;
    }

    public String getP_name() {
        return p_name;
    }

    public void setP_name(String p_name) {
        this.p_name = p_name;
    }


}
