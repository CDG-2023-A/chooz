package com.cdg.chooz.controller.vote.request;

import com.example.manymanyUsers.vote.enums.SortBy;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor
public class GetVoteListRequest {

    private SortBy sortBy;

    private int page;

    private int size;
}
