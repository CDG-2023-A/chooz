package com.cdg.chooz.domain.vote;

import com.cdg.chooz.domain.common.EnumModel;

public enum SortByType implements EnumModel {
    ByTime("createdDate"),
    ByPopularity("인기순");

    private String value;

    SortByType(String value) {
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
