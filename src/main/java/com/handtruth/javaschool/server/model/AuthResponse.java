package com.handtruth.javaschool.server.model;

public class AuthResponse {

    private int code;

    private String  token;

    private UserDetail user = null;

    public AuthResponse(int code, String token, UserDetail user) {
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

    public UserDetail getUser() {
        return user;
    }

    public void setUser(UserDetail user) {
        this.user = user;
    }
}
