package com.handtruth.javaschool.server.model;

import java.util.List;

public class ModuleTests {

    private int id;

    private int id_module;

    private String name;

    private int test_count;


    public ModuleTests(int id, int id_module, String name, int test_count) {
        this.id = id;
        this.id_module = id_module;
        this.name = name;
        this.test_count = test_count;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_module() {
        return id_module;
    }

    public void setId_module(int id_module) {
        this.id_module = id_module;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTest_count() {
        return test_count;
    }

    public void setTest_count(int test_count) {
        this.test_count = test_count;
    }
}
