package com.serviq.prueba;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.lang.reflect.Array;

public class MainActivity extends AppCompatActivity {
    CustomPagerAdapter mCustomPagerAdapter;
    ViewPager mViewPager;
    int[] mResources;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int[] mResources = {
                R.drawable.hamburguesa,
                R.drawable.hotdog,
                R.drawable.pizza
        };

        mCustomPagerAdapter = new CustomPagerAdapter(this);
        mCustomPagerAdapter.setmResources(mResources);

        mViewPager = (ViewPager) findViewById(R.id.pager);
        mViewPager.setAdapter(mCustomPagerAdapter);
    }
}
