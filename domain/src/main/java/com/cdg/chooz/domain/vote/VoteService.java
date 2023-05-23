package com.cdg.chooz.domain.vote;

import com.cdg.chooz.domain.user.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class VoteService {

    private final VoteRepository voteRepository;
    private final UserRepository userRepository;

    public Long createVote(CreateVoteInfo voteInfo, Long userId) {

        if(userRepository.existsByUserId(userId)) {
            throw new IllegalArgumentException("그런 회원이 없습니다");
        }

        Vote vote = new Vote(voteInfo);

        return voteRepository.createVote(vote, userId);

    }

    public void updateVote(UpdateVoteInfo voteInfo, Long userId, Long voteId) {

        if(userRepository.existsByUserId(userId)) {
            throw new IllegalArgumentException("그런 회원이 없습니다");
        }

        


    }
}
