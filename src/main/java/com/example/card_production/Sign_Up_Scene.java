package com.example.card_production;

import java.io.Serializable;

public class Sign_Up_Scene implements Serializable {

    protected String userName,number,gmail,password,position;

    public Sign_Up_Scene() {
    }

    public Sign_Up_Scene(String userName, String number, String gmail, String password, String position) {
        this.userName = userName;
        this.number = number;
        this.gmail = gmail;
        this.password = password;
        this.position = position;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Log_in_scene{" +
                "userName='" + userName + '\'' +
                ", number='" + number + '\'' +
                ", gmail='" + gmail + '\'' +
                ", password='" + password + '\'' +
                ", position='" + position + '\'' +
                '}';
    }
}
