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
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.portaldaneshjo.Activity.Omor_amozeshi_activities.BarnameHaftegi;
import com.example.portaldaneshjo.Activity.Omor_amozeshi_activities.BarnameKelasi;
import com.example.portaldaneshjo.Activity.Omor_amozeshi_activities.EterazNomre;
import com.example.portaldaneshjo.Activity.Omor_amozeshi_activities.Karname;
import com.example.portaldaneshjo.Activity.Omor_amozeshi_activities.KartEmtehan;
import com.example.portaldaneshjo.Activity.Omor_amozeshi_activities.ListDoros;
import com.example.portaldaneshjo.Activity.Omor_amozeshi_activities.ZamanBandi;
import com.example.portaldaneshjo.R;

public class OmorAmozeshi extends Fragment {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.omor_amozeshi,container,false);
        Typeface typeface_from_txt = Typeface.createFromAsset(getContext().getAssets(),"fonts/kodak.TTF");

        TextView txt_barname_haftegi = (TextView) view.findViewById(R.id.txt_barname_haftegi_id);
        TextView txt_barname_kelasi = (TextView) view.findViewById(R.id.txt_barname_kelasi_id);
        TextView txt_eteraz = (TextView) view.findViewById(R.id.txt_eteraz_id);
        TextView txt_karname = (TextView) view.findViewById(R.id.txt_karname_id);
        TextView txt_list_doros = (TextView) view.findViewById(R.id.txt_list_doros_id);
        TextView txt_zaman_bandi = (TextView) view.findViewById(R.id.txt_zaman_bandi_id);
        TextView txt_kart = (TextView) view.findViewById(R.id.txt_kart_id);
        ImageButton btn_barname_haftegi = (ImageButton) view.findViewById(R.id.btn_barname_haftegi_id);
        ImageButton btn_barname_kelasi = (ImageButton) view.findViewById(R.id.btn_barname_kelasi_id);
        ImageButton btn_eteraz = (ImageButton) view.findViewById(R.id.btn_eteraz_id);
        ImageButton btn_karname = (ImageButton) view.findViewById(R.id.btn_karname_id);
        ImageButton btn_list_doros = (ImageButton) view.findViewById(R.id.btn_list_doros_id);
        ImageButton btn_zaman_bandi = (ImageButton) view.findViewById(R.id.btn_zaman_bandi_id);
        ImageButton btn_kart = (ImageButton) view.findViewById(R.id.btn_kart_id);

        txt_barname_haftegi.setTypeface(typeface_from_txt);
        txt_barname_kelasi.setTypeface(typeface_from_txt);
        txt_eteraz.setTypeface(typeface_from_txt);
        txt_karname.setTypeface(typeface_from_txt);
        txt_list_doros.setTypeface(typeface_from_txt);
        txt_zaman_bandi.setTypeface(typeface_from_txt);
        txt_kart.setTypeface(typeface_from_txt);

        btn_barname_haftegi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), BarnameHaftegi.class));
            }
        });
        btn_barname_kelasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), BarnameKelasi.class));
            }
        });
        btn_eteraz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), EterazNomre.class));
            }
        });
        btn_karname.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), Karname.class));
            }
        });
        btn_list_doros.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), ListDoros.class));
            }
        });
        btn_zaman_bandi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), ZamanBandi.class));
            }
        });
        btn_kart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), KartEmtehan.class));
            }
        });
        return view;
    }
}
