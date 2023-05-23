package com.cdg.chooz.controller.vote.data;

import com.cdg.chooz.domain.vote.ChoiceType;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class DoVote {

    private Long userId;

    private Long voteId;

    private ChoiceType choice;

    @Builder
    public DoVote(Long userId, Long voteId, ChoiceType choice) {
        this.userId = userId;
        this.voteId = voteId;
        this.choice = choice;
    }
}
