package com.cdg.chooz.db.user;

import com.cdg.chooz.db.mapper.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class UserMybatisRepository {
    private final UserMapper userMapper;

    public Optional<UserEntity> findById(Long id) {
        return Optional.of(userMapper.selectUserById(id));
    }

    public Optional<UserEntity> findByProviderId(String providerId) {
        return Optional.of(userMapper.selectUserByProviderId(providerId));
    }

    public Boolean existsByProviderId(String providerId) {
        return userMapper.selectUserByProviderId(providerId) != null;
    }

    public void save(UserEntity userEntity) {
        userMapper.insertUser(userEntity);
    }
}
