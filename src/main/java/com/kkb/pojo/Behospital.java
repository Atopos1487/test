package com.kkb.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;
import java.util.List;

public class Behospital {
    private Integer beh_id;


    private String beh_name;

    private String beh_nursePeople;

    private String beh_patbed;

    private Integer beh_antecedent;

    private Integer d_id;

    private Doctor doctor;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date beh_intime;

    private String beh_illness;

    private Integer beh_closeprice;

    private Integer beh_state;

    private Integer beh_dep;

    private Department department;

    private Integer hosr_id;

    private Hosregister hosregister;
    private List<Drug> Drugs;
    
    private List<Drug> drugs;

    public List<Drug> getDrugs() {
        return drugs;
    }

    public void setDrugs(List<Drug> drugs) {
        this.drugs = drugs;
    }

    public Integer getBeh_id() {
        return beh_id;
    }

    public void setBeh_id(Integer beh_id) {
        this.beh_id = beh_id;
    }

    public String getBeh_name() {
        return beh_name;
    }

    public void setBeh_name(String beh_name) {
        this.beh_name = beh_name == null ? null : beh_name.trim();
    }

    public String getBeh_nursePeople() {
        return beh_nursePeople;
    }

    public void setBeh_nursePeople(String beh_nursePeople) {
        this.beh_nursePeople = beh_nursePeople == null ? null : beh_nursePeople.trim();
    }

    public String getBeh_patbed() {
        return beh_patbed;
    }

    public void setBeh_patbed(String beh_patbed) {
        this.beh_patbed = beh_patbed == null ? null : beh_patbed.trim();
    }

    public Integer getBeh_antecedent() {
        return beh_antecedent;
    }

    public void setBeh_antecedent(Integer beh_antecedent) {
        this.beh_antecedent = beh_antecedent;
    }

    public Integer getD_id() {
        return d_id;
    }

    public void setD_id(Integer d_id) {
        this.d_id = d_id;
    }

    public Date getBeh_intime() {
        return beh_intime;
    }

    public void setBeh_intime(Date beh_intime) {
        this.beh_intime = beh_intime;
    }

    public String getBeh_illness() {
        return beh_illness;
    }

    public void setBeh_illness(String beh_illness) {
        this.beh_illness = beh_illness == null ? null : beh_illness.trim();
    }

    public Integer getBeh_closeprice() {
        return beh_closeprice;
    }

    public void setBeh_closeprice(Integer beh_closeprice) {
        this.beh_closeprice = beh_closeprice;
    }

    public Integer getBeh_state() {
        return beh_state;
    }

    public void setBeh_state(Integer beh_state) {
        this.beh_state = beh_state;
    }

    public Integer getBeh_dep() {
        return beh_dep;
    }

    public void setBeh_dep(Integer beh_dep) {
        this.beh_dep = beh_dep;
    }

    public Integer getHosr_id() {
        return hosr_id;
    }

    public void setHosr_id(Integer hosr_id) {
        this.hosr_id = hosr_id;
    }

    public Hosregister getHosregister() {
        return hosregister;
    }

    public void setHosregister(Hosregister hosregister) {
        this.hosregister = hosregister;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }



    @Override
    public String toString() {
        return "Behospital{" +
                "beh_id=" + beh_id +
                ", beh_name='" + beh_name + '\'' +
                ", beh_nursePeople='" + beh_nursePeople + '\'' +
                ", beh_patbed='" + beh_patbed + '\'' +
                ", beh_antecedent=" + beh_antecedent +
                ", d_id=" + d_id +
                ", doctor=" + doctor +
                ", beh_intime=" + beh_intime +
                ", beh_illness='" + beh_illness + '\'' +
                ", beh_closeprice=" + beh_closeprice +
                ", beh_state=" + beh_state +
                ", beh_dep=" + beh_dep +
                ", department=" + department +
                ", hosr_id=" + hosr_id +
                ", hosregister=" + hosregister +
                '}';
    }
}