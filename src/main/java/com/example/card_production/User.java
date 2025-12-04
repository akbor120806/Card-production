package com.example.card_production;

import java.io.Serializable;

public class User implements Serializable {
    protected String name;
    protected String password;
    protected String position;

    public User() {
    }

    public User(String name, String password, String position) {
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
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
