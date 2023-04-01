package com.lld.im.common.model;

import lombok.Data;

@Data
public class RequestBase {

    private String operater;
    private Integer appId;

    public void setOperater(String operater) {
        this.operater = operater;
    }

    public String getOperater() {
        return this.operater;
    }
}
