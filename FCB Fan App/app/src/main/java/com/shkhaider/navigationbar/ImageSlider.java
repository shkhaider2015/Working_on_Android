package com.shkhaider.navigationbar;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class ImageSlider extends PagerAdapter {

    private Context context;
    public LayoutInflater layoutInflater;
    //int position;
    //ImageAdapter imageAdapter;
    //int [] images_id;

    public ImageSlider(Context context)
    {
        this.context = context;
        //this.position = position;
         //imageAdapter = new ImageAdapter(context);
         //images_id = imageAdapter.images_id;
    }


    @Override
    public int getCount() {
        return MainActivity.images_id.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return view == (LinearLayout) o;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {

        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.full_screen_wallpaper,container, false);

        ImageView imageView = (ImageView) view.findViewById(R.id.imgDisplay);
        imageView.setImageResource(MainActivity.images_id[position]);

        container.addView(view);


        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((LinearLayout)object);
    }
}
