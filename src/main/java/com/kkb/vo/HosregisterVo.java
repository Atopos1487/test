package com.kkb.vo;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class HosregisterVo {
    private Integer hosr_id;

    private String d_name;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date minTime;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date maxTime;

    private String dep_name;

    public Integer getHosr_id() {
        return hosr_id;
    }

    public void setHosr_id(Integer hosr_id) {
        this.hosr_id = hosr_id;
    }


    public Date getMinTime() {
        return minTime;
    }

    public void setMinTime(Date minTime) {
        this.minTime = minTime;
    }

    public Date getMaxTime() {
        return maxTime;
    }

    public void setMaxTime(Date maxTime) {
        this.maxTime = maxTime;
    }

    public String getD_name() {
        return d_name;
    }

    public void setD_name(String d_name) {
        this.d_name = d_name;
    }

    public String getDep_name() {
        return dep_name;
    }

    public void setDep_name(String dep_name) {
        this.dep_name = dep_name;
    }
}