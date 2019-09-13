package com.example.portaldaneshjo.Activity.Other_Activitys;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatButton;
import android.support.v7.widget.AppCompatEditText;
import android.support.v7.widget.Toolbar;
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

import java.lang.ref.ReferenceQueue;
import java.util.Hashtable;

public class Sabte_mobile extends AppCompatActivity {

    Toolbar toolbar;
    AppCompatEditText jadid_mobile;
    AppCompatButton submit_mobile;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sabte_mobile);

        toolbar = (Toolbar) findViewById(R.id.toolbar_sabtemobile_id);
        jadid_mobile = (AppCompatEditText) findViewById(R.id.mobile_jadid_id);
        submit_mobile = (AppCompatButton) findViewById(R.id.btn_submitmobile_id);

        SharedPreferences saver = this.getSharedPreferences("login" , Context.MODE_PRIVATE);
        final String nationalcode = saver.getString("NationalCode" , null);

        toolbar.setTitle("تغییر شماره موبایل");
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        submit_mobile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mobileSubmitPost(nationalcode,v);
            }
        });
    }

    private void mobileSubmitPost(String national , final View v) {
        final RequestQueue queue = Volley.newRequestQueue(Sabte_mobile.this);
        String URL = "http://se7enf98.ddns.net/webservice/p/ChangeMobile.php";

        final ProgressDialog dialog ;
        dialog = new ProgressDialog(Sabte_mobile.this);
        dialog.setMessage("لطفا صبر کنید ..");
        dialog.setCancelable(false);
        dialog.show();


        Hashtable<String , String> params = new Hashtable<>();
        params.put("NationalCode" , national);
        params.put("PhoneNumber" , jadid_mobile.getText().toString());

        JSONObject object = new JSONObject(params);

        final JsonObjectRequest request = new JsonObjectRequest(Request.Method.POST, URL, object, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                try {
                    String result = response.getString("status");

                    dialog.dismiss();

                    if (result.equals("successful")){
                        Snackbar snackbar = Snackbar.make(v, jadid_mobile.getText() + " با موفقیت ثبت شد !",Snackbar.LENGTH_SHORT);
                        snackbar.show();
                    }else {
                        Snackbar snackbar = Snackbar.make(v,"خطا !!",Snackbar.LENGTH_SHORT);
                        snackbar.show();
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                dialog.dismiss();
                Toast.makeText(Sabte_mobile.this, error.toString(), Toast.LENGTH_SHORT).show();
            }
        });
        queue.add(request);
    }
}
