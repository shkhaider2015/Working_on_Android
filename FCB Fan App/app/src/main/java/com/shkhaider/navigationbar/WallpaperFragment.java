package com.shkhaider.navigationbar;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;

import static android.content.ContentValues.TAG;

public class WallpaperFragment extends Fragment {
    @Nullable
    GridView gridView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {


        View v = inflater.inflate(R.layout.fragment_wallpaper, container, false);

        gridView = (GridView) container.findViewById(R.id.myGridView1);

        ImageAdapter imageAdapter = new ImageAdapter(getActivity());
        gridView.setAdapter(imageAdapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {

                Intent i = new Intent(getActivity(), FullScreenImage.class);
                i.putExtra("id", position);
                startActivity(i);

            }
        });

        return v;


    }

    @Override
    public void onDestroy() {
        Log.i(TAG, "onDestroy: WallpapersFragment Has Been Destroyed ");
        super.onDestroy();
    }
}
