package com.example.card_production;

public class User {
    protected String name;
    protected int password;
    protected String position;

    public User() {
    }

    public User(String name, int password, String position) {
        this.name = name;
        this.password = password;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Controller{" +
                "name='" + name + '\'' +
                ", password=" + password +
                ", position='" + position + '\'' +
                '}';
    }
}
