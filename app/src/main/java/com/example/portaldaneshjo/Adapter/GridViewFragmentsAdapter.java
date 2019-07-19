package com.example.portaldaneshjo.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.portaldaneshjo.R;

public class GridViewFragmentsAdapter extends BaseAdapter {

    private Context context;
    private final Integer[] picitems;
    private final String[] nameitems;

    public GridViewFragmentsAdapter(Context context, Integer[] picitems, String[] nameitems) {
        this.context = context;
        this.picitems = picitems;
        this.nameitems = nameitems;
    }

    @Override
    public int getCount() {
        return nameitems.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View grid;
        LayoutInflater layoutInflater =(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if (convertView == null){
            grid = new View(context);
            grid =layoutInflater.inflate(R.layout.item_view_fragments,null);
            ImageButton img = (ImageButton) grid.findViewById(R.id.btn_image_id);
            TextView txt = (TextView) grid.findViewById(R.id.txt_content_id);
            img.setImageResource(picitems[position]);
            txt.setText(nameitems[position]);
        }else {
            grid = (View) convertView;
        }
        return grid;
    }
}
