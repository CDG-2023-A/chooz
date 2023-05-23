package com.cdg.chooz.controller.vote.data;

import com.cdg.chooz.domain.user.UserData;
import com.cdg.chooz.domain.vote.AgeType;
import com.cdg.chooz.domain.vote.GenderType;
import com.cdg.chooz.domain.vote.MbtiType;
import com.cdg.chooz.domain.vote.VoteCategoryType;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class VoteListData {

    private final Long voteId;

    private final UserData writer;

    private final String title;

    private final VoteCategoryType category;

    private final GenderType filteredGender;

    private final AgeType filteredAge;

    private final MbtiType filteredMbti;

    private final String imageA;

    private final String imageB;

    private final String titleA;

    private final String titleB;

    private final String detail;

    private final LocalDateTime modifiedDate;

    private final Long countVoted;

    public VoteListData(final Vote vote, final Long countVoted) {
        this.voteId = vote.getId();
        this.title = vote.getTitle();
        this.category = vote.getCategory();
        this.filteredGender = vote.getFilteredGender();
        this.filteredAge = vote.getFilteredAge();
        this.filteredMbti = vote.getFilteredMbti();
        this.imageA = vote.getImageA();
        this.imageB = vote.getImageB();
        this.modifiedDate = vote.getModifiedDate();
        this.titleA = vote.getTitleA();
        this.titleB = vote.getTitleB();
        this.detail = vote.getDetail();
        this.countVoted = countVoted;
        UserData userData = new UserData(vote.getPostedUser());
        this.writer = userData;
    }
}
