package com.example.jh.gsondemo;

/**
 * Created by jinhui on 2018/6/12.
 * email: 1004260403@qq.com
 *
 * https://www.jianshu.com/p/87b43cf0952b
 */

public class ResMsg <T> {

    private int code;
    private String msg;
    private T data;

    public ResMsg(){
        code = 0;
        msg = "成功";
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

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
