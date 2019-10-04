package com.example.android.maps.view;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.example.android.maps.AppModule;
import com.example.android.maps.DaggerAppComponent;
import com.example.android.maps.model.CitiesPositions;
import com.example.android.maps.presenter.MapActivityPresenter;
import com.example.android.maps.R;
import com.example.android.maps.model.UniversityMarkers;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;

import javax.inject.Inject;

public class MapActivity extends FragmentActivity implements OnMapReadyCallback {

    private String cityName;

    @Inject
    MapActivityPresenter mapActivityPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        DaggerAppComponent.builder().appModule(new AppModule()).build().inject(this);
        setContentView(R.layout.activity_maps);
        cityName = getIntent().getStringExtra("CITY_NAME");
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        if (cityName.toLowerCase().equals("cracow")) {
            mapActivityPresenter.addMarkers(googleMap, UniversityMarkers.cracowMarkers);
            mapActivityPresenter.zoomTo(googleMap, CitiesPositions.CRACOW_CENTER);
        } else if (cityName.toLowerCase().equals("warsaw")) {
            mapActivityPresenter.addMarkers(googleMap, UniversityMarkers.warsawMarkers);
            mapActivityPresenter.zoomTo(googleMap, CitiesPositions.WARSAW_CENTER);
        } else if (cityName.toLowerCase().equals("wroclaw")) {
            mapActivityPresenter.addMarkers(googleMap, UniversityMarkers.wroclawMarkers);
            mapActivityPresenter.zoomTo(googleMap, CitiesPositions.WROCLAW_CENTER);
        }
        mapActivityPresenter.zoomLevel(googleMap);
    }
}
