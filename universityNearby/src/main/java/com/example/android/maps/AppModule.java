package com.example.android.maps;

import com.example.android.maps.presenter.MapActivityPresenter;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {

    @Provides
    @Singleton
    MapActivityPresenter provideMapActivityPresenter() {
        return new MapActivityPresenter();
    }
}
