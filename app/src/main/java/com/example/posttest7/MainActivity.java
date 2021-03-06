package com.example.posttest7;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import android.os.Bundle;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Adapter adapter = new Adapter(getSupportFragmentManager());
        ViewPager viewPager = findViewById(R.id.theviewpager);
        viewPager.setAdapter(adapter);
        TabLayout tabs = findViewById(R.id.thetab);
        tabs.setupWithViewPager(viewPager);
    }
}