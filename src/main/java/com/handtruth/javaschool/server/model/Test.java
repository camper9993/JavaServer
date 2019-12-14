package com.handtruth.javaschool.server.model;

import java.util.List;

public class Test {

    private int id;

    private int id_module;

    private int id_lesson;

    private String img_q;

    private String question;

    private String answer1;

    private String answer2;

    private String answer3;

    private String answer4;

    private int state = -1;


    private int true_answ;

    public Test(int id, int id_module, int id_lesson, String img_q, String question, String answer1, String answer2, String answer3, String answer4, int true_answ) {
        this.id = id;
        this.id_module = id_module;
        this.id_lesson = id_lesson;
        this.img_q = img_q;
        this.question = question;
        this.answer1 = answer1;
        this.answer2 = answer2;
        this.answer3 = answer3;
        this.answer4 = answer4;
        this.true_answ = true_answ;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_lesson() {
        return id_lesson;
    }

    public void setId_lesson(int id_lesson) {
        this.id_lesson = id_lesson;
    }

    public String getImg_q() {
        return img_q;
    }

    public void setImg_q(String img_q) {
        this.img_q = img_q;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer1() {
        return answer1;
    }

    public void setAnswer1(String answer1) {
        this.answer1 = answer1;
    }

    public String getAnswer2() {
        return answer2;
    }

    public void setAnswer2(String answer2) {
        this.answer2 = answer2;
    }

    public String getAnswer3() {
        return answer3;
    }

    public void setAnswer3(String answer3) {
        this.answer3 = answer3;
    }

    public String getAnswer4() {
        return answer4;
    }

    public void setAnswer4(String answer4) {
        this.answer4 = answer4;
    }

    public int getTrue_answ() {
        return true_answ;
    }

    public void setTrue_answ(int true_answ) {
        this.true_answ = true_answ;
    }

    public int getId_module() {
        return id_module;
    }

    public void setId_module(int id_module) {
        this.id_module = id_module;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }
}
