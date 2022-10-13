package com.yuul.bus.businessserver.model;

public enum RespEnum {
    SUCCESS("200","成功"),
    FAIL("500","失败");

    private String code;
    private String msg;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    RespEnum(String code,String msg){
        this.code=code;
        this.msg=msg;
    }
}
