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

public class AgendaFragment extends Fragment {
    private CardView.OnClickListener cardViewOnClickListener =
            new CardView.OnClickListener(){
                @Override
                public void onClick(View view) {
                    switch (view.getId()){
                        case R.id.cv_welcoming:
                            break;
                    }
                }
            };

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View inputFragmentView = inflater.inflate(R.layout.fragment_agenda, container, false);

        CardView praevent = (CardView) inputFragmentView.findViewById(R.id.cv_praevent);
        praevent.setOnClickListener(
                new CardView.OnClickListener(){
                    @Override
                    public void onClick(View view) {
                        Intent i = new Intent(getContext(), PraeventActivity.class);
                        startActivity(i);
                    }
                }
        );

        CardView welcoming = (CardView) inputFragmentView.findViewById(R.id.cv_welcoming);
        welcoming.setOnClickListener(
                new CardView.OnClickListener(){
                    @Override
                    public void onClick(View view) {
                        Intent i = new Intent(getContext(), WelcomingActivity.class);
                        startActivity(i);
                    }
                }
        );

        CardView ideasummit = (CardView) inputFragmentView.findViewById(R.id.cv_ideasummit);
        ideasummit.setOnClickListener(
                new CardView.OnClickListener(){
                    @Override
                    public void onClick(View view) {
                        Intent i = new Intent(getContext(), IdeaSummit.class);
                        startActivity(i);
                    }
                }
        );

        CardView workshopclass = (CardView) inputFragmentView.findViewById(R.id.cv_workshopclass);
        workshopclass.setOnClickListener(
                new CardView.OnClickListener(){
                    @Override
                    public void onClick(View view) {
                        Intent i = new Intent(getContext(), WorkshopClassActivity.class);
                        startActivity(i);
                    }
                }
        );

        CardView galafutureleader = (CardView) inputFragmentView.findViewById(R.id.cv_galafutureleader);
        galafutureleader.setOnClickListener(
                new CardView.OnClickListener(){
                    @Override
                    public void onClick(View view) {
                        Intent i = new Intent(getContext(), GalaFutureLeaderActivity.class);
                        startActivity(i);
                    }
                }
        );

        CardView ideatrial = (CardView) inputFragmentView.findViewById(R.id.cv_ideatrial);
        ideatrial.setOnClickListener(
                new CardView.OnClickListener(){
                    @Override
                    public void onClick(View view) {
                        Intent i = new Intent(getContext(), IdeaTrialActivity.class);
                        startActivity(i);
                    }
                }
        );

        CardView grandsummit = (CardView) inputFragmentView.findViewById(R.id.cv_grandsummit);
        grandsummit.setOnClickListener(
                new CardView.OnClickListener(){
                    @Override
                    public void onClick(View view) {
                        Intent i = new Intent(getContext(), GrandSummitActivity.class);
                        startActivity(i);
                    }
                }
        );

        return inputFragmentView;

    }

}
