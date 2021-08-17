package com.dragosholban.androidfacedetection;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class signup_page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup_page);
    }

    public void Register(View view) {
        startActivity(new Intent(getApplicationContext(),Login_page.class));

    }
}