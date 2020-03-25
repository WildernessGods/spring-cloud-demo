package com.wilderness.boot.response;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 服务器响应
 */
@Setter
@Getter
@ToString
@Accessors(chain = true)
public class Response implements Serializable {
    /**
     * 错误代码,0是正常,其他是错误
     */
    private Integer code;
    /**
     * 错误消息
     */
    private String msg;

    public static Response ok() {
        return new Response().setCode(ResponseCode.OK.code);
    }

    public static Response fail(String msg) {
        return new Response().setCode(ResponseCode.FAIL.code).setMsg(msg);
    }

    public static Response fail(Integer code, String msg) {
        return new Response().setCode(code).setMsg(msg);
    }

    public static Response unauthorized(String msg) {
        return new Response().setCode(ResponseCode.UNAUTHORIZED.code).setMsg(msg);
    }

    public static Response error(String msg) {
        return new Response().setCode(ResponseCode.ERROR.code).setMsg(msg);
    }

    public Response() {
        this.setCode(ResponseCode.OK.code);
    }
}
