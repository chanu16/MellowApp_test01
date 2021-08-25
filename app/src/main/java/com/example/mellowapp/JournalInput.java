package com.example.mellowapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class JournalInput extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_journal_input);
    }

    public void goToJournalEntry(View view) {
        Intent intent = new Intent(getApplicationContext(), JournalEntryCheck.class);
        startActivity(intent);
    }
}