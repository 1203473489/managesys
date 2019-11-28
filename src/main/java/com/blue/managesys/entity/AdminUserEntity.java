package com.blue.managesys.entity;

import java.util.Date;
import java.util.Objects;

public class AdminUserEntity {
    private String adminId;
    private String adminName;
    private String adminNo;
    private Date createTime;
    private String loginPass;
    private String departNo;
    private String status;

    public String getAdminId() {
        return adminId;
    }

    public void setAdminId(String adminId) {
        this.adminId = adminId;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public String getAdminNo() {
        return adminNo;
    }

    public void setAdminNo(String adminNo) {
        this.adminNo = adminNo;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getLoginPass() {
        return loginPass;
    }

    public void setLoginPass(String loginPass) {
        this.loginPass = loginPass;
    }

    public String getDepartNo() {
        return departNo;
    }

    public void setDepartNo(String departNo) {
        this.departNo = departNo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AdminUserEntity that = (AdminUserEntity) o;
        return Objects.equals(adminId, that.adminId) &&
                Objects.equals(adminName, that.adminName) &&
                Objects.equals(adminNo, that.adminNo) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(loginPass, that.loginPass) &&
                Objects.equals(departNo, that.departNo) &&
                Objects.equals(status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(adminId, adminName, adminNo, createTime, loginPass, departNo, status);
    }
}
