package com.nurulirfan.flsguide;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

public class InfoFragment extends Fragment {

    public InfoFragment() {
        // Required empty public constructor
    }

    private CardView.OnClickListener cardViewOnClickListener =
            new CardView.OnClickListener(){
                @Override
                public void onClick(View view) {
                    switch (view.getId()){
                        case 1:

                            break;
                    }
                }
            };

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View inputFragmentView = inflater.inflate(R.layout.fragment_info, container, false);

        ListView lv = (ListView) inputFragmentView.findViewById(R.id.list_notif);


//        CardView greeting = (CardView) inputFragmentView.findViewById(R.id.cv_info);
//        greeting.setOnClickListener(
//                new CardView.OnClickListener(){
//                    @Override
//                    public void onClick(View view) {
//                        Intent i = new Intent(getContext(), BeforeParseActivity.class);
//                        startActivity(i);
//                    }
//                }
//        );

        return inputFragmentView;
    }

}
