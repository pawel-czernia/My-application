package com.example.android.maps.presenter;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Matchers.any;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class MapActivityPresenterTest {

    @Mock
    private GoogleMap googleMap;

    private MapActivityPresenter mapActivityPresenter;

    @Before
    public void setup() {
        this.mapActivityPresenter = new MapActivityPresenter();
    }

    @Test
    public void shouldTryToAddMarkers() {
        //given
        List<MarkerOptions> cityMarkers = provideDummyData();

        //when
        mapActivityPresenter.addMarkers(googleMap, cityMarkers);

        //then
        verify(googleMap, times(cityMarkers.size())).addMarker(any());
    }

    private List<MarkerOptions> provideDummyData() {
        List<MarkerOptions> cityMarkers = new ArrayList<>();

        cityMarkers.add(createMarkerOption(new LatLng(50.066820, 19.913630), "test_1"));
        cityMarkers.add(createMarkerOption(new LatLng(51.066820, 20.913630), "test_2"));
        return cityMarkers;
    }

    private static MarkerOptions createMarkerOption(LatLng latLng, String description) {
        return new MarkerOptions().position(latLng).title(description);
    }
}
