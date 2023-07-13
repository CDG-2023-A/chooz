package com.cdg.chooz.db.mapper;

import com.cdg.chooz.db.user.UserEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    UserEntity selectUserById(Long Id);
    UserEntity selectUserByProviderId(String providerId);
    void insertUser(UserEntity userEntity);
}
