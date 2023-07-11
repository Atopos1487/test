package com.kkb.pojo;

public class Drug {
    private Integer dr_id;

    private String dr_url;

    private Integer dr_inprice;

    private Integer dr_outprice;

    private String dr_name;

    private String dr_type;

    private String dr_simdesc;

    private String dr_;

    private String dr_datadesc;

    private String dr_factory;

    private String d_desc;

    private String dr_direction;

    private String dr_remark;

    private Integer dr_number;

    public Integer getDr_id() {
        return dr_id;
    }

    public void setDr_id(Integer dr_id) {
        this.dr_id = dr_id;
    }

    public String getDr_url() {
        return dr_url;
    }

    public void setDr_url(String dr_url) {
        this.dr_url = dr_url == null ? null : dr_url.trim();
    }

    public Integer getDr_inprice() {
        return dr_inprice;
    }

    public void setDr_inprice(Integer dr_inprice) {
        this.dr_inprice = dr_inprice;
    }

    public Integer getDr_outprice() {
        return dr_outprice;
    }

    public void setDr_outprice(Integer dr_outprice) {
        this.dr_outprice = dr_outprice;
    }

    public String getDr_name() {
        return dr_name;
    }

    public void setDr_name(String dr_name) {
        this.dr_name = dr_name == null ? null : dr_name.trim();
    }

    public String getDr_type() {
        return dr_type;
    }

    public void setDr_type(String dr_type) {
        this.dr_type = dr_type == null ? null : dr_type.trim();
    }

    public String getDr_simdesc() {
        return dr_simdesc;
    }

    public void setDr_simdesc(String dr_simdesc) {
        this.dr_simdesc = dr_simdesc == null ? null : dr_simdesc.trim();
    }

    public String getDr_() {
        return dr_;
    }

    public void setDr_(String dr_) {
        this.dr_ = dr_ == null ? null : dr_.trim();
    }

    public String getDr_datadesc() {
        return dr_datadesc;
    }

    public void setDr_datadesc(String dr_datadesc) {
        this.dr_datadesc = dr_datadesc == null ? null : dr_datadesc.trim();
    }

    public String getDr_factory() {
        return dr_factory;
    }

    public void setDr_factory(String dr_factory) {
        this.dr_factory = dr_factory == null ? null : dr_factory.trim();
    }

    public String getD_desc() {
        return d_desc;
    }

    public void setD_desc(String d_desc) {
        this.d_desc = d_desc == null ? null : d_desc.trim();
    }

    public String getDr_direction() {
        return dr_direction;
    }

    public void setDr_direction(String dr_direction) {
        this.dr_direction = dr_direction == null ? null : dr_direction.trim();
    }

    public String getDr_remark() {
        return dr_remark;
    }

    public void setDr_remark(String dr_remark) {
        this.dr_remark = dr_remark == null ? null : dr_remark.trim();
    }

    public Integer getDr_number() {
        return dr_number;
    }

    public void setDr_number(Integer dr_number) {
        this.dr_number = dr_number;
    }

    @Override
    public String toString() {
        return "Drug{" +
                "dr_id=" + dr_id +
                ", dr_url='" + dr_url + '\'' +
                ", dr_inprice=" + dr_inprice +
                ", dr_outprice=" + dr_outprice +
                ", dr_name='" + dr_name + '\'' +
                ", dr_type='" + dr_type + '\'' +
                ", dr_simdesc='" + dr_simdesc + '\'' +
                ", dr_='" + dr_ + '\'' +
                ", dr_datadesc='" + dr_datadesc + '\'' +
                ", dr_factory='" + dr_factory + '\'' +
                ", d_desc='" + d_desc + '\'' +
                ", dr_direction='" + dr_direction + '\'' +
                ", dr_remark='" + dr_remark + '\'' +
                ", dr_number=" + dr_number +
                '}';
    }
}