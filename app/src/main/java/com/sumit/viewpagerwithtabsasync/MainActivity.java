package com.sumit.viewpagerwithtabsasync;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class MainActivity extends AppCompatActivity {
   private TabLayout  tabLayout;
   private ViewPager2 viewPager2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        intitView();
        setPagerAdapter();
    }

    private void setPagerAdapter() {
        PagerAdapter pagerAdapter = new PagerAdapter(getSupportFragmentManager() , getLifecycle());
        viewPager2.setAdapter(pagerAdapter);
        new TabLayoutMediator(tabLayout,  viewPager2, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
             if(position==0){
                 tab.setText("Name");
             }else if(position==1){
                 tab.setText("Place");
             }else if(position==2){
                 tab.setText("Tourism");
                }
            }
        }).attach();
    }

    private void intitView() {
        tabLayout = findViewById(R.id.tabLayout);
        viewPager2 = findViewById(R.id.viewPager);
    }
}