package com.example.portaldaneshjo.Activity.Other_Activitys;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatButton;
import android.support.v7.widget.AppCompatEditText;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.example.portaldaneshjo.R;

public class Sabte_mobile extends AppCompatActivity {

    Toolbar toolbar;
    AppCompatEditText feli_mobile , jadid_mobile;
    AppCompatButton submit_mobile;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sabte_mobile);

        toolbar = (Toolbar) findViewById(R.id.toolbar_sabtemobile_id);
        feli_mobile = (AppCompatEditText) findViewById(R.id.mobile_feli_id);
        jadid_mobile = (AppCompatEditText) findViewById(R.id.mobile_jadid_id);
        submit_mobile = (AppCompatButton) findViewById(R.id.btn_submitmobile_id);

        toolbar.setTitle("تغییر شماره موبایل");
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        submit_mobile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar snackbar = Snackbar.make(v,"Submit " + jadid_mobile.getText(),Snackbar.LENGTH_SHORT);
                snackbar.show();
            }
        });
    }
}
