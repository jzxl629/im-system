package com.lld.im.common.model;

import lombok.Data;

@Data
public class RequestBase {

    private String operater;
    private Integer appId;

    public void setOperator(String operator) {
        this.operater = operator;
    }

    public String getOperator() {
        return this.operater;
    }
}
