package com.blue.managesys.mapper;

import com.blue.managesys.entity.AdminUserEntity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository

public interface AdminUserMapper {
    /**
     * 注册
     * @param adminUserEntity
     * @return
     */
    public int insertAdminUser(AdminUserEntity adminUserEntity);

    /**
     * 登录
     * @param adminUserEntity
     * @return
     */
    public AdminUserEntity getAdminUser(AdminUserEntity adminUserEntity) throws Exception;
}
