package com.cdg.chooz.controller.user.request;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class UpdateUserRequest {
    String nickname;

    String image;

//    MBTI mbti;

//    List<Category> categoryList;


    public UpdateUserRequest(String nickname, String image) {
        this.nickname = nickname;
        this.image = image;
    }
}
