package com.shkhaider.switchbetweenactivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2);

    }

    public void onClickFunction(View view)
    {
        Intent intent = new Intent(this, Activity3.class);
        startActivity(intent);
        finish();
    }
}
