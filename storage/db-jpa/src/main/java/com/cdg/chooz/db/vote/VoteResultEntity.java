package com.cdg.chooz.db.vote;

import com.cdg.chooz.db.user.UserEntity;
import com.cdg.chooz.domain.vote.ChoiceType;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PUBLIC)
public class VoteResultEntity {

    @Id
    @GeneratedValue
    @Column(name = "VOTE_RESULT_ID")
    private Long id;

    /**
     * Vote 와의 연관관계 주인
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "VOTE_ID")
    private VoteEntity vote;

    /**
     * User 와의 연관관계 주인
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "USER_ID")
    private UserEntity votedUser;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private ChoiceType choice;

//    public void doVote(Vote vote, User user, Choice choice) {
//        this.vote = vote;
//        vote.addVoteResult(this);
//        this.votedUser = user;
//        this.choice = choice;
//    }

}
