package com.blue.managesys.mapper;

import com.blue.managesys.entity.AdminUserEntity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository

public interface AdminUserMapper {
    public int insertAdminUser(AdminUserEntity adminUserEntity);
}
