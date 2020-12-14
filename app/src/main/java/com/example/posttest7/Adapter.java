package com.example.posttest7;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.posttest7.fragment.math;
import com.example.posttest7.fragment.profile;
import com.example.posttest7.fragment.social;

public class Adapter extends FragmentPagerAdapter {
    public Adapter(FragmentManager X){
        super(X);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                profile ini_profile = new profile();
                return ini_profile;
            case 1:
                math ini_math = new math();
                return ini_math;
            case 2:
                social ini_social = new social();
                return ini_social;
        }
        return null;
    }

    @Override
    public int getCount() {
        return 3;
    }

    @NonNull
    @Override
    public CharSequence getPageTitle(int position){
        switch (position){
            case 0:
                return "PROFILE";
            case 1:
                return "MATH";
            case 2:
                return "SOCIAL";
        }
        return null;
    }
}
