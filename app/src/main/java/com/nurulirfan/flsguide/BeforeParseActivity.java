package com.nurulirfan.flsguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by indra on 12/06/17.
 */

public class BeforeParseActivity extends AppCompatActivity {
    private Button button_getJSONObject;
    private Button button_getJSONArray;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.lihat_info);
        button_getJSONArray = (Button) findViewById(R.id.btn_lihat_info);


        button_getJSONArray.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplication(), ParseJSONinfo.class);
                startActivity(i);

            }
        });


    }
}
