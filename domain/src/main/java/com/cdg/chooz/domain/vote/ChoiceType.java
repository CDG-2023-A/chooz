package com.cdg.chooz.domain.vote;


import com.cdg.chooz.domain.common.EnumModel;

public enum ChoiceType implements EnumModel {
    A,
    B;

    @Override
    public String getKey() {
        return name();
    }

    @Override
    public String getValue() {
        return name();
    }
}
