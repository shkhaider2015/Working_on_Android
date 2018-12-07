package com.shkhaider.switchbetweenactivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

public class Activity3 extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity3);
    }

    public void onClickFunction(View view)
    {
        Intent intent = new Intent(this, Activity2.class);
        finish();
    }
}
