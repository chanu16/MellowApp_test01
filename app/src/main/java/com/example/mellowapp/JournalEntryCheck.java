package com.example.mellowapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class JournalEntryCheck extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_journal_entry_check);
    }

    public void goToJournalList(View view) {
        Intent intent = new Intent(getApplicationContext(), JournalEntryList.class);
        startActivity(intent);
    }
}