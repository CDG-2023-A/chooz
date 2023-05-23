package com.cdg.chooz.controller.vote.data;

import com.example.manymanyUsers.vote.domain.Vote;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor
public class FindVoteListData {

    Vote vote;

    Long cnt;
}
