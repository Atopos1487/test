package com.kkb.vo;


import com.kkb.pojo.Drug;

import java.util.List;

public class DandPVO {
    private String beh_name;
    private String beh_nursePeople;
    private String dr_name;
    private Integer dr_number;
    private Integer dr_putnumber;
    private Integer needNumber;
    private Integer dr_id;
    private Integer beh_id;


    private List<Drug> drugs;

    public List<Drug> getDrugs() {
        return drugs;
    }

    public void setDrugs(List<Drug> drugs) {
        this.drugs = drugs;
    }

    public String getBeh_name() {
        return beh_name;
    }

    public void setBeh_name(String beh_name) {
        this.beh_name = beh_name;
    }

    public String getBeh_nursePeople() {
        return beh_nursePeople;
    }

    public void setBeh_nursePeople(String beh_nursePeople) {
        this.beh_nursePeople = beh_nursePeople;
    }

    public String getDr_name() {
        return dr_name;
    }

    public void setDr_name(String dr_name) {
        this.dr_name = dr_name;
    }

    public Integer getDr_number() {
        return dr_number;
    }

    public void setDr_number(Integer dr_number) {
        this.dr_number = dr_number;
    }

    public Integer getDr_putnumber() {
        return dr_putnumber;
    }

    public void setDr_putnumber(Integer dr_putnumber) {
        this.dr_putnumber = dr_putnumber;
    }

    public Integer getNeedNumber() {
        return needNumber;
    }

    public void setNeedNumber(Integer needNumber) {
        this.needNumber = needNumber;
    }

    public Integer getDr_id() {
        return dr_id;
    }

    public void setDr_id(Integer dr_id) {
        this.dr_id = dr_id;
    }

    public Integer getBeh_id() {
        return beh_id;
    }

    public void setBeh_id(Integer beh_id) {
        this.beh_id = beh_id;
    }

    @Override
    public String toString() {
        return "DandPVO{" +
                "beh_name='" + beh_name + '\'' +
                ", beh_nursePeople='" + beh_nursePeople + '\'' +
                ", dr_name='" + dr_name + '\'' +
                ", dr_number=" + dr_number +
                ", dr_putnumber=" + dr_putnumber +
                ", needNumber=" + needNumber +
                ", dr_id=" + dr_id +
                ", beh_id=" + beh_id +
                '}';
    }
}
