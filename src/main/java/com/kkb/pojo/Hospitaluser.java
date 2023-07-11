package com.kkb.pojo;

public class Hospitaluser {
    private String u_phone;

    private String u_password;

    private String u_truename;

    private String u_email;

    private Integer u_state;

    private Integer u_rid;

    private Integer is_del;

    public String getU_phone() {
        return u_phone;
    }

    public void setU_phone(String u_phone) {
        this.u_phone = u_phone == null ? null : u_phone.trim();
    }

    public String getU_password() {
        return u_password;
    }

    public void setU_password(String u_password) {
        this.u_password = u_password == null ? null : u_password.trim();
    }

    public String getU_truename() {
        return u_truename;
    }

    public void setU_truename(String u_truename) {
        this.u_truename = u_truename == null ? null : u_truename.trim();
    }

    public String getU_email() {
        return u_email;
    }

    public void setU_email(String u_email) {
        this.u_email = u_email == null ? null : u_email.trim();
    }

    public Integer getU_state() {
        return u_state;
    }

    public void setU_state(Integer u_state) {
        this.u_state = u_state;
    }

    public Integer getU_rid() {
        return u_rid;
    }

    public void setU_rid(Integer u_rid) {
        this.u_rid = u_rid;
    }

    public Integer getIs_del() {
        return is_del;
    }

    public void setIs_del(Integer is_del) {
        this.is_del = is_del;
    }
}