package com.dp.goodmaptesting;

import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.MapView;

public class MapDialog extends DialogFragment {

    private MapView mMapView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//https://code.google.com/p/gmaps-api-issues/issues/detail?id=4902
        this.mMapView = new MapView(this.getActivity(), new GoogleMapOptions());
        this.mMapView.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return this.mMapView;
    }

    @Override
    public void onResume() {
        super.onResume();

        this.mMapView.onResume();
    }

    @Override
    public void onPause() {
        super.onPause();

        this.mMapView.onPause();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();

        this.mMapView.onDestroy();
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();

        this.mMapView.onLowMemory();
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);

        this.mMapView.onSaveInstanceState(savedInstanceState);
    }

}
