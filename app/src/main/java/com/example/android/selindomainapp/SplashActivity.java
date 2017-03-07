package com.example.android.selindomainapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Lenovo on 2/7/2017.
 */

public class SplashActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        //set timer
        new android.os.Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i =new Intent(SplashActivity.this,MainActivity.class);
                startActivity(i);
                finish();
            }

        },1500); //waktu dlm milisecond

    }
}

