package com.example.portaldaneshjo.Activity.Other_Activitys;

import android.content.Context;
import android.content.SharedPreferences;
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
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.example.portaldaneshjo.R;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.Hashtable;

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
                if (Etxt_newpass.getText().toString().equals(Etxt_acceptnewpass.getText().toString()) && Etxt_nowpass.getText().length()>=0){
                    PostChangePassword();
                    Etxt_nowpass.clearComposingText();
                    Etxt_newpass.clearComposingText();
                    Etxt_acceptnewpass.clearComposingText();

                }else {
                    Toast.makeText(Changepassword.this, "0", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private void PostChangePassword() {
        RequestQueue queue = Volley.newRequestQueue(Changepassword.this);
        String URL = "http://se7enf98.ddns.net/webservice/p/ChangeStudentPassword.php";
        SharedPreferences saver = this.getSharedPreferences("login" , Context.MODE_PRIVATE);
        String studentnumber = saver.getString("StudentCode" , null);
        Hashtable<String , String> params = new Hashtable<>();
        params.put("StudentCode" , studentnumber);
        params.put("OldPassword" , Etxt_nowpass.getText().toString());
        params.put("NewPassword" , Etxt_newpass.getText().toString());

        JSONObject object = new JSONObject(params);

        JsonObjectRequest request = new JsonObjectRequest(Request.Method.POST, URL, object, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                Toast.makeText(Changepassword.this, response.toString(), Toast.LENGTH_SHORT).show();
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(Changepassword.this, "رمز عبور فعلی را اشتباه وارد کردید", Toast.LENGTH_SHORT).show();
            }
        });

        queue.add(request);
    }
}
