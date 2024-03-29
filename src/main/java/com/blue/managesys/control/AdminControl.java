package com.blue.managesys.control;

import com.blue.managesys.entity.AdminUserEntity;
import com.blue.managesys.mapper.AdminUserMapper;
import com.blue.managesys.server.AdminServiceImpl;
import com.blue.managesys.util.SysUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/admin")
public class AdminControl {
    @Autowired
    private AdminServiceImpl service;

    /**
     *测试数据库连接
     * @param adminUserEntity
     * @return
     */
    @RequestMapping(value = "/regist", method = RequestMethod.POST)
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
            service.registAdmin(adminUserEntity);
            return "success";
        }else{
            return "error";
        }
    }
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public AdminUserEntity login(AdminUserEntity adminUserEntity) throws Exception {
        AdminUserEntity ad = service.adminLogin(adminUserEntity);
        return ad;
    }
}
