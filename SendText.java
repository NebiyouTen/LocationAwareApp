package com.example.nyismaw.androidproject2;

import android.content.Context;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Toast;

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
        SmsManager smsManager = SmsManager.getDefault();
        smsManager.sendTextMessage("+250734598723", null,
               "Test text message" , null, null);
        Toast.makeText(context, "Message sent!", Toast.LENGTH_SHORT).show();
    }
}
