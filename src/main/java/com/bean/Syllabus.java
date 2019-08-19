package com.bean;

import javax.persistence.Id;

public class Syllabus {
	@Id
    private Integer id;

    private Integer classid;

    private String syall;

    private String teacher;

    private Integer trem;

    private Integer credit;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getClassid() {
        return classid;
    }

    public void setClassid(Integer classid) {
        this.classid = classid;
    }

    public String getSyall() {
        return syall;
    }

    public void setSyall(String syall) {
        this.syall = syall;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public Integer getTrem() {
        return trem;
    }

    public void setTrem(Integer trem) {
        this.trem = trem;
    }

    public Integer getCredit() {
        return credit;
    }

    public void setCredit(Integer credit) {
        this.credit = credit;
    }
}