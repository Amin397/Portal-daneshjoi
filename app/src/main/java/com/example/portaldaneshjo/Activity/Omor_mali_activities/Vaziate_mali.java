package com.example.portaldaneshjo.Activity.Omor_mali_activities;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.portaldaneshjo.Adapter.SpinnerAdapter;
import com.example.portaldaneshjo.Model.Nimsaltahsili;
import com.example.portaldaneshjo.R;

import java.util.ArrayList;

public class Vaziate_mali extends AppCompatActivity {

     Toolbar toolbar;
     Spinner spinner;
     SpinnerAdapter sAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vaziate_mali);

        toolbar = (Toolbar) findViewById(R.id.toolbar_vaziat_id);
        spinner = (Spinner) findViewById(R.id.spn_nimsaltahsili_vaziat_id);

        toolbar.setTitle("وضعیت مالی");
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        final ArrayList<Nimsaltahsili> nimsaltahsili = new ArrayList<>();
         nimsaltahsili.add(new Nimsaltahsili("نیمسال اول 97 - 98"));
         nimsaltahsili.add(new Nimsaltahsili("نیمسال دوم 97 - 98"));
         nimsaltahsili.add(new Nimsaltahsili("نیمسال اول 98 - 99"));
         nimsaltahsili.add(new Nimsaltahsili("نیمسال دوم 98 - 99"));

         sAdapter = new SpinnerAdapter(Vaziate_mali.this,nimsaltahsili);
         spinner.setAdapter(sAdapter);

         spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
             @Override
             public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                 Toast.makeText(Vaziate_mali.this,nimsaltahsili.get(position).getNimsal(), Toast.LENGTH_SHORT).show();
             }

             @Override
             public void onNothingSelected(AdapterView<?> parent) {

             }
         });
         //اسپینر برای انتخاب نیمسال تحصیلی
    }
}
