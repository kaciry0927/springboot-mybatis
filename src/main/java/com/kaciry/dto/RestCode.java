package com.kaciry.dto;

public enum RestCode {

    OK(0, "OK"),
    UNKNOW_ERROR(1, "服务异常"),
    WRONG_PAGE(10100, "页码不存在"),
    ;

    RestCode(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int code;
    public String msg;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

}
