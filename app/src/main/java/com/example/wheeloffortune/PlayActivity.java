package com.example.wheeloffortune;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;

import java.lang.reflect.Array;

public class PlayActivity extends AppCompatActivity {
    Spinner spinner01;
    String mysteryPhrase;
    String phraseBlanks;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);
        spinner01 = findViewById(R.id.spinner01);
        String[] spinnerArray = {"Foods", "Places", "Fun and Games", "Song Lyrics"};
        ArrayAdapter<String> spinnerAdapter = new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line, spinnerArray);
        spinner01.setAdapter(spinnerAdapter);
    }

    public void initiatePlay(){
        String retrieve = spinner01.getSelectedItem().toString();
        if (retrieve == "Foods"){
            mysteryPhrase = "Breakfast Burrito";
            phraseBlanks = "▯r▯▯▯▯▯s▯ ▯u▯▯▯▯▯";
        }
        else if (retrieve == "Places"){
            mysteryPhrase = "Mountain View";
            phraseBlanks = "M▯▯▯▯▯▯▯ ▯i▯▯";
        }
        else if ( retrieve == "Fun and Games"){
            mysteryPhrase = "Zip Zap Zop";
        }
        else {
            mysteryPhrase = "";
        }
    }
}
