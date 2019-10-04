package com.example.android.maps.model;

import com.google.android.gms.maps.model.LatLng;

public class CitiesPositions {

    public static final LatLng CRACOW_CENTER;
    public static final LatLng WARSAW_CENTER;
    public static final LatLng WROCLAW_CENTER;

    static {
        CRACOW_CENTER = new LatLng(50.064766, 19.944711);
        WARSAW_CENTER = new LatLng(52.228999, 21.010575);
        WROCLAW_CENTER = new LatLng(51.107871, 17.045356);
    }
}
