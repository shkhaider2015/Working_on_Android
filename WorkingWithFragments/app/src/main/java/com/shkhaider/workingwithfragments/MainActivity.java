package com.shkhaider.workingwithfragments;

import android.app.Activity;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{



    private FragmentTransaction Transaction;

    public TextView textView1, textView2, textView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //object for transaction between fragments


        textView1 = findViewById(R.id.text1);
        textView2 = findViewById(R.id.text2);
        textView3 = findViewById(R.id.text3);

        textView1.setOnClickListener(this);
        textView2.setOnClickListener(this);
        textView3.setOnClickListener(this);




        if(savedInstanceState == null)
        {
            fragmentTransaction(new Fragment1());
        }



    }

    @Override
    public void onClick(View v)
    {
        switch (v.getId())
        {
            case R.id.text1:
                /* Transaction = getSupportFragmentManager().beginTransaction();
                Transaction.replace(R.id.fragment_container, new Fragment1());
                Transaction.addToBackStack(null);
                Transaction.commit(); */
                fragmentTransaction(new Fragment1());
                break;
            case R.id.text2:
                fragmentTransaction(new Fragment2());
                break;
            case R.id.text3:
                fragmentTransaction(new Fragment3());
                break;
        }

    }

    private void fragmentTransaction(Fragment fragment)
    {
        Transaction = getSupportFragmentManager().beginTransaction();
        Transaction.replace(R.id.fragment_container, fragment);
        Transaction.addToBackStack(null);
        Transaction.commit();
    }


}
