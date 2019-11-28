package com.blue.managesys.server;

import com.blue.managesys.entity.AdminUserEntity;
import com.blue.managesys.mapper.AdminUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl  {
    @Autowired
    private AdminUserMapper adminUserMapper;
    public boolean registAdmin(AdminUserEntity adminUserEntity) {
        int res = adminUserMapper.insertAdminUser(adminUserEntity);
        if (res!=0){
            return true;
        }else {
            return false;
        }
    }
}
