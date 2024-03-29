package com.xswinger.part3.enums;

public enum Smell {
    TLENIE ("тление"),
    GAR ("гарь");

    private String title;

    Smell(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
