package com.example.android.maps.presenter;

import com.example.android.maps.model.City;

public class MainActivityPresenter {
    private City city;
    private View view;

    public MainActivityPresenter(View view) {
        this.city = new City();
        this.view = view;
    }

    public void updateButtonText(String cityName) {
        city.setCityName(cityName);
        view.updateSearchButton(city.toString());
    }

    public String passCityName() {
        String cityName = city.getCityName();
        return cityName;

    }

    public interface View {
        void updateSearchButton(String button);
        void showButton();
        void hideText();
        void goToMap();
    }
}