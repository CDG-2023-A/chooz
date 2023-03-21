package com.cdg.chooz.domain.common;

public enum ErrorCode implements EnumModel {
    TokenExpired("401");

    private String value;

    ErrorCode(String value) {
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
