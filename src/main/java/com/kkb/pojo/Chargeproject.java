package com.kkb.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Chargeproject {
    private Integer chap_id;

    private String chap_name;

    private String chap_money;

    public String getChap_money() {
        return chap_money;
    }

    public void setChap_money(String chap_money) {
        this.chap_money = chap_money;
    }

    @JsonFormat(pattern ="yyyy-MM-dd",timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date chap_intime;

    private Integer isDel;

    public Integer getChap_id() {
        return chap_id;
    }

    public void setChap_id(Integer chap_id) {
        this.chap_id = chap_id;
    }

    public String getChap_name() {
        return chap_name;
    }

    public void setChap_name(String chap_name) {
        this.chap_name = chap_name == null ? null : chap_name.trim();
    }



    public Date getChap_intime() {
        return chap_intime;
    }

    public void setChap_intime(Date chap_intime) {
        this.chap_intime = chap_intime;
    }

    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }
}