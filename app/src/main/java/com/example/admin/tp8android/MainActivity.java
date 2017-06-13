package com.example.admin.tp8android;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);








    }

    public void envoyer(View view) {

      /*  String uri = "smsto:" + numtelephone.getText().toString();

        Intent intent = new Intent(Intent.ACTION_SENDTO, Uri.parse(uri));
        intent.putExtra("sms_body", message1.getText().toString());
        startActivity(intent);*/


        String message1 = ((TextView) findViewById(R.id.message)).getText().toString();
        String numtelephone = ((TextView) findViewById(R.id.numtel)).getText().toString();


        SmsManager smsManager = SmsManager.getDefault();
        smsManager.sendTextMessage(numtelephone,null,message1,null,null);


    }
}
