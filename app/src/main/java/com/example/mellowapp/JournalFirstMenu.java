package com.example.mellowapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class JournalFirstMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_journal_first_menu);
    }

    public void goToJournalInput(View view) {
        Intent intent = new Intent(getApplicationContext(), JournalInput.class);
        startActivity(intent);
    }
}