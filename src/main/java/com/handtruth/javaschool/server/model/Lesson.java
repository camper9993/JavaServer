package com.handtruth.javaschool.server.model;

public class Lesson {

    private int id;

    private int module_id;

    private String  name;

    private int lessonPoints;

    private String skills;

    private String content;

    public Lesson(int id, int module_id, String name, int lessonPoints, String skills, String contentPath) {
        this.id = id;
        this.module_id = module_id;
        this.name = name;
        this.lessonPoints = lessonPoints;
        this.skills = skills;
        this.content = contentPath;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLessonPoints() {
        return lessonPoints;
    }

    public void setLessonPoints(int lessonPoints) {
        this.lessonPoints = lessonPoints;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public String getContentPath() {
        return content;
    }

    public void setContentPath(String contentPath) {
        this.content = contentPath;
    }

    public int getModule_id() {
        return module_id;
    }

    public void setModule_id(int module_id) {
        this.module_id = module_id;
    }
}
