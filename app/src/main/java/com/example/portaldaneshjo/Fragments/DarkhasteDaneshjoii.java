package com.example.portaldaneshjo.Fragments;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.portaldaneshjo.Activity.Darkhast_daneshjoii_activities.Eshteghal;
import com.example.portaldaneshjo.Activity.Darkhast_daneshjoii_activities.Ghaza;
import com.example.portaldaneshjo.Activity.Darkhast_daneshjoii_activities.Khabgah;
import com.example.portaldaneshjo.Activity.Darkhast_daneshjoii_activities.Morakhasi;
import com.example.portaldaneshjo.Activity.Darkhast_daneshjoii_activities.Parking;
import com.example.portaldaneshjo.Activity.Darkhast_daneshjoii_activities.Vam;
import com.example.portaldaneshjo.R;

public class DarkhasteDaneshjoii extends Fragment {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.darkhaste_daneshjoii,container,false);
        Typeface typeface_from_txt = Typeface.createFromAsset(getContext().getAssets(),"fonts/IRANSans.ttf");

        TextView txt_khabgah = (TextView) view.findViewById(R.id.txt_khabgah_id);
        TextView txt_parking = (TextView) view.findViewById(R.id.txt_parking_id);
        TextView txt_ghaza = (TextView) view.findViewById(R.id.txt_ghaza_id);
        TextView txt_vam = (TextView) view.findViewById(R.id.txt_vam_id);
        TextView txt_eshteghal = (TextView) view.findViewById(R.id.txt_eshteghal_id);
        TextView txt_morakhasi = (TextView) view.findViewById(R.id.txt_morakhasi_id);
        ImageButton btn_khabgah = (ImageButton) view.findViewById(R.id.btn_khabgah_id);
        ImageButton btn_parking = (ImageButton) view.findViewById(R.id.btn_parking_id);
        ImageButton btn_ghaza = (ImageButton) view.findViewById(R.id.btn_ghaza_id);
        ImageButton btn_vam = (ImageButton) view.findViewById(R.id.btn_vam_id);
        ImageButton btn_eshteghal = (ImageButton) view.findViewById(R.id.btn_eshteghal_id);
        ImageButton btn_morakhasi = (ImageButton) view.findViewById(R.id.btn_morakhasi_id);

        txt_khabgah.setTypeface(typeface_from_txt);
        txt_parking.setTypeface(typeface_from_txt);
        txt_ghaza.setTypeface(typeface_from_txt);
        txt_vam.setTypeface(typeface_from_txt);
        txt_eshteghal.setTypeface(typeface_from_txt);
        txt_morakhasi.setTypeface(typeface_from_txt);

        btn_khabgah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), Khabgah.class));
            }
        });
        btn_parking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), Parking.class));
            }
        });
        btn_ghaza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), Ghaza.class));
            }
        });
        btn_vam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), Vam.class));
            }
        });
        btn_eshteghal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), Eshteghal.class));
            }
        });
        btn_morakhasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), Morakhasi.class));
            }
        });
        return view;
    }
}
