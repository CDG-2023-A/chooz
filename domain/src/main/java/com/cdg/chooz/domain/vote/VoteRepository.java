package com.cdg.chooz.domain.vote;

public interface VoteRepository {

    Long createVote(Vote vote, Long userId);

}
