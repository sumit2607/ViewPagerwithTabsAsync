package com.sumit.viewpagerwithtabsasync;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


public class TourismFragment extends Fragment {

    private RecyclerView recyclerview;
    private List<ModelClass> modelList = new ArrayList<>();

    public TourismFragment() {
        // Required empty public constructor
    }

    public static TourismFragment newInstance() {
        TourismFragment fragment = new TourismFragment();
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_tourism, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerview = view.findViewById(R.id.recyclerview);
        setRecylerView();
        buildData();
    }

    private void buildData() {
        modelList.add(new ModelClass("Love"));
        modelList.add(new ModelClass("Goa Beach"));
        modelList.add(new ModelClass("India gate "));
        modelList.add(new ModelClass("Lalith Mahal"));
        modelList.add(new ModelClass("Red Fort"));
        modelList.add(new ModelClass("QutibMinar"));
        modelList.add(new ModelClass("Ladakh"));
        modelList.add(new ModelClass("Coorg"));
        modelList.add(new ModelClass("munnar"));
        modelList.add(new ModelClass("coalkers  "));
        modelList.add(new ModelClass("love lake"));
        modelList.add(new ModelClass("abhey falls"));
        modelList.add(new ModelClass("Mysuru Palace"));
        modelList.add(new ModelClass("Bangalore Palace"));
        modelList.add(new ModelClass("TajMahal"));
    }

    private void setRecylerView() {
        Adapter adapter = new Adapter(modelList);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        recyclerview.setLayoutManager(linearLayoutManager);
        recyclerview.setAdapter(adapter);
    }
}