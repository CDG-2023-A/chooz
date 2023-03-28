package com.cdg.chooz.controller.user.response;

import com.example.manymanyUsers.vote.enums.Age;
import com.example.manymanyUsers.vote.enums.Gender;
import com.example.manymanyUsers.vote.enums.MBTI;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class GetUserResponse {

    private Long userId;

    private String image;

    private String nickname;

//    private Gender gender;

    private Integer age;

//    private Age ageGroup;

//    private MBTI mbti;


    public GetUserResponse(Long userId, String image, String nickname, Integer age) {
        this.userId = userId;
        this.image = image;
        this.nickname = nickname;
        this.age = age;
    }
}
