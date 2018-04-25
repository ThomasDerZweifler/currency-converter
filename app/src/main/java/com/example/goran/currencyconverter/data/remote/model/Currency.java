package com.example.goran.currencyconverter.data.remote.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Currency {

    @SerializedName("currency_code")
    @Expose
    private String currencyCode;
    @SerializedName("unit_value")
    @Expose
    private Integer unitValue;
    @SerializedName("median_rate")
    @Expose
    private String medianRate;

    public Currency(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public Integer getUnitValue() {
        return unitValue;
    }

    public void setUnitValue(Integer unitValue) {
        this.unitValue = unitValue;
    }

    public Double getMedianRate() {
        return Double.parseDouble(medianRate);
    }

    public void setMedianRate(String medianRate) {
        this.medianRate = medianRate;
    }

    public boolean isHRK() {
        return this.currencyCode.equals("HRK");
    }

    @Override
    public String toString() {
        return this.currencyCode;
    }
}
