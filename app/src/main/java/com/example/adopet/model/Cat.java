package com.example.adopet.model;

public class Cat {
    String name;
    String picture;
    String race;
    String color;
    String sex;
    long age;

    public Cat(){}

    public Cat(String name, String color, String sex, long age) {
        this.name = name;
        this.color = color;
        this.sex = sex;
        this.age = age;
        this.picture = "";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public long getAge() {
        return age;
    }

    public void setAge(long age) {
        this.age = age;
    }
}
