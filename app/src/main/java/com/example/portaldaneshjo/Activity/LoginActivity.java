package com.example.portaldaneshjo.Activity;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.design.resources.TextAppearance;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.portaldaneshjo.R;

import org.w3c.dom.Text;

public class LoginActivity extends AppCompatActivity {

    private Button btn_login;
    private TextView txt_stu_num,txt_stu_pass,txt_portal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        txt_stu_num = (TextView) findViewById(R.id.txt_studenum_id);
        Typeface txt_num = Typeface.createFromAsset(getAssets(),"fonts/kodak.TTF");
        txt_stu_num.setTypeface(txt_num);

        txt_stu_pass = (TextView) findViewById(R.id.txt_stu_pass_id);
        Typeface txt_pass = Typeface.createFromAsset(getAssets(),"fonts/kodak.TTF");
        txt_stu_pass.setTypeface(txt_pass);

        txt_portal = (TextView) findViewById(R.id.portal_id);
        Typeface txt_portal_T = Typeface.createFromAsset(getAssets(),"fonts/kodak.TTF");
        txt_portal.setTypeface(txt_portal_T);

        btn_login = (Button) findViewById(R.id.btn_sign_in_id);
        Typeface btn_txt=Typeface.createFromAsset(getAssets(),"fonts/kodak.TTF");
        btn_login.setTypeface(btn_txt);
        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (txt_stu_num.getText() != null ){
                    if (txt_stu_pass.getText() != null){
                        Intent intent = new Intent(LoginActivity.this,MainActivity.class);
                        startActivity(intent);
                        finish();
                    }else {
                        Toast.makeText(LoginActivity.this, "لطفا رمز عبور خود را وارد کنید !", Toast.LENGTH_SHORT).show();
                    }
                }else {
                    Toast.makeText(LoginActivity.this, "لطفا شمکاره دانشجویی خود را وارد کنید !", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
