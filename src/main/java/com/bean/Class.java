package com.bean;

import javax.persistence.Id;

public class Class {
	@Id
    private Integer id;

    private String banjinid;

    private Integer kechenid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBanjinid() {
        return banjinid;
    }

    public void setBanjinid(String banjinid) {
        this.banjinid = banjinid;
    }

    public Integer getKechenid() {
        return kechenid;
    }

    public void setKechenid(Integer kechenid) {
        this.kechenid = kechenid;
    }
}