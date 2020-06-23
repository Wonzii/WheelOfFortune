package com.example.wheeloffortune;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HowToPlayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_how_to_play);
    }

    public void openMainActivity(View view) {
        Intent intent = new Intent(HowToPlayActivity.this, MainActivity.class);
        startActivity(intent);
    }

    public void openPlayActivity(View view) {
        Intent intent = new Intent(HowToPlayActivity.this, PlayActivity.class);
        startActivity(intent);
    }
} 
