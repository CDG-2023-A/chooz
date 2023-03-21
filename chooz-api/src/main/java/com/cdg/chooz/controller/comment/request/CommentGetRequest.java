package com.cdg.chooz.controller.comment.request;

import com.cdg.chooz.domain.vote.AgeType;
import com.cdg.chooz.domain.vote.GenderType;
import com.cdg.chooz.domain.vote.MbtiType;
import com.cdg.chooz.domain.vote.SortByType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotNull;


@Getter
@Setter
@NoArgsConstructor
public class CommentGetRequest {

    private AgeType age;

    private MbtiType mbti;

    private GenderType gender;

    @NotNull
    private SortByType sortBy;

    @NotNull
    private int page;

    @NotNull
    private int size;
}
