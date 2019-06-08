package com.example.portaldaneshjo.Fragments;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.example.portaldaneshjo.R;

public class OmorMalli extends Fragment {
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.omor_malli,container,false);
        Typeface typeface_from_txt = Typeface.createFromAsset(getContext().getAssets(),"fonts/kodak.TTF");

        TextView txt_pardakht_e = (TextView) view.findViewById(R.id.txt_pardakht_id);
        TextView txt_vaziat = (TextView) view.findViewById(R.id.txt_vaziat_id);
        TextView txt_formol = (TextView) view.findViewById(R.id.txt_formol_id);
        TextView txt_pardakh_namovafagh = (TextView) view.findViewById(R.id.txt_pardakht_namovafagh_id);
        ImageButton btn_pardakht_e = (ImageButton) view.findViewById(R.id.btn_pardakht_id);
        ImageButton btn_vaziat = (ImageButton) view.findViewById(R.id.btn_vaziat_id);
        ImageButton btn_formol = (ImageButton) view.findViewById(R.id.btn_formol_id);
        ImageButton btn_pardakht_namovafagh = (ImageButton) view.findViewById(R.id.btn_pardakht_namovafagh_id);

        txt_pardakht_e.setTypeface(typeface_from_txt);
        txt_vaziat.setTypeface(typeface_from_txt);
        txt_formol.setTypeface(typeface_from_txt);
        txt_pardakh_namovafagh.setTypeface(typeface_from_txt);

        btn_pardakht_e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "پرداخت الکترونیک", Toast.LENGTH_SHORT).show();
            }
        });
        btn_vaziat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "وضعیت مالی", Toast.LENGTH_SHORT).show();
            }
        });
        btn_formol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "فرمول محاسبه ی شهریه", Toast.LENGTH_SHORT).show();
            }
        });
        btn_pardakht_namovafagh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "پرداخت های نا موفق", Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }
}
