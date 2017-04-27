package com.example.sunmz.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sunmz on 26/4/2560.
 */

public class ListAdapter extends BaseAdapter {
    private List<cloth> clothList = new ArrayList<>();
    private Context context ;

    ListAdapter(Context context,List<cloth> clothList){
        this.context = context ;
        this.clothList = clothList ;
    }
    @Override
    public int getCount() {
        if (clothList ==null)
            return 0;
        return clothList.size();
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
        View view ;
        LayoutInflater indlater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        view = indlater.inflate(R.layout.list_item,parent,false);

        ImageView imageView = (ImageView) view.findViewById(R.id.image);
        TextView tvBreed = (TextView) view.findViewById(R.id.tvbreed);
        TextView tvDescription = (TextView) view.findViewById(R.id.tvDescription);

        imageView.setImageResource(clothList.get(position).getResId());
        tvBreed.setText(clothList.get(position).getBreed());
        tvDescription.setText(clothList.get(position).getDrescription());

        return view;
    }
}
