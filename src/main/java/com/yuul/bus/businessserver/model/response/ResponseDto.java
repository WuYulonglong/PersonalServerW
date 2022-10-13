package com.yuul.bus.businessserver.model.response;


import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
@AllArgsConstructor
public class ResponseDto<T> implements Serializable {
    private String code;
    private String msg;
    private T respBody;

    public ResponseDto(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
