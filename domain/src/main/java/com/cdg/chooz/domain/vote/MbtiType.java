package com.cdg.chooz.domain.vote;


import com.cdg.chooz.domain.common.EnumModel;

public enum MbtiType implements EnumModel {

    ENFJ,
    ENFP,
    ENTJ,
    ENTP,
    ESFJ,
    ESFP,
    ESTJ,
    ESTP,
    INFJ,
    INFP,
    INTJ,
    INTP,
    ISFJ,
    ISFP,
    ISTJ,
    ISTP,
    NULL;

    @Override
    public String getKey() {
        return name();
    }

    @Override
    public String getValue() {
        return this.name().toLowerCase();
    }
}
