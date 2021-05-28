package com.example.kieutiendat_kt2_bai1;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class FragmentBottomAdapter extends FragmentStatePagerAdapter {
    public FragmentBottomAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:return new JavaFragment();
            case 1:return new com.example.kieutiendat_kt2_bai1.CFragment();
            case 2:return new com.example.kieutiendat_kt2_bai1.PythonFragment();
            default:return new JavaFragment();
        }
    }

    @Override
    public int getCount() {
        return 3;
    }
}
