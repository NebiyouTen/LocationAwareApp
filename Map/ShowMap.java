/*
On my honor, as a Carnegie-Mellon Rwanda student, I have neither given nor received unauthorized assistance on this work.

 */
package com.example.nyismaw.androidproject2.Map;

import android.view.View;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;


public class ShowMap implements View.OnClickListener, OnMapReadyCallback {

    @Override
    public void onClick(View v) {

    }

    private GoogleMap mMap;

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        LatLng sydney = new LatLng(-34, 151);
        mMap.addMarker(new MarkerOptions().position(sydney).title("Marker in Sydney"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
    }


}
