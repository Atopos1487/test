package com.kkb.vo;

import com.kkb.pojo.Hosregister;

/**
 * @Description:
 * @Author: Wade
 * @Date: 2021/8/18 0:49
 * @Version: 1.0
 */
public class ChargeVO {

    private Integer beh_id;
    private Integer hosr_id;
    private Hosregister hosregister;
    private Integer beh_antecedent;
    private Integer beh_closeprice;

    public Integer getBeh_id() {
        return beh_id;
    }

    public void setBeh_id(Integer beh_id) {
        this.beh_id = beh_id;
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

    public Integer getBeh_antecedent() {
        return beh_antecedent;
    }

    public void setBeh_antecedent(Integer beh_antecedent) {
        this.beh_antecedent = beh_antecedent;
    }

    public Integer getBeh_closeprice() {
        return beh_closeprice;
    }

    public void setBeh_closeprice(Integer beh_closeprice) {
        this.beh_closeprice = beh_closeprice;
    }

    @Override
    public String toString() {
        return "ChargeVO{" +
                "beh_id=" + beh_id +
                ", hosr_id=" + hosr_id +
                ", hosregister=" + hosregister +
                ", beh_antecedent=" + beh_antecedent +
                ", beh_closeprice=" + beh_closeprice +
                '}';
    }
}
