package com.example.nyismaw.androidproject2;


import android.location.Location;
import android.util.Log;
import android.widget.TextView;

import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationResult;

/**
 * Created by nyismaw on 11/7/2017.
 */

public class AppLocationListener implements LocationListener {
    TextView textView1;
    TextView textView2;

    public AppLocationListener(TextView textView1, TextView textView2) {
        this.textView1 = textView1;
        this.textView2 = textView2;
    }

    @Override
    public void onLocationChanged(Location location) {
        Log.e("make use of*****", "inside location changed");
        textView1.setText(String.valueOf(location.getLatitude()));
        textView2.setText(String.valueOf(location.getLongitude()));
        CurrentLocation.setLocation(location);

    }

}
