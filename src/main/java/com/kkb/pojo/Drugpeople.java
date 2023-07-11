package com.kkb.pojo;

import java.util.List;

public class Drugpeople {
    private Integer id;

    private Integer dr_id;

    private Integer peopleid;

    private Integer dr_number;

    private Integer dr_putnumber;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDr_id() {
        return dr_id;
    }

    public void setDr_id(Integer dr_id) {
        this.dr_id = dr_id;
    }

    public Integer getPeopleid() {
        return peopleid;
    }

    public void setPeopleid(Integer peopleid) {
        this.peopleid = peopleid;
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


    //关联Drug和Behospital
    private List<Drug> drugs;
    private Behospital behospital;

    public List<Drug> getDrugs() {
        return drugs;
    }

    public void setDrugs(List<Drug> drugs) {
        this.drugs = drugs;
    }

    public Behospital getBehospital() {
        return behospital;
    }

    public void setBehospital(Behospital behospital) {
        this.behospital = behospital;
    }
}