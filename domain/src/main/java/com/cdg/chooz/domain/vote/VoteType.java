package com.cdg.chooz.domain.vote;


import com.cdg.chooz.domain.common.EnumModel;

public enum VoteType implements EnumModel {

    created("작성"),

    participated("참여"),

    bookmarked("북마크");


    private String value;

    VoteType(String value) {
        this.value = value;
    }

    @Override
    public String getKey() {
        return name();
    }

    @Override
    public String getValue() {
        return value;
    }
}
