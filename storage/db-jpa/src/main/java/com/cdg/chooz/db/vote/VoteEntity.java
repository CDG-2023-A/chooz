package com.cdg.chooz.db.vote;

import com.cdg.chooz.db.common.BaseTimeEntity;
import com.cdg.chooz.db.user.UserEntity;
import com.cdg.chooz.domain.vote.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.BatchSize;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PUBLIC)
public class VoteEntity extends BaseTimeEntity {

    @Id
    @GeneratedValue
    @Column(name = "VOTE_ID")
    private Long id;

    /**
     * User 와의 연관관계 주인
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "USER_ID")
    private UserEntity postedUser;


    @BatchSize(size = 1000)
    @OneToMany(mappedBy = "vote", fetch = FetchType.LAZY)
    private List<VoteResultEntity> voteResultList = new ArrayList<>();

    @Column
    private String title;

    @Column
    private String imageA;

    @Column
    private String imageB;

    @Column
    private String titleA;

    @Column
    private String titleB;

    @Column
    private String detail;

    @Column
    @Enumerated(EnumType.STRING)
    private VoteCategoryType category;

    @Column
    @Enumerated(EnumType.STRING)
    private GenderType filteredGender;

    /**
     * 필터링 거는 나이는 10대, 20대, 30대 이므로 여기는 AGE enum을 이용하고
     * User 엔티티의 나이는 실제 나이를 입력받으므로 INTEGER 로 저장
     */
    @Column
    @Enumerated(EnumType.STRING)
    private AgeType filteredAge;

    @Column
    @Enumerated(EnumType.STRING)
    private MbtiType filteredMbti;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "vote", cascade = CascadeType.REMOVE)
    private List<BookmarkEntity> bookmarkList = new ArrayList<>();

    public void removeBookmark(BookmarkEntity bookmark) {
        this.bookmarkList.remove(bookmark);
    }

//    @Builder
//    public Vote(UserEntity postedUser, String title, String imageA, String imageB, String titleA, String titleB, String detail, VoteCategoryType category, GenderType filteredGender, AgeType filteredAge, MbtiType filteredMbti) {
//        this.postedUser = postedUser;
//        this.title = title;
//        this.imageA = imageA;
//        this.imageB = imageB;
//        this.titleA = titleA;
//        this.titleB = titleB;
//        this.detail = detail;
//        this.category = category;
//        this.filteredGender = filteredGender;
//        this.filteredAge = filteredAge;
//        this.filteredMbti = filteredMbti;
//    }

    public VoteEntity(Vote vote, UserEntity userEntity) {
        this.postedUser = userEntity;
        this.title = vote.getTitle();
        this.imageA = vote.getImageA();
        this.imageB = vote.getImageB();
        this.titleA = vote.getTitleA();
        this.titleB = vote.getTitleB();
        this.detail = vote.getDetail();
        this.category = vote.getCategory();
        this.filteredGender = vote.getFilteredGender();
        this.filteredAge = vote.getFilteredAge();
        this.filteredMbti = vote.getFilteredMbti();
    }

    public void update(UpdateVoteRequest updateVoteRequest) {
        this.title = updateVoteRequest.getTitle();
        this.titleA = updateVoteRequest.getTitleA();
        this.titleB = updateVoteRequest.getTitleB();
        this.detail = updateVoteRequest.getDetail();
        this.category = updateVoteRequest.getCategory();
    }

    public void addVoteResult(VoteResult voteResult) {
        this.voteResultList.add(voteResult);
    }

    public void mappingBookmark(Bookmark bookmark) {
        this.bookmarkList.add(bookmark);
    }
}