package com.yuul.bus.businessserver.utils;

import com.yuul.bus.businessserver.model.RespEnum;
import com.yuul.bus.businessserver.model.response.ResponseDto;

public class ResponseBuilder {
    public static <T> ResponseDto<T> buildSuccess(){
        return new ResponseDto<T>(RespEnum.SUCCESS.getCode(),RespEnum.SUCCESS.getMsg());
    }

    public static <T> ResponseDto<T> buildFail(){
        return new ResponseDto<T>(RespEnum.FAIL.getCode(),RespEnum.FAIL.getMsg());
    }
}
