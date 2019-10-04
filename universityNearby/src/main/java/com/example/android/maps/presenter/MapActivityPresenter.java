package com.example.android.maps.presenter;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import java.util.List;
import javax.inject.Inject;

public class MapActivityPresenter {

    @Inject
    public MapActivityPresenter() {
    }

    public void addMarkers(final GoogleMap map, List<MarkerOptions> cityMarkers) {
        List<MarkerOptions> markers = cityMarkers;
        for (MarkerOptions element : markers) {
            map.addMarker(element);
        }
    }

    public void zoomTo(GoogleMap map, LatLng latLng) {
        map.moveCamera(CameraUpdateFactory.newLatLng(latLng));
    }

    public void zoomLevel(GoogleMap map) {
        map.animateCamera(CameraUpdateFactory.zoomTo(11));
    }
}
