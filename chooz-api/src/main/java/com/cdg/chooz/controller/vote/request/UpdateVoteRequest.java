package com.cdg.chooz.controller.vote.request;

import com.cdg.chooz.domain.vote.UpdateVoteInfo;
import com.cdg.chooz.domain.vote.VoteCategoryType;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class UpdateVoteRequest {

    @Schema(description = "투표 제목", example = "A, B 중 어떤게 나을까요?")
    private String title;

    @Schema(description = "투표 상세글")
    private String detail;

    @Schema(description = "투표 카테고리")
    private VoteCategoryType category;

    @Schema(description = "A 항목의 제목")
    private String titleA;

    @Schema(description = "B 항목의 제목")
    private String titleB;

    public UpdateVoteInfo toDomain() {
        return new UpdateVoteInfo(title, detail, category, titleA, titleB);
    }

}
