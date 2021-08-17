package com.dragosholban.androidfacedetection;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Login_page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);
    }

    public void btn_camera_preview(View view) {
        startActivity(new Intent(getApplicationContext(),MainActivity.class));

    }

    public void Register_form(View view) {
        startActivity(new Intent(getApplicationContext(),signup_page.class));
    }
}