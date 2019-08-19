package com.bean;

import java.util.Date;

import javax.persistence.Id;

public class Student {
	
	@Id
    private Integer id;

    private Integer studentnum;

    private String sname;

    private String inschooltiem;

    private Date birthday;

    private String sex;

    private Integer classid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStudentnum() {
        return studentnum;
    }

    public void setStudentnum(Integer studentnum) {
        this.studentnum = studentnum;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getInschooltiem() {
        return inschooltiem;
    }

    public void setInschooltiem(String inschooltiem) {
        this.inschooltiem = inschooltiem;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getClassid() {
        return classid;
    }

    public void setClassid(Integer classid) {
        this.classid = classid;
    }
}