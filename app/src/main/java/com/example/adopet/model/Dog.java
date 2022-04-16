package com.example.adopet.model;

public class Dog {
    String name;
    String picture;
    String race;
    String color;
    String sizeGroup;
    long age;

    public Dog() {
    }

    public Dog(String name, String color, String sizeGroup, int age) {
        this.name = name;
        this.color = color;
        this.sizeGroup = sizeGroup;
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

    public String getSizeGroup() {
        return sizeGroup;
    }

    public void setSizeGroup(String sizeGroup) {
        this.sizeGroup = sizeGroup;
    }

    public long getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
