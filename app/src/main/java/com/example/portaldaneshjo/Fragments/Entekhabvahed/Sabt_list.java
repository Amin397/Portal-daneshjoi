package com.example.portaldaneshjo.Fragments.Entekhabvahed;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import com.example.portaldaneshjo.Adapter.RecyclerAdapter_Entekhabvahed;
import com.example.portaldaneshjo.Model.RecyclerItem_Entekhabvahed;
import com.example.portaldaneshjo.R;

import java.util.ArrayList;
import java.util.List;

public class Sabt_list extends Fragment {

    private RecyclerView recyclerView;
    private ArrayList<RecyclerItem_Entekhabvahed> items = new ArrayList<>();
    private RecyclerAdapter_Entekhabvahed adapter;

    public Sabt_list() {

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_sabt_list,container,false);

        recyclerView = (RecyclerView) view.findViewById(R.id.recycler_entekhabvahed_id);
        adapter = new RecyclerAdapter_Entekhabvahed(getContext(),items);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(adapter);
        items.add(new RecyclerItem_Entekhabvahed("",3));
        items.add(new RecyclerItem_Entekhabvahed("ali",3));
        items.add(new RecyclerItem_Entekhabvahed("ali",3));
        items.add(new RecyclerItem_Entekhabvahed("ali",3));
        items.add(new RecyclerItem_Entekhabvahed("ali",3));
        items.add(new RecyclerItem_Entekhabvahed("ali",3));
        return view;
    }

    public void showdata(){
    }
}
