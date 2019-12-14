package com.handtruth.javaschool.server.model;

public class ModuleInfo {
    private int id;

    private String name;

    private int complexity;

    private int lessonsCount;

    private int powerPoints;

    private String description;

    private String imgId;

    public ModuleInfo() {
    }

    public ModuleInfo(int id, String name, int complexity, int lessonsCount, int powerPoints, String description, String imgId) {
        this.id = id;
        this.name = name;
        this.complexity = complexity;
        this.lessonsCount = lessonsCount;
        this.powerPoints = powerPoints;
        this.description = description;
        this.imgId = imgId;
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

    public int getComplexity() {
        return complexity;
    }

    public void setComplexity(int complexity) {
        this.complexity = complexity;
    }

    public int getLessonsCount() {
        return lessonsCount;
    }

    public void setLessonsCount(int lessonsCount) {
        this.lessonsCount = lessonsCount;
    }

    public int getPowerPoints() {
        return powerPoints;
    }

    public void setPowerPoints(int powerPoints) {
        this.powerPoints = powerPoints;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImgId() {
        return imgId;
    }

    public void setImgId(String imgId) {
        this.imgId = imgId;
    }
}
