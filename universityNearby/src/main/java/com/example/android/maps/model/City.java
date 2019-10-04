package com.example.android.maps.model;

public class City {

    private String cityName = "", buttonText = "";

    public City() {
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getButtonText() {
        return buttonText;

    }

    @Override
    public String toString() {
        return "Search in: " + cityName;
    }
}