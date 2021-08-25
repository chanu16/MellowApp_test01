package com.example.mellowapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void goToDoctor(View view) {
        Intent intent = new Intent(getApplicationContext(), DoctorListActivity.class);
        startActivity(intent);
    }

    public void goToRe(View view) {
        Intent intent = new Intent(getApplicationContext(), RecommendationMain.class);
        startActivity(intent);
    }

    public void goToJournalFirst(View view) {
        Intent intent = new Intent(getApplicationContext(), JournalFirstMenu.class);
        startActivity(intent);
    }
}