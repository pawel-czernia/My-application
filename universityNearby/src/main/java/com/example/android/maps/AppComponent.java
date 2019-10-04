package com.example.android.maps;

import com.example.android.maps.view.MapActivity;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(
        modules = {
                AppModule.class
        }
)
public interface AppComponent {

    void inject(MapActivity instance);
}
