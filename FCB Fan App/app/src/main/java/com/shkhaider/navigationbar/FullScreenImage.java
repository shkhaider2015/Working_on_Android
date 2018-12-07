package com.shkhaider.navigationbar;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class FullScreenImage extends AppCompatActivity {

    ViewPager mViewPager;
    ImageSlider mImageSlider;
    int position;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.slider);

        int position = getIntent().getIntExtra("id", 0);

        mViewPager = (ViewPager) findViewById(R.id.image_slider1);
        mImageSlider = new ImageSlider(this);

        mViewPager.setAdapter(mImageSlider);
        mViewPager.setCurrentItem(position);

    }
}
