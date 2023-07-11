package com.kkb.vo;

/**
 * @Description: 缴纳押金
 * @Author: Wade
 * @Date: 2021/8/17 15:01
 * @Version: 1.0
 */
public class PayDepositVO {

    private Integer beh_id;
    /**
     *押金
     */
    private Integer beh_antecedent;
    /**
     *消费总数
     */
    private Integer totalPrice;

    public Integer getBeh_id() {
        return beh_id;
    }

    public void setBeh_id(Integer beh_id) {
        this.beh_id = beh_id;
    }

    public Integer getBeh_antecedent() {
        return beh_antecedent;
    }

    public void setBeh_antecedent(Integer beh_antecedent) {
        this.beh_antecedent = beh_antecedent;
    }

    public Integer getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Integer totalPrice) {
        this.totalPrice = totalPrice;
    }


    @Override
    public String toString() {
        return "PayDepositVO{" +
                "beh_antecedent=" + beh_antecedent +
                ", totalPrice=" + totalPrice +
                '}';
    }
}
