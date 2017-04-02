package com.app.climatechangetoday.climatenow.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.app.climatechangetoday.climatenow.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ToDos extends Fragment {


    public ToDos() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_to_dos, container, false);
        TextView textView = (TextView)view.findViewById(R.id.fragment_todos_text_view);
        textView.setText("TextView!");
        return view;
    }

}
