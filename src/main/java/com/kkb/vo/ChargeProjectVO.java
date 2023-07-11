package com.kkb.vo;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class ChargeProjectVO {
    private Integer chap_id;

    private String chap_name;

    private Integer chap_money;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date chap_intime;

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

    public Integer getChap_money() {
        return chap_money;
    }

    public void setChap_money(Integer chap_money) {
        this.chap_money = chap_money;
    }

    public Date getChap_intime() {
        return chap_intime;
    }

    public void setChap_intime(Date chap_intime) {
        this.chap_intime = chap_intime;
    }
}