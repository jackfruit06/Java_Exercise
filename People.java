package com.hus.oop.exercise05;

public abstract class People{
    private String name;
    private final String id; // CCCD
    private int age;

    public People(String name , String id , int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}