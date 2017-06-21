package com.example.fatboy.cissgin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.graphics.drawable.*;
import android.graphics.Color;

public class HomeScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);
        getSupportActionBar().hide();
    }
}
