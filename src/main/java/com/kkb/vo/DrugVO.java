package com.kkb.vo;

public class DrugVO {
    private Integer dr_id;

    private String dr_name;

    private String dr_type;

    public Integer getDr_id() {
        return dr_id;
    }

    public void setDr_id(Integer dr_id) {
        this.dr_id = dr_id;
    }

    public String getDr_name() {
        return dr_name;
    }

    public void setDr_name(String dr_name) {
        this.dr_name = dr_name;
    }

    public String getDr_type() {
        return dr_type;
    }

    public void setDr_type(String dr_type) {
        this.dr_type = dr_type;
    }

    @Override
    public String toString() {
        return "DrugVO{" +
                "dr_id=" + dr_id +
                ", dr_name='" + dr_name + '\'' +
                ", dr_type='" + dr_type + '\'' +
                '}';
    }
}
