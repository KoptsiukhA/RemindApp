package bel.kaistra.remindapp.adaters;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import bel.kaistra.remindapp.fragments.ExampleFragment;

public class TabPagerFragmentAdapter extends FragmentPagerAdapter{

    private String[] tabs;

    public TabPagerFragmentAdapter(FragmentManager fm) {
        super(fm);

        tabs = new String[] {
                "Tab 1",
                "Notifications",
                "Tab 2"
        };
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabs[position];
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return ExampleFragment.getInstance();
            case 1:
                return ExampleFragment.getInstance();
            case 2:
                return ExampleFragment.getInstance();

        }
        return null;
    }

    @Override
    public int getCount() {
        return tabs.length;
    }
}