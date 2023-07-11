package com.kkb.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Hosregister {
    private Integer hosr_id;

    private String hosr_name;

    private String hosr_idCar;

    private String hosr_medical;

    private Integer hosr_regPrice;

    private String hosr_phone;

    private Integer hosr_selfPrice;

    private Integer hosr_sex;

    private Integer hosr_age;

    private String hosr_work;

    private String hosr_lookDoctor;

    private Integer dep_id;

    @JsonFormat(pattern ="yyyy-MM-dd",timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date hosr_intime;

    private Integer d_id;

    private String hosr_remark;

    private Integer hosr_state;


    private Doctor doctor;
    private Department department;

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

    public Integer getHosr_id() {
        return hosr_id;
    }

    public void setHosr_id(Integer hosr_id) {
        this.hosr_id = hosr_id;
    }

    public String getHosr_name() {
        return hosr_name;
    }

    public void setHosr_name(String hosr_name) {
        this.hosr_name = hosr_name == null ? null : hosr_name.trim();
    }

    public String getHosr_idCar() {
        return hosr_idCar;
    }

    public void setHosr_idCar(String hosr_idCar) {
        this.hosr_idCar = hosr_idCar == null ? null : hosr_idCar.trim();
    }

    public String getHosr_medical() {
        return hosr_medical;
    }

    public void setHosr_medical(String hosr_medical) {
        this.hosr_medical = hosr_medical == null ? null : hosr_medical.trim();
    }

    public Integer getHosr_regPrice() {
        return hosr_regPrice;
    }

    public void setHosr_regPrice(Integer hosr_regPrice) {
        this.hosr_regPrice = hosr_regPrice;
    }

    public String getHosr_phone() {
        return hosr_phone;
    }

    public void setHosr_phone(String hosr_phone) {
        this.hosr_phone = hosr_phone == null ? null : hosr_phone.trim();
    }

    public Integer getHosr_selfPrice() {
        return hosr_selfPrice;
    }

    public void setHosr_selfPrice(Integer hosr_selfPrice) {
        this.hosr_selfPrice = hosr_selfPrice;
    }

    public Integer getHosr_sex() {
        return hosr_sex;
    }

    public void setHosr_sex(Integer hosr_sex) {
        this.hosr_sex = hosr_sex;
    }

    public Integer getHosr_age() {
        return hosr_age;
    }

    public void setHosr_age(Integer hosr_age) {
        this.hosr_age = hosr_age;
    }

    public String getHosr_work() {
        return hosr_work;
    }

    public void setHosr_work(String hosr_work) {
        this.hosr_work = hosr_work == null ? null : hosr_work.trim();
    }

    public String getHosr_lookDoctor() {
        return hosr_lookDoctor;
    }

    public void setHosr_lookDoctor(String hosr_lookDoctor) {
        this.hosr_lookDoctor = hosr_lookDoctor == null ? null : hosr_lookDoctor.trim();
    }

    public Integer getDep_id() {
        return dep_id;
    }

    public void setDep_id(Integer dep_id) {
        this.dep_id = dep_id;
    }

    public Date getHosr_intime() {
        return hosr_intime;
    }

    public void setHosr_intime(Date hosr_intime) {
        this.hosr_intime = hosr_intime;
    }

    public Integer getD_id() {
        return d_id;
    }

    public void setD_id(Integer d_id) {
        this.d_id = d_id;
    }

    public String getHosr_remark() {
        return hosr_remark;
    }

    public void setHosr_remark(String hosr_remark) {
        this.hosr_remark = hosr_remark == null ? null : hosr_remark.trim();
    }

    public Integer getHosr_state() {
        return hosr_state;
    }

    public void setHosr_state(Integer hosr_state) {
        this.hosr_state = hosr_state;
    }
}