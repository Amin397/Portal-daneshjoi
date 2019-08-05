package com.example.portaldaneshjo.Fragments.Entekhabvahed;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.portaldaneshjo.R;

public class Sabt_list extends Fragment {

    public Sabt_list() {

    }

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_sabt_list,container,false);
        return view;
    }
}
