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
import android.widget.GridView;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.example.portaldaneshjo.Activity.Omor_mali_activities.Formol_shahrie;
import com.example.portaldaneshjo.Activity.Omor_mali_activities.Pardakht_electronic;
import com.example.portaldaneshjo.Activity.Omor_mali_activities.Pardakht_namovafagh;
import com.example.portaldaneshjo.Activity.Omor_mali_activities.Vaziate_mali;
import com.example.portaldaneshjo.Adapter.FragmentsGridViewAdapters.GridViewAdapter_Mali;
import com.example.portaldaneshjo.R;

public class OmorMalli extends Fragment {

    private GridView gridView;
    private String[] nameitems = {"پرداخت الکترونیک","وضعیت مالی","محاسبه شهریه","پرداخت های ناموفق"};
    private Integer[] picitems = {R.drawable.ic_pardakht_e,R.drawable.ic_vazeiate_mali,R.drawable.ic_mohasebeh_shahrieh,
            R.drawable.ic_payment_error};

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.omor_malli,container,false);
        gridView = (GridView) view.findViewById(R.id.grid_mali_id);

        gridView.setAdapter(new GridViewAdapter_Mali(getActivity(),nameitems,picitems));

        return view;
    }
}
