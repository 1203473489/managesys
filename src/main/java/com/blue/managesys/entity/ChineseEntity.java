package com.blue.managesys.entity;

import java.sql.Timestamp;
import java.util.Date;
import java.util.Objects;

public class ChineseEntity {
    private String peopleId;
    private String name;
    private String sex;
    private String age;
    private Date borntime;
    private Date deaytime;
    private String ifdeay;
    private String area;

    public String getPeopleId() {
        return peopleId;
    }

    public void setPeopleId(String peopleId) {
        this.peopleId = peopleId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Date getBorntime() {
        return borntime;
    }

    public void setBorntime(Date borntime) {
        this.borntime = borntime;
    }

    public Date getDeaytime() {
        return deaytime;
    }

    public void setDeaytime(Date deaytime) {
        this.deaytime = deaytime;
    }

    public String getIfdeay() {
        return ifdeay;
    }

    public void setIfdeay(String ifdeay) {
        this.ifdeay = ifdeay;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ChineseEntity that = (ChineseEntity) o;
        return Objects.equals(peopleId, that.peopleId) &&
                Objects.equals(name, that.name) &&
                Objects.equals(sex, that.sex) &&
                Objects.equals(age, that.age) &&
                Objects.equals(borntime, that.borntime) &&
                Objects.equals(deaytime, that.deaytime) &&
                Objects.equals(ifdeay, that.ifdeay) &&
                Objects.equals(area, that.area);
    }

    @Override
    public int hashCode() {
        return Objects.hash(peopleId, name, sex, age, borntime, deaytime, ifdeay, area);
    }
}
