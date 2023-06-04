package com.example.pl_learn;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class PlCardAdapter extends BaseAdapter {

    Context context;
    PL[] pls;
    LayoutInflater inflater;

    public PlCardAdapter(Context context, PL[] pls){
        this.context = context;
        this.pls = pls;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return pls.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = inflater.inflate(R.layout.pl_card, null);
        TextView text = (TextView) convertView.findViewById(R.id.pl_card_name);
        ImageView img = (ImageView) convertView.findViewById(R.id.pl_card_image);
        text.setText(pls[position].getName());
        img.setImageResource(R.drawable.ic_launcher_background);
        //img.setImageDrawable(images[position]);
        return convertView;
    }
}
