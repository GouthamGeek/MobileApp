package com.mycompany.assignment1;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.ListFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;


public class Fragment1 extends ListFragment {





    String[] Options = new String[]
            {
                    "AI Activity","VR Activity"
            };
    String[] outputAnswer = new String[]
            {
                    "AI Activity Executed","VR Activity Executed"
            };

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {

        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_1, container, false);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_1,Options);
        setListAdapter(adapter);
        return view;


    }



    public void OnListItemClick(int position, long id, ListView l, View v)
    {

        Fragment2 fragment = (Fragment2)getFragmentManager().findFragmentById(R.id.fragment2);
        fragment.display(Options[position], " "+outputAnswer[position]);
        getListView().setSelection(android.R.color.holo_green_dark);




    }
}