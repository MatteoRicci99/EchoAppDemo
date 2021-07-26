package com.example.echoapp.home;


import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import com.google.android.material.tabs.TabLayout;
import org.jetbrains.annotations.NotNull;

public class ViewPagerAdapter extends FragmentPagerAdapter {


    private String title[] = new String[] {"LUCE", "GAS", "AUTO"};

    public ViewPagerAdapter(@NonNull @NotNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @NotNull
    @Override
    public Fragment getItem(int position) {

        HomeFragment homeFragment = new HomeFragment();
        position = position + 1;
        Bundle bundle = new Bundle();
        bundle.putString("message", "Fragment :"+position);
        homeFragment.setArguments(bundle);
        return homeFragment;
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @org.jetbrains.annotations.Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return title[position];
    }
}
