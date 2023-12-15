package com.example.firebasecloudstorage.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.firebasecloudstorage.R;
import com.example.firebasecloudstorage.model.ImageClass;

import java.util.ArrayList;

public class MyAdapter extends BaseAdapter {

    private ArrayList<ImageClass> dataList;
    private Context context;
    LayoutInflater layoutInflater;

    public MyAdapter(ArrayList<ImageClass> dataList, Context context) {
        this.dataList = dataList;
        this.context = context;
    }


    @Override
    public int getCount() {
        return dataList.size();
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
        if (layoutInflater == null){
            layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }
        if (convertView == null){
            convertView = layoutInflater.inflate(R.layout.grid_item, null);
        }
        ImageView gridImage = convertView.findViewById(R.id.gridImage);
        TextView gridCaption = convertView.findViewById(R.id.gridCaption);
        Glide.with(context).load(dataList.get(position).getImageURL()).into(gridImage);
        gridCaption.setText(dataList.get(position).getCaption());
        return convertView;
    }
}