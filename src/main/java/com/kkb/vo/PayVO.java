package com.kkb.vo;

/**
 * @Description:
 * @Author: Wade
 * @Date: 2021/8/24 17:15
 * @Version: 1.0
 */
public class PayVO {
    private Integer hosr_id;
    private String hosr_name;

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
        this.hosr_name = hosr_name;
    }

    @Override
    public String toString() {
        return "PayVO{" +
                "hosr_id=" + hosr_id +
                ", hosr_name='" + hosr_name + '\'' +
                '}';
    }
}
