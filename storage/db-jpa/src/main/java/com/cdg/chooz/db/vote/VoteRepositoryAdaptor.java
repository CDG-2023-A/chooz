package com.cdg.chooz.db.vote;

import com.cdg.chooz.db.user.UserEntity;
import com.cdg.chooz.db.user.UserJpaRepository;
import com.cdg.chooz.domain.vote.Vote;
import com.cdg.chooz.domain.vote.VoteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@RequiredArgsConstructor
public class VoteRepositoryAdaptor implements VoteRepository {

    private final VoteJpaRepository voteJpaRepository;
    private final UserJpaRepository userJpaRepository;

    @Override
    public Long createVote(Vote vote, Long userId) {
        UserEntity userEntity = userJpaRepository.findById(userId).orElseThrow(IllegalArgumentException::new);
        VoteEntity voteEntity = new VoteEntity(vote, userEntity);
        return voteJpaRepository.save(voteEntity).getId();
    }
}
