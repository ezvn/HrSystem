package com.texinc.loytesting.hrsystemplus.bean;

import java.io.Serializable;
import java.util.Objects;

/**
 * @author i@loyio.me
 * @date 2020/11/12 3:52 PM
 */
public class PoliticsStatus implements Serializable {
    private Integer id;

    private String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PoliticsStatus that = (PoliticsStatus) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name);
    }

    public PoliticsStatus() {

    }

    public PoliticsStatus(String name) {

        this.name = name;
    }

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
}
