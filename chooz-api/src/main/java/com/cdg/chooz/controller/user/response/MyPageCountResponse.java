package com.cdg.chooz.controller.user.response;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class MyPageCountResponse {

    Long countCreatedVote;

    Long countParticipatedVote;

    Long countBookmarkedVote;

    public MyPageCountResponse(Long countCreatedVote, Long countParticipatedVote, Long countBookmarkedVote) {
        this.countCreatedVote = countCreatedVote;
        this.countParticipatedVote = countParticipatedVote;
        this.countBookmarkedVote = countBookmarkedVote;
    }
}
