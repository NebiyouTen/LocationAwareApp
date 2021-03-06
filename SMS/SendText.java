/*
On my honor, as a Carnegie-Mellon Rwanda student, I have neither given nor received unauthorized assistance on this work.

 */
package com.example.nyismaw.androidproject2.SMS;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.telephony.SmsManager;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.example.nyismaw.androidproject2.Map.CurrentLocation;

/**
 * Created by nyismaw on 11/7/2017.
 */

public class SendText implements View.OnClickListener {
    Context context;
    public SendText(Context context) {

        this.context = context;
    }

    @Override
    public void onClick(View v) {
         String msg= CurrentLocation.getLocation().getLatitude()+" , "+
                 CurrentLocation.getLocation().getLongitude();
         sendSMS("+250734598723",msg);
    }
    private void sendSMS(String mobNo, String message) {
        String smsSent = "SMS_SENT";
        String smsDelivered = "SMS_DELIVERED";
        PendingIntent sentPI = PendingIntent.getBroadcast(context, 0,
                new Intent(smsSent), 0);
        PendingIntent deliveredPI = PendingIntent.getBroadcast(context, 0,
                new Intent(smsDelivered), 0);
        context.getApplicationContext().registerReceiver(new BroadcastReceiver(){
            @Override
            public void onReceive(Context arg0, Intent arg1) {
                Log.e("Weeeeeeeeeee","");
                context.unregisterReceiver(this);
                Toast.makeText(context, "SMS sent",
                        Toast.LENGTH_SHORT).show();

            }
        }, new IntentFilter(smsSent));

         context.getApplicationContext().registerReceiver(new BroadcastReceiver(){
            @Override
            public void onReceive(Context arg0, Intent arg1) {

                Toast.makeText(context, "SMS Delivered",
                        Toast.LENGTH_SHORT).show();
                context.unregisterReceiver(this);

            }
        }, new IntentFilter(smsDelivered));

        SmsManager sms = SmsManager.getDefault();
        sms.sendTextMessage(mobNo, null, message, sentPI, deliveredPI);
    }
}
