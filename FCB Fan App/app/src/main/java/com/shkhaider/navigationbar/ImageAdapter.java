package com.shkhaider.navigationbar;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.BaseAdapter;
import android.widget.ImageView;

public class ImageAdapter extends BaseAdapter
{
   // public int[] images_id;

    Context ctx;
    ImageView imgV;

    ImageAdapter(Context ctx)
    {
        this.ctx = ctx;
    }

    @Override
    public int getCount() {
        return MainActivity.images_id.length;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public Object getItem(int position) {
        return MainActivity.images_id[position];
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        View gridView = convertView;


        if(gridView == null)
        {
            LayoutInflater inflater = (LayoutInflater) ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            gridView = inflater.inflate(R.layout.fragment_wallpaper,  null);
        }

        ImageView iView = (ImageView) gridView.findViewById(R.id.myImage);
        iView.setImageResource(MainActivity.images_id[position]);


        return gridView;
    }




}
