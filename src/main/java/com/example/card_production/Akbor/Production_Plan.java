package com.example.card_production.Akbor;

import java.io.Serializable;

public class Production_Plan implements Serializable {

protected String productType,forecast,requiredMaterial;

    public Production_Plan() {
    }

    public Production_Plan (String productType, String forecast, String requiredMaterial) {
        this.productType = productType;
        this.forecast = forecast;
        this.requiredMaterial = requiredMaterial;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getForecast() {
        return forecast;
    }

    public void setForecast(String forecast) {
        this.forecast = forecast;
    }

    public String getRequiredMaterial() {
        return requiredMaterial;
    }

    public void setRequiredMaterial(String requiredMaterial) {
        this.requiredMaterial = requiredMaterial;
    }

    @Override
    public String toString() {
        return "Production_Plan{" +
                "productType='" + productType + '\'' +
                ", forecast='" + forecast + '\'' +
                ", requiredMaterial='" + requiredMaterial + '\'' +
                '}';
    }
}
