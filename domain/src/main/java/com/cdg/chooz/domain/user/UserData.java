package com.cdg.chooz.domain.user;

import lombok.Getter;

@Getter
public class UserData {
    private Long userid;

    private String nickname;

    private String imageUrl;

    public UserData(User user) {
        this.userid = user.getId();
        this.nickname = user.getNickname();
        this.imageUrl = user.getImageUrl();
    }
}
