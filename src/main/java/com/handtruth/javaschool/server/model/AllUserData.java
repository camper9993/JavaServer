package com.handtruth.javaschool.server.model;

import java.util.List;

public class AllUserData {
    UserDetail user_detail;

    List<Integer> downloaded_modules;

    List<Integer> downloaded_tests;

    public AllUserData(UserDetail user_detail, List<Integer> downloaded_modules, List<Integer> downloaded_tests) {
        this.user_detail = user_detail;
        this.downloaded_modules = downloaded_modules;
        this.downloaded_tests = downloaded_tests;
    }

    public UserDetail getUser_detail() {
        return user_detail;
    }

    public void setUser_detail(UserDetail user_detail) {
        this.user_detail = user_detail;
    }

    public List<Integer> getDownloaded_modules() {
        return downloaded_modules;
    }

    public void setDownloaded_modules(List<Integer> downloaded_modules) {
        this.downloaded_modules = downloaded_modules;
    }

    public List<Integer> getDownloaded_tests() {
        return downloaded_tests;
    }

    public void setDownloaded_tests(List<Integer> downloaded_tests) {
        this.downloaded_tests = downloaded_tests;
    }
}
