package com.nurulirfan.flsguide;

import android.support.annotation.NonNull;
import android.support.design.internal.BottomNavigationMenu;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.ListFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Toolbar toolbar;
    private ImageView toolbarTitle;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.nav_home:
                    HomeFragment homeFragment = new HomeFragment();
                    getSupportFragmentManager().beginTransaction().replace(R.id.main_frame, homeFragment).commit();
                    return true;

                case R.id.nav_agenda:
                    AgendaFragment agendaFragment = new AgendaFragment();
                    getSupportFragmentManager().beginTransaction().replace(R.id.main_frame, agendaFragment).commit();
                    return true;

                case R.id.nav_info:
//                    InfoFragment infoFragment = new InfoFragment();
                    ListInfo li = new ListInfo();
                    FragmentManager fm = getSupportFragmentManager();

                    fm.beginTransaction().replace(R.id.main_frame, li).commit();
                    return true;

                case R.id.nav_faq:
                    FaqFragment faqFragment = new FaqFragment();
                    getSupportFragmentManager().beginTransaction().replace(R.id.main_frame, faqFragment).commit();
                    return true;

                case R.id.nav_about:
                    AboutFragment aboutFragment = new AboutFragment();
                    getSupportFragmentManager().beginTransaction().replace(R.id.main_frame, aboutFragment).commit();
                    return true;
            }
            return false;
        }

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        HomeFragment homeFragment = new HomeFragment();
        getSupportFragmentManager().beginTransaction().replace(R.id.main_frame, homeFragment).commit();

        //bind view
        toolbar = (Toolbar) findViewById(R.id.toolbar_main);
        toolbarTitle = (ImageView) findViewById(R.id.toolbar_title);

        //set toolbar
        setSupportActionBar(toolbar);

        //menghilangkan titlebar bawaan
        if (toolbar != null) {
            getSupportActionBar().setDisplayShowTitleEnabled(false);
        }

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.bottom_nav);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);



    }
}
