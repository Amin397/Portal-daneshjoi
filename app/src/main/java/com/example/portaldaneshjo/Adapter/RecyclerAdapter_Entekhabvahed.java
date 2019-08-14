package com.example.portaldaneshjo.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.example.portaldaneshjo.Model.RecyclerItem_Entekhabvahed;
import com.example.portaldaneshjo.R;
import java.util.List;

public class RecyclerAdapter_Entekhabvahed extends RecyclerView.Adapter<RecyclerAdapter_Entekhabvahed.viewHolder> {

     Context context;
     List<RecyclerItem_Entekhabvahed> model;

    public RecyclerAdapter_Entekhabvahed(Context context, List<RecyclerItem_Entekhabvahed> model) {
        this.context = context;
        this.model = model;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_recycler_entekhabvahed_simple,viewGroup , false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder viewHolder, int i) {
        RecyclerItem_Entekhabvahed rv = model.get(i);
        viewHolder.vahed.setText(String.valueOf(rv.getVahed()));
        viewHolder.name.setText(rv.getName());
    }

    @Override
    public int getItemCount() {
        return model.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        TextView name , vahed ;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            vahed = (TextView) itemView.findViewById(R.id.vahed_id);
            name = (TextView) itemView.findViewById(R.id.name_id);
        }
    }
}
