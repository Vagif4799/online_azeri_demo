package com.omline_azeri.model;

public enum Action {

    ACCOUNT("account"),
    PAYMENT("payment");

    private String value;

    Action(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}
