package com.example.android.maps.model;

import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.ArrayList;
import java.util.List;

public class UniversityMarkers {

    private static final LatLng AGH_POSITION = new LatLng(50.066820, 19.913630);
    private static final LatLng UJ_POSITION = new LatLng(50.060942, 19.934054);
    private static final LatLng UEK_POSITION= new LatLng(50.068537, 19.955002);
    private static final LatLng UP_POSITION= new LatLng(50.074225, 19.908351);
    private static final LatLng PK_POSITION= new LatLng(50.072003, 19.942764);
    private static final LatLng UW_POSITION= new LatLng(52.240442, 21.018597);
    private static final LatLng PW_POSITION= new LatLng(52.221181, 21.007935);
    private static final LatLng SGH_POSITION= new LatLng(52.212716, 21.008952);
    private static final LatLng WUM_POSITION= new LatLng(52.206148, 20.985319);
    private static final LatLng UWR_POSITION= new LatLng(51.114407, 17.034491);
    private static final LatLng PWR_POSITION= new LatLng(51.107362, 17.061678);
    private static final LatLng UM_POSITION= new LatLng(51.109250, 17.068840);
    private static final LatLng UPW_POSITION= new LatLng(52.240442, 21.018597);

    public static List<MarkerOptions> cracowMarkers = new ArrayList<>();
    public static List<MarkerOptions> warsawMarkers = new ArrayList<>();
    public static List<MarkerOptions> wroclawMarkers = new ArrayList<>();

    static {
        cracowMarkers.add(createMarkerOption(AGH_POSITION, "Akademia Górniczo-Hutnicza"));
        cracowMarkers.add(createMarkerOption(UJ_POSITION, "Uniwersytet Jagielloński"));
        cracowMarkers.add(createMarkerOption(UEK_POSITION, "Uniwersytet Ekonomiczny"));
        cracowMarkers.add(createMarkerOption(UP_POSITION, "Uniwersytet Pedagogiczny"));
        cracowMarkers.add(createMarkerOption(PK_POSITION, "Politechnika Krakowska"));
        warsawMarkers.add(createMarkerOption(UW_POSITION, "Uniwersytet Warszawski"));
        warsawMarkers.add(createMarkerOption(PW_POSITION, "Politechnika Warszawska"));
        warsawMarkers.add(createMarkerOption(SGH_POSITION, "Szkoła Główna Handlowa"));
        wroclawMarkers.add(createMarkerOption(WUM_POSITION, "Warszawski Uniwersytet Medyczny"));
        wroclawMarkers.add(createMarkerOption(UWR_POSITION, "Uniwersytet Wrocławski"));
        wroclawMarkers.add(createMarkerOption(PWR_POSITION, "Politechnika Wrocławska"));
        wroclawMarkers.add(createMarkerOption(UM_POSITION, "Uniwersytet Medyczny"));
        wroclawMarkers.add(createMarkerOption(UPW_POSITION, "Uniwersytet Przyrodniczy"));
    }


    private static MarkerOptions createMarkerOption(LatLng latLng, String description) {
        return new MarkerOptions().position(latLng).title(description);
    }
}
