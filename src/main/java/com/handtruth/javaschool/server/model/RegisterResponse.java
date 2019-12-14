package com.handtruth.javaschool.server.model;

public class RegisterResponse {

    private int code;

    private UserDetail user = null;

    public RegisterResponse(int code, UserDetail user) {
        this.code = code;
        this.user = user;
    }

    public RegisterResponse(int code) {
        this.code = code;
    }

    public RegisterResponse() {
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public UserDetail getUser() {
        return user;
    }

    public void setUser(UserDetail user) {
        this.user = user;
    }
}
