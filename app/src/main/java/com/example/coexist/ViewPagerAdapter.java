package com.example.coexist;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class ViewPagerAdapter extends FragmentPagerAdapter {

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position)
        {
            case 0:
                return new MainFragment(); //ChildFragment1 at position 0
            case 1:
                return new PaymentFragment(); //ChildFragment2 at position 1
            case 2:
                return new DoWhatFragment(); //ChildFragment3 at position 2
            case 3: default:
                return new SummaryFragment();
        }
//        return null; //does not happen
    }

    @Override
    public int getCount() {
        return 4; //three fragments
    }
}
