package com.example.portaldaneshjo.Activity.Omor_mali_activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.example.portaldaneshjo.R;

public class Vaziate_mali extends AppCompatActivity {

    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vaziate_mali);

        toolbar = (Toolbar) findViewById(R.id.toolbar_vaziat_id);

        toolbar.setTitle("وضعیت مالی");
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
