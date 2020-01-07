package com.zamnadev.fragmets.MenuViewPager;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class AdaptadorMenu extends FragmentPagerAdapter {

    private List<Fragment> fragmentList;
    private List<String> strings;

    public AdaptadorMenu(FragmentManager fm) {
        super(fm);
        fragmentList = new ArrayList<>();
        strings = new ArrayList<>();
    }

    @Override
    public Fragment getItem(int position) {
        return fragmentList.get(position);
    }

    @Override
    public int getCount() {
        return fragmentList.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return strings.get(position);
    }

    public void addFragments(Fragment fragment,String titulo)
    {
        fragmentList.add(fragment);
        strings.add(titulo);
    }
}
