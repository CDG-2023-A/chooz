package com.cdg.chooz.client.kakao.request;

import lombok.Data;

@Data
public class BearerAuthHeader {
    private String Authorization;

    public BearerAuthHeader(String token) {
        this.Authorization = "Bearer " + token;
    }
}
