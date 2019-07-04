package com.example.portaldaneshjo.Activity.Omor_amozeshi_activities;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.portaldaneshjo.Adapter.SpinnerAdapter;
import com.example.portaldaneshjo.Model.Nimsaltahsili;
import com.example.portaldaneshjo.R;

import java.util.ArrayList;

public class BarnameKelasi extends AppCompatActivity {

    Toolbar toolbar;
    private Spinner spinner;
    private SpinnerAdapter sAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barname_kelasi);

        toolbar = (Toolbar) findViewById(R.id.toolbar_barnamekelasi_id);
        spinner = (Spinner) findViewById(R.id.spn_nimsaltahsili_barnamekelasi_id);

        toolbar.setTitle("برنامه کلاسی");
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        final ArrayList<Nimsaltahsili> nimsaltahsili = new ArrayList<>();
        nimsaltahsili.add(new Nimsaltahsili("نیمسال اول 97 - 98"));
        nimsaltahsili.add(new Nimsaltahsili("نیمسال دوم 97 - 98"));
        nimsaltahsili.add(new Nimsaltahsili("نیمسال اول 98 - 99"));
        nimsaltahsili.add(new Nimsaltahsili("نیمسال دوم 98 - 99"));

        sAdapter = new SpinnerAdapter(BarnameKelasi.this,nimsaltahsili);
        spinner.setAdapter(sAdapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Snackbar snackbar = Snackbar.make(view,nimsaltahsili.get(position).getNimsal(),Snackbar.LENGTH_SHORT);
                snackbar.show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        //اسپینر برای انتخاب نیمسال تحصیلی
    }
}
