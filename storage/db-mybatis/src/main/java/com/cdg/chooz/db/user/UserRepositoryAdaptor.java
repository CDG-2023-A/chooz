package com.cdg.chooz.db.user;

import com.cdg.chooz.domain.user.User;
import com.cdg.chooz.domain.user.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
class UserRepositoryAdaptor implements UserRepository {

    private final UserMybatisRepository userRepository;

    @Override
    public boolean existsByProviderId(String providerId) {
        return userRepository.existsByProviderId(providerId);
    }

    @Override
    public void register(User user) {
        UserEntity userEntity = new UserEntity(user);
        userRepository.save(userEntity);
    }

    @Override
    public User findByProviderId(String providerId) {
        return userRepository.findByProviderId(providerId)
                .map(UserEntity::toDomain)
                .orElse(null);
    }
}