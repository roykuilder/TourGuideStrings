package com.example.android.tourguidestrings;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // The context is set here so it can be passed to MyFragmentPagerAdapter.
        Context context = getApplicationContext();

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Create a ViewPager Object and locate the View/
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewPager);

        // Create a custom adapter to fill the ViewPager
        MyFragmentPagerAdapter adapter = new MyFragmentPagerAdapter(getSupportFragmentManager(), context);

        // Set the adapter on the ViewPager
        viewPager.setAdapter(adapter);

        // Find the TabLayout and set the TabLayout tot the ViePager
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tab_layout);
        tabLayout.setupWithViewPager(viewPager);
    }
}
