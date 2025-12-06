package com.example.card_production.Akbor;

import java.io.Serializable;

public class budget implements Serializable {
    protected int  paper,binding,packaging,ink;

    public budget() {
    }

    public budget(int paper, int binding, int packaging, int ink) {
        this.paper = paper;
        this.binding = binding;
        this.packaging = packaging;
        this.ink = ink;
    }

    public int getPaper() {
        return paper;
    }

    public void setPaper(int paper) {
        this.paper = paper;
    }

    public int getBinding() {
        return binding;
    }

    public void setBinding(int binding) {
        this.binding = binding;
    }

    public int getPackaging() {
        return packaging;
    }

    public void setPackaging(int packaging) {
        this.packaging = packaging;
    }

    public int getInk() {
        return ink;
    }

    public void setInk(int ink) {
        this.ink = ink;
    }

    @Override
    public String toString() {
        return "budget{" +
                "paper=" + paper +
                ", binding=" + binding +
                ", packaging=" + packaging +
                ", ink=" + ink +
                '}';
    }
}
