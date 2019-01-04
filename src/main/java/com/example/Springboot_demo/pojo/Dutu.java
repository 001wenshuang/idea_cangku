package com.example.Springboot_demo.pojo;

/**
 * @author wilsonwen 文爽
 * @version 1.0
 * @description com.example.Springboot_demo.pojo
 * @date 2019/1/2
 * 这个对象主要用于 接受 数据库 返回的值
 */


public class Dutu {
    private  String username;
    private  String psw;

    private String mima;

    public Dutu() {
    }

    public Dutu(final String username, final String psw) {
        this.username = username;
        this.psw = psw;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(final String username) {
        this.username = username;
    }

    public String getPsw() {
        return psw;
    }

    public void setPsw(final String psw) {
        this.psw = psw;
    }

    public String getMima() {
        return mima;
    }

    public void setMima(final String mima) {
        this.mima = mima;
    }

    public Dutu(final String username, final String psw, final String mima) {
        this.username = username;
        this.psw = psw;
        this.mima = mima;
    }

    @Override
    public String toString() {
        return "Dutu{" +
                "username='" + username + '\'' +
                ", psw='" + psw + '\'' +
                ", mima='" + mima + '\'' +
                '}';
    }
}
