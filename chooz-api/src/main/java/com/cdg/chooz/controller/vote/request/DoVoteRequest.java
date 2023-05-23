package com.cdg.chooz.controller.vote.request;

import com.cdg.chooz.controller.vote.data.DoVote;
import com.cdg.chooz.domain.vote.ChoiceType;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class DoVoteRequest {

    private ChoiceType choice;

    public DoVote converter(Long userId, Long voteId) {
        return DoVote.builder()
                .userId(userId)
                .voteId(voteId)
                .choice(choice)
                .build();
    }

    public DoVoteRequest(ChoiceType choice) {
        this.choice = choice;
    }
}
