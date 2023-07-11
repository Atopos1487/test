package com.kkb.vo;

import java.util.Date;

/**
 * @Description: 住院结算详情
 * @Author: Wade
 * @Date: 2021/8/16 23:11
 * @Version: 1.0
 */
public class AccountVO {
    /**
     *病历号
     */
    private String beh_id;
    /**
     *姓名
     */
    private String beh_name;
    /**
     *收费项目
     */
    private String chap_name;
    /**
     *收费金额
     */
    private String chap_money;
    /**
     *收费日期
     */
    private Date chap_intime;
    /**
     *押金
     */
    private Integer beH_antecedent;

    public String getBeh_id() {
        return beh_id;
    }

    public void setBeh_id(String beh_id) {
        this.beh_id = beh_id;
    }

    public String getBeh_name() {
        return beh_name;
    }

    public void setBeh_name(String beh_name) {
        this.beh_name = beh_name;
    }

    public String getChap_name() {
        return chap_name;
    }

    public void setChap_name(String chap_name) {
        this.chap_name = chap_name;
    }

    public String getChap_money() {
        return chap_money;
    }

    public void setChap_money(String chap_money) {
        this.chap_money = chap_money;
    }

    public Date getChap_intime() {
        return chap_intime;
    }

    public void setChap_intime(Date chap_intime) {
        this.chap_intime = chap_intime;
    }

    public Integer getBeH_antecedent() {
        return beH_antecedent;
    }

    public void setBeH_antecedent(Integer beH_antecedent) {
        this.beH_antecedent = beH_antecedent;
    }
}
