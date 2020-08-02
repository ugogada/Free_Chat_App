package com.example.freechatapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void contactus(View view) {
        Intent i=new Intent(getBaseContext(),activity_contactus.class);
        startActivity(i);
    }

    public void aboutus(View view) {
        Intent i=new Intent(getBaseContext(),activity_aboutus.class);
        startActivity(i);
    }

    public void registration(View view) {
        Intent i=new Intent(getBaseContext(),activity_registration.class);
        startActivity(i);
    }
}