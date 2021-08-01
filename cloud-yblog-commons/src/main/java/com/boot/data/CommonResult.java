package com.boot.data;

import com.boot.constant.Constant;

public class CommonResult<T> {

    /**
     * feign调用结果封装类
     */
    private T data;

    private int code;

    private String msg;


    public CommonResult() {
        this.data = null;
        this.code = Constant.ERROR;
        this.msg = "";
    }

    public CommonResult(T data) {
        this.data = data;
        this.code = Constant.SUCCESS;
        this.msg = "";
    }
    public CommonResult(T data, int code) {
        this.data = data;
        this.code = code;
        this.msg = "";
    }

    public CommonResult(T data, int code, String msg) {
        this.data = data;
        this.code = code;
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

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

    @Override
    public String toString() {
        return "CommonResult{" +
                "data=" + data +
                ", code=" + code +
                ", msg='" + msg + '\'' +
                '}';
    }
}
