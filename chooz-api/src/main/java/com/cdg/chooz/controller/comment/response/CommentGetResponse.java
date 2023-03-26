package com.cdg.chooz.controller.comment.response;


import com.cdg.chooz.domain.vote.AgeType;
import com.cdg.chooz.domain.vote.GenderType;
import com.cdg.chooz.domain.vote.MbtiType;
import lombok.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CommentGetResponse {

    private Long id;

    private Long userId;

    private Long parentId;

    private String content;

    private GenderType gender;

    private String imageUrl;

    private AgeType age;

    private MbtiType mbti;

    private String nickName;

    private LocalDateTime createdDate;

    private Long likeCount;

    private Long hateCount;

    private List<CommentGetResponse> children = new ArrayList<>();


}
