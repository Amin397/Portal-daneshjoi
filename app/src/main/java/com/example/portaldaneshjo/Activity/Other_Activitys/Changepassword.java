package com.example.portaldaneshjo.Activity.Other_Activitys;

import android.support.design.widget.Snackbar;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatButton;
import android.support.v7.widget.AppCompatEditText;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;

import com.example.portaldaneshjo.R;

public class Changepassword extends AppCompatActivity {

    private Toolbar toolbar;
    private AppCompatEditText Etxt_nowpass, Etxt_newpass, Etxt_acceptnewpass;
    private AppCompatButton btn_changepass;
    private TextInputLayout acceptpass_input_layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_changepassword);

        toolbar = (Toolbar) findViewById(R.id.toolbar_changepass_id);
        Etxt_nowpass = (AppCompatEditText) findViewById(R.id.nowpass_id);
        Etxt_newpass = (AppCompatEditText) findViewById(R.id.newpass_id);
        Etxt_acceptnewpass = (AppCompatEditText) findViewById(R.id.acceptnewpass_id);
        btn_changepass = (AppCompatButton) findViewById(R.id.btn_changepass_id);
        acceptpass_input_layout = (TextInputLayout) findViewById(R.id.txtinput_acceptnewpass_id);

        toolbar.setTitle("تغییر رمز عبور");
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        btn_changepass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((Etxt_acceptnewpass.getText()) == (Etxt_newpass.getText())){
                    Snackbar snackbar = Snackbar.make(v,"رمز عبور با موفقیت تغییر کرد !",Snackbar.LENGTH_SHORT);
                    snackbar.show();

                    Etxt_newpass.setText(null);
                    Etxt_acceptnewpass.setText(null);
                }else {
                    Snackbar snackbar = Snackbar.make(v,"تایید رمز عبور صحیح نیست !",Snackbar.LENGTH_SHORT);
                    snackbar.show();

                    Etxt_acceptnewpass.setText(null);
                    Etxt_newpass.setText(null);
                }
            }
        });
    }
}
