package com.cdg.chooz.domain.vote;

import lombok.*;

@Getter
@NoArgsConstructor(access = AccessLevel.PUBLIC)
public class Vote {

    private Long id;
    private String title;
    private String imageA;
    private String imageB;
    private String titleA;
    private String titleB;
    private String detail;
    private VoteCategoryType category;
    private GenderType filteredGender;
    private AgeType filteredAge;
    private MbtiType filteredMbti;

    @Builder
    public Vote(String title, String imageA, String imageB, String titleA, String titleB, String detail, VoteCategoryType category, GenderType filteredGender, AgeType filteredAge, MbtiType filteredMbti) {
        this.title = title;
        this.imageA = imageA;
        this.imageB = imageB;
        this.titleA = titleA;
        this.titleB = titleB;
        this.detail = detail;
        this.category = category;
        this.filteredGender = filteredGender;
        this.filteredAge = filteredAge;
        this.filteredMbti = filteredMbti;
    }

    public Vote(CreateVoteInfo voteInfo) {
        this.title = voteInfo.getTitle();
        this.imageA = voteInfo.getImageA();
        this.imageB = voteInfo.getImageB();
        this.titleA = voteInfo.getTitleA();
        this.titleB = voteInfo.getTitleB();
    }

    public void  update(UpdateVoteRequest updateVoteRequest) {
        this.title = updateVoteRequest.getTitle();
        this.titleA = updateVoteRequest.getTitleA();
        this.titleB = updateVoteRequest.getTitleB();
        this.detail = updateVoteRequest.getDetail();
        this.category = updateVoteRequest.getCategory();
    }
}