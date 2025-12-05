package com.example.card_production.Akbor;

public class ClientOrder {
    protected String clientName, design;
    protected  int orderQnt, deadline;

    public ClientOrder(String clientName, String design, int orderQnt, int deadline) {
        this.clientName = clientName;
        this.design = design;
        this.orderQnt = orderQnt;
        this.deadline = deadline;
    }

    public String getDesign() {
        return design;
    }

    public void setDesign(String design) {
        this.design = design;
    }

    public int getOrderQnt() {
        return orderQnt;
    }

    public void setOrderQnt(int orderQnt) {
        this.orderQnt = orderQnt;
    }

    public int getDeadline() {
        return deadline;
    }

    public void setDeadline(int deadline) {
        this.deadline = deadline;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public ClientOrder() {
    }

    @Override
    public String toString() {
        return "ClientOrder{" +
                "clientName='" + clientName + '\'' +
                ", design='" + design + '\'' +
                ", orderQnt=" + orderQnt +
                ", deadline=" + deadline +
                '}';
    }

//    public Object ClientNameTextFielw() {
////
//    }
}
