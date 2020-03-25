package com.wilderness.boot.response;

/**
 * 返回代码
 */
public enum ResponseCode {
    /**
     * 操作成功
     */
    OK(0, "操作成功"),

    /**
     * 操作失败
     */
    FAIL(1, "操作失败"),

    /**
     * 服务器繁忙,请稍后再试!
     */
    ERROR(-1, "服务器繁忙,请稍后再试!"),

    /**
     * Token超时或未登录
     */
    UNAUTHORIZED(100, "Token超时或未登录");

    public Integer code;
    public String msg;

    ResponseCode(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
