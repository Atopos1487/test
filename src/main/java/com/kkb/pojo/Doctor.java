package com.kkb.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Doctor {
    private Integer d_id;

    private String d_name;

    private String d_idcar;

    private Integer d_phone;

    private String d_telphone;

    private Integer d_sex;

    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date d_birthday;

    private Integer d_age;

    private String d_email;

    private Integer dep_id;

    private String d_xueli;

    private String d_desc;
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date d_intime;

    private String dep_name;

    public String getDep_name() {
        return dep_name;
    }

    public void setDep_name(String dep_name) {
        this.dep_name = dep_name;
    }

    private Integer d_state;

    public Integer getD_id() {
        return d_id;
    }

    public void setD_id(Integer d_id) {
        this.d_id = d_id;
    }

    public String getD_name() {
        return d_name;
    }

    public void setD_name(String d_name) {
        this.d_name = d_name == null ? null : d_name.trim();
    }

    public String getD_idcar() {
        return d_idcar;
    }

    public void setD_idcar(String d_idcar) {
        this.d_idcar = d_idcar == null ? null : d_idcar.trim();
    }

    public Integer getD_phone() {
        return d_phone;
    }

    public void setD_phone(Integer d_phone) {
        this.d_phone = d_phone;
    }

    public String getD_telphone() {
        return d_telphone;
    }

    public void setD_telphone(String d_telphone) {
        this.d_telphone = d_telphone == null ? null : d_telphone.trim();
    }

    public Integer getD_sex() {
        return d_sex;
    }

    public void setD_sex(Integer d_sex) {
        this.d_sex = d_sex;
    }

    public Date getD_birthday() {
        return d_birthday;
    }

    public void setD_birthday(Date d_birthday) {
        this.d_birthday = d_birthday;
    }

    public Integer getD_age() {
        return d_age;
    }

    public void setD_age(Integer d_age) {
        this.d_age = d_age;
    }

    public String getD_email() {
        return d_email;
    }

    public void setD_email(String d_email) {
        this.d_email = d_email == null ? null : d_email.trim();
    }

    public Integer getDep_id() {
        return dep_id;
    }

    public void setDep_id(Integer dep_id) {
        this.dep_id = dep_id;
    }

    public String getD_xueli() {
        return d_xueli;
    }

    public void setD_xueli(String d_xueli) {
        this.d_xueli = d_xueli == null ? null : d_xueli.trim();
    }

    public String getD_desc() {
        return d_desc;
    }

    public void setD_desc(String d_desc) {
        this.d_desc = d_desc == null ? null : d_desc.trim();
    }

    public Date getD_intime() {
        return d_intime;
    }

    public void setD_intime(Date d_intime) {
        this.d_intime = d_intime;
    }

    public Integer getD_state() {
        return d_state;
    }

    public void setD_state(Integer d_state) {
        this.d_state = d_state;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "d_id=" + d_id +
                ", d_name='" + d_name + '\'' +
                ", d_idcar='" + d_idcar + '\'' +
                ", d_phone=" + d_phone +
                ", d_telphone='" + d_telphone + '\'' +
                ", d_sex=" + d_sex +
                ", d_birthday=" + d_birthday +
                ", d_age=" + d_age +
                ", d_email='" + d_email + '\'' +
                ", dep_id=" + dep_id +
                ", d_xueli='" + d_xueli + '\'' +
                ", d_desc='" + d_desc + '\'' +
                ", d_intime=" + d_intime +
                ", d_state=" + d_state +
                '}';
    }
}