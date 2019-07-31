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
import android.view.animation.Animation;
import android.widget.GridView;
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
import com.example.portaldaneshjo.Adapter.FragmentsGridViewAdapters.GridViewAdapter_Amozeshi;
import com.example.portaldaneshjo.Adapter.FragmentsGridViewAdapters.GridViewAdapter_Mali;
import com.example.portaldaneshjo.R;
import com.labo.kaji.fragmentanimations.CubeAnimation;
import com.labo.kaji.fragmentanimations.FlipAnimation;

public class OmorAmozeshi extends Fragment {

    private GridView gridView;
    private String[] nameitems = {"برنامه هفتگی","برنامه کلاسی","اعتراض نمرات","کارنامه","لیست دروس",
            "زمان بندی ثبت نام","کارت امتحان"};
    private Integer[] picitems = {R.drawable.ic_barname_kelasi_24dp,R.drawable.ic_barname_haftegi_24dp,R.drawable.ic_eteraz_24dp
            ,R.drawable.ic_karnameh,R.drawable.ic_list_doros_24dp,R.drawable.ic_zaman_bandi_24dp
            ,R.drawable.ic_examcard};


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.omor_amozeshi,container,false);
        gridView = (GridView) view.findViewById(R.id.grid_amozeshi_id);

        gridView.setAdapter(new GridViewAdapter_Amozeshi(getActivity(),nameitems,picitems));

        return view;
    }

    @Override
    public Animation onCreateAnimation(int transit, boolean enter, int nextAnim) {
        return FlipAnimation.create(FlipAnimation.RIGHT, enter, 2);
    }
}
