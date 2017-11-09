/*
On my honor, as a Carnegie-Mellon Rwanda student, I have neither given nor received unauthorized assistance on this work.

 */
package com.example.nyismaw.androidproject2.Map;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.nyismaw.androidproject2.R;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapCallBack extends Fragment implements OnMapReadyCallback {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_map3, container, false);
        SupportMapFragment mapFragment = (SupportMapFragment) this.getChildFragmentManager()
                .findFragmentById(R.id.map33);
        Log.e("neba","on create view "+mapFragment);
        mapFragment.getMapAsync(this);

        return view;
    }
    @Override
    public void onMapReady(GoogleMap googleMap) {
        GoogleMap mMap = googleMap;

        // Add a marker in Sydney, Australia, and move the camera.
        LatLng latlong = new LatLng(CurrentLocation.getLocation().getLatitude(), CurrentLocation.getLocation().getLongitude());
        mMap.addMarker(new MarkerOptions().position(latlong).title("Current location"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(latlong));
        mMap.animateCamera(CameraUpdateFactory.zoomTo(15.0f));

    }
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

    }

    @Override
    public void onDetach() {
        super.onDetach();
    }
}
