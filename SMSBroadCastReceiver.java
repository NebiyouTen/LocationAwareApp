package com.example.nyismaw.androidproject2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

/**
 * Created by nyismaw on 11/7/2017.
 */

public class SMSBroadCastReceiver extends BroadcastReceiver {

    public SMSBroadCastReceiver() {
        super();
    }

    @Override
    public IBinder peekService(Context myContext, Intent service) {
        return super.peekService(myContext, service);
    }

    @Override
    public void onReceive(Context context, Intent intent) {
       Log.e("SMS","RECEIEVEEEEDDDD");
    }
}
