package com.texinc.loytesting.hrsystemplus.bean;

import java.util.List;

/**
 * @author i@loyio.me
 * @date 2020/11/17 1:37 PM
 */
public class RespPageBean {
    private Long total;
    private List<?> data;

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public List<?> getData() {
        return data;
    }

    public void setData(List<?> data) {
        this.data = data;
    }
}
