package com.example.card_production.Akbor;

public class Marketing {
    protected String name;
    protected int budget,roi;

    public Marketing() {
    }

    public Marketing(String name, int budget, int roi) {
        this.name = name;
        this.budget = budget;
        this.roi = roi;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    public int getRoi() {
        return roi;
    }

    public void setRoi(int roi) {
        this.roi = roi;
    }

    @Override
    public String toString() {
        return "Marketing{" +
                "name='" + name + '\'' +
                ", budget=" + budget +
                ", roi=" + roi +
                '}';
    }
}
