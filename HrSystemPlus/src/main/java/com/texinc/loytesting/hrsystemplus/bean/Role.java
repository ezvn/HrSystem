package com.texinc.loytesting.hrsystemplus.bean;

import java.io.Serializable;

/**
 * @author i@loyio.me
 * @date 2020/11/12 3:38 PM
 */
public class Role implements Serializable {
    private Integer id;

    private String name;

    private String nameZh;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getNameZh() {
        return nameZh;
    }

    public void setNameZh(String nameZh) {
        this.nameZh = nameZh;
    }
}
