package com.example.mellowapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WelcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

    }
            public void secondWindow(View view) {
                Intent intent = new Intent(getApplicationContext(), SecondWelcomeActivity.class);
                startActivity(intent);
            }

}