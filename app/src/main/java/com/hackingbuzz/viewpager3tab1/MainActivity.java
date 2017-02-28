package com.hackingbuzz.viewpager3tab1;

import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.hackingbuzz.viewpager3tab1.misc.PageAdapter;

// To remove pink line below tab buttons ...you have to change the Accent Color(default pink) to  border color background color of your selcted tab..its taking color from your Accent Color.

public class MainActivity extends AppCompatActivity {

    ViewPager viewPager;
    TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


         tabLayout = (TabLayout) findViewById(R.id.tab_layout);  // creating tab layout
        tabLayout.addTab(tabLayout.newTab().setText("First Tab"));    // adding tabs to tab layout (tabs are new object so  newTab() .. n they are getting created inside the layout so..they are connected..so you initlize object like tablayout.addTab()
        tabLayout.addTab(tabLayout.newTab().setText("Second Tab"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
        tabLayout.setTabTextColors(getResources().getColor(R.color.abc), getResources().getColor(R.color.white));


          viewPager = (ViewPager) findViewById(R.id.pager);
         PageAdapter adapter = new PageAdapter
                (getSupportFragmentManager(), tabLayout.getTabCount());
        viewPager.setAdapter(adapter);



        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));   // attacing TabLayoutOnPageChangeLister to view pager OnPagechangeLister..so that they both can work together
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
                tabLayout.setTabTextColors(getResources().getColor(R.color.abc), getResources().getColor(R.color.white));

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
