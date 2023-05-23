package com.cdg.chooz.controller.vote.response;

import com.example.manymanyUsers.vote.enums.Choice;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class GetIsUserVotedResponse {

    private boolean isVoted;

    private Choice userChoice;

    public void converter(GetIsUserVoted getIsUserVoted) {
        isVoted = getIsUserVoted.isVoted();
        userChoice = getIsUserVoted.getUserChoice();
    }
}
