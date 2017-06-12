package com.nurulirfan.flsguide;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
/**
 * Created by indra on 12/06/17.
 */

public class ParseJSONinfo extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_json_info);

        FragmentManager fm = getSupportFragmentManager();
        Fragment fragment = fm.findFragmentById(R.id.fragmentContainer);

        if (fragment == null) {
            fragment = new ListInfo();

            fm.beginTransaction()
                    .add(R.id.fragmentContainer, fragment)
                    .commit();


        }


    }
}
