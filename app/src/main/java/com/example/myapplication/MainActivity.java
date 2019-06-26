package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        system.out.println("Hello Caca");


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
