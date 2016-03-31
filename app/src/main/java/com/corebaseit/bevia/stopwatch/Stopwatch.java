package com.corebaseit.bevia.stopwatch;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import butterknife.Bind;
import butterknife.ButterKnife;


/**
 * A simple {@link Fragment} subclass.
 */
public class Stopwatch extends Fragment {

    @Bind(R.id.start_button)
    Button startButton;
    @Bind(R.id.stop_button)
    Button stopButton;
    @Bind(R.id.reset_button)
    Button resetButton;


    public Stopwatch() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_stopwatch, container, false);
        ButterKnife.bind(this, rootView);
        return rootView;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);


        startButton.setOnClickListener((View view) -> {


        });

        stopButton.setOnClickListener((View view) -> {



        });

        resetButton.setOnClickListener((View view) -> {


        });
    }
}
