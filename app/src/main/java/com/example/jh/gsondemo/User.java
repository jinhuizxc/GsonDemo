package com.example.jh.gsondemo;

/**
 * Created by jinhui on 2018/6/12.
 * email: 1004260403@qq.com
 */

public class User extends Object {
    /**
     * 用户id
     */
    private int userId;
    /**
     * 昵称
     */
    private String nickname;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    @Override
    public String toString(){
        return String.format("userId:%d , nickname:%s",userId,nickname);
    }
}

