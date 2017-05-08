package com.nurulirfan.flsguide;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class HomeFragment extends Fragment {

    private CardView.OnClickListener cardViewOnClickListener =
            new CardView.OnClickListener(){
                @Override
                public void onClick(View view) {
                    switch (view.getId()){
                        case R.id.greeting:

                            break;
                    }
                }
            };

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View inputFragmentView = inflater.inflate(R.layout.fragment_home, container, false);

        CardView greeting = (CardView) inputFragmentView.findViewById(R.id.greeting);
        greeting.setOnClickListener(
                new CardView.OnClickListener(){
                    @Override
                    public void onClick(View view) {
                        Intent i = new Intent(getContext(), GreetingActivity.class);
                        startActivity(i);
                    }
                }
        );

        return inputFragmentView;

    }


}
