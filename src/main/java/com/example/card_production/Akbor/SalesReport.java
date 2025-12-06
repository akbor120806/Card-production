package com.example.card_production.Akbor;

import java.time.LocalDate;
import java.util.Date;

public class SalesReport {
protected String product,type;
protected int Revenue,cost;
protected LocalDate startDate,endDate;

    public SalesReport() {
    }

    public SalesReport(String product, String type, int revenue, int cost, LocalDate endDate, LocalDate startDate) {
        this.product = product;
        this.type = type;
        Revenue = revenue;
        this.cost = cost;
        this.endDate = endDate;
        this.startDate = startDate;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getRevenue() {
        return Revenue;
    }

    public void setRevenue(int revenue) {
        Revenue = revenue;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "SalesReport{" +
                "product='" + product + '\'' +
                ", type='" + type + '\'' +
                ", Revenue=" + Revenue +
                ", cost=" + cost +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                '}';
    }
}
