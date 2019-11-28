package com.blue.managesys.control;

import com.blue.managesys.entity.AdminUserEntity;
import com.blue.managesys.mapper.AdminUserMapper;
import com.blue.managesys.util.SysUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/admin")
public class AdminControl {
    @Autowired
    private AdminUserMapper adminUserMapper;
    @RequestMapping("/regist")
    public String registAdmin(AdminUserEntity adminUserEntity){
        adminUserEntity.setAdminId(SysUtils.getUUID());
        Date date = new Date();
        adminUserEntity.setCreateTime(date);
        adminUserEntity.setAdminNo("001");
        adminUserEntity.setDepartNo("1");
        adminUserEntity.setStatus("0");
        adminUserEntity.setAdminName("啸西风");
        adminUserEntity.setLoginPass("123");
        System.out.print("123");
        if (adminUserEntity!=null){
            adminUserMapper.insertAdminUser(adminUserEntity);
            return "success";
        }
        return "error";
    }
}
