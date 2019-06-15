package com.example.portaldaneshjo.Activity.Omor_mali_activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.example.portaldaneshjo.R;

public class Pardakht_electronic extends AppCompatActivity {

    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pardakht_electronic);

        toolbar =(Toolbar) findViewById(R.id.toolbar_pardakht_e_id);

        toolbar.setTitle("پرداخت الکترونیک");
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }
}
