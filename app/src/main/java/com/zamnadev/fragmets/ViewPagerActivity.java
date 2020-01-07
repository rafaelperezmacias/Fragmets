package com.zamnadev.fragmets;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.zamnadev.fragmets.Fragmetns.BodyFragment;
import com.zamnadev.fragmets.Fragmetns.EjemploFragments;
import com.zamnadev.fragmets.MenuViewPager.AdaptadorMenu;

public class ViewPagerActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager);

        tabLayout = findViewById(R.id.tabLayout);
        viewPager = findViewById(R.id.viewpager);
        AdaptadorMenu adaptadorMenu = new AdaptadorMenu(getSupportFragmentManager());

        adaptadorMenu.addFragments(new BodyFragment(),"Primer");
        adaptadorMenu.addFragments(new EjemploFragments(),"Segundo");
        adaptadorMenu.addFragments(new BodyFragment(),"Tercero");

        viewPager.setAdapter(adaptadorMenu);
        tabLayout.setupWithViewPager(viewPager);

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }
}
