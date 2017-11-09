/*
On my honor, as a Carnegie-Mellon Rwanda student, I have neither given nor received unauthorized assistance on this work.

 */
package com.example.nyismaw.androidproject2.Map;

import android.location.Location;

/**
 * Created by nyismaw on 11/7/2017.
 */

public class CurrentLocation {
    private static Location location;

    public static Location getLocation() {
        return location;
    }

    public static void setLocation(Location location) {
        CurrentLocation.location = location;
    }
}
