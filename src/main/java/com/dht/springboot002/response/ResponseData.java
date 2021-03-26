package com.dht.springboot002.response;

import lombok.Data;

@Data
public class ResponseData {
    private Integer code;//提示代码
    private String message;//提示消息

    public ResponseData(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
