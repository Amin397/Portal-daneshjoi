package com.example.portaldaneshjo.Activity.Other_Activitys;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.FrameLayout;
import android.widget.Spinner;

import com.example.portaldaneshjo.Fragments.Entekhabvahed.Sabt_list;
import com.example.portaldaneshjo.Fragments.Entekhabvahed.Sabt_moshakhase;
import com.example.portaldaneshjo.Fragments.Entekhabvahed.Moshahede_entekhabvahed;
import com.example.portaldaneshjo.R;

public class Entekhab_vahed extends AppCompatActivity {

    private Spinner spinner;
    private FrameLayout frameLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entekhab_vahed);

        spinner = (Spinner) findViewById(R.id.spn_ravesh_entekhabvahed_id);
        frameLayout = (FrameLayout) findViewById(R.id.frmcontainer_id);

        setSpinner();
        setClickListenerOfSpinner();
    }

    public void setSpinner(){
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(getApplicationContext(),R.array.ravesh_array,
                android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

    }

    public void setClickListenerOfSpinner(){
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:{
                        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                        transaction.replace(R.id.frmcontainer_id,new Sabt_list());
                        transaction.commit();
                        break;
                    }
                    case 1:{
                        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                        transaction.replace(R.id.frmcontainer_id,new Sabt_moshakhase());
                        transaction.commit();
                        break;
                    }
                    case 2:{
                        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                        transaction.replace(R.id.frmcontainer_id,new Moshahede_entekhabvahed());
                        transaction.commit();
                        break;
                    }
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}
