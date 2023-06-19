package com.example.fragmenttry;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.os.Bundle;


public class HassanNooraniMainActivity extends AppCompatActivity {

    String[] clabels;
    String[] dlabels;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Resources res = getResources();
        clabels = res.getStringArray(R.array.concepts);
        dlabels = res.getStringArray(R.array.definition);


    }
}