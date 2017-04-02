package com.app.climatechangetoday.climatenow.Fragments;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.app.climatechangetoday.climatenow.Adapters.RecyclerViewAdapter;
import com.app.climatechangetoday.climatenow.Common.Model;
import com.app.climatechangetoday.climatenow.R;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class Recent extends Fragment {

    RecyclerViewAdapter adapter;
    RecyclerView recyclerView;
    private static List<Model> demoData;

    public Recent() {
        // Required empty public constructor
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        recyclerView = (RecyclerView) getView().findViewById(R.id.myList);
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(llm);

        demoData = new ArrayList<Model>();
        char c = 'A';
        for (byte i = 0; i < 20; i++) {
            Model model = new Model();
            model.name = c++;
            model.age = (byte) (20 + i);
            demoData.add(model);
        }
        adapter = new RecyclerViewAdapter(demoData);
        recyclerView.setAdapter(adapter);
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_recent, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


    }


}
