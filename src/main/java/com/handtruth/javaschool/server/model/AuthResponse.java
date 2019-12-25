package com.handtruth.javaschool.server.model;

public class AuthResponse {

    private int code;

    private String  token;

    private AllUserData user = null;

    public AuthResponse(int code, String token, AllUserData user) {
        this.code = code;
        this.token = token;
        this.user = user;
    }

    public AuthResponse(int code, String token) {
        this.code = code;
        this.token = token;
    }

    public AuthResponse() {
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public AllUserData getUser() {
        return user;
    }

    public void setUser(AllUserData user) {
        this.user = user;
    }
}
