package com.example.fatboy.cissgin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.graphics.drawable.*;
import android.graphics.Color;
import android.view.View;

public class HomeScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);
        getSupportActionBar().hide();
    }
    public void onButtonClick(View v)
    {
        if(v.getId() == R.id.Bcissmun)
        {
            Intent i = new Intent(HomeScreen.this,cissmunmain.class);
            startActivity(i);
        }
        else if (v.getId() == R.id.Bginasia)
        {
            Intent i = new Intent(HomeScreen.this,ginasiamain.class);
            startActivity(i);
        }

    }
}
