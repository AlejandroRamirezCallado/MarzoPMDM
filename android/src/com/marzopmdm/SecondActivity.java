package com.marzopmdm;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class   SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        //SecondActivityEvents events = new SecondActivityEvents(this);
        //DataHolder.instance.fireBaseAdmin.setListener(events);
    }
}
