package com.mycompany.assignment1;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class Fragment2 extends Fragment {


    TextView OOptions, OAnswer;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_2, container, false);
        OOptions = (TextView) view.findViewById(R.id.OutputOptions);
        OAnswer = (TextView) view.findViewById(R.id.OutputAnswer);
        return view;
    }

    public void display(String Options, String OutCome)
    {
        OAnswer.setText(OutCome);
        OOptions.setText(Options);
    }


}