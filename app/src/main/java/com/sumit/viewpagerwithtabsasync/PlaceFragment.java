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


public class PlaceFragment extends Fragment {
    private RecyclerView recyclerView;
    private List<ModelClass> modelList = new ArrayList<>();

    public PlaceFragment() {
        // Required empty public constructor
    }

    public static PlaceFragment newInstance() {
        PlaceFragment fragment = new PlaceFragment();
        return fragment;
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_place, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView = view.findViewById(R.id.recyclerview);
        setRecyclerview();
        buildList();
    }

    private void buildList() {
        modelList.add(new ModelClass("Mumbai"));
        modelList.add(new ModelClass("Chennai"));
        modelList.add(new ModelClass("Tamil naidu "));
        modelList.add(new ModelClass("Gujurath"));
        modelList.add(new ModelClass("Bihar"));
        modelList.add(new ModelClass("Nepal"));
        modelList.add(new ModelClass("Goa"));
        modelList.add(new ModelClass("Coorg"));
        modelList.add(new ModelClass("West Bengal"));
        modelList.add(new ModelClass("Delhi"));
        modelList.add(new ModelClass("karnataka "));
        modelList.add(new ModelClass("kerala"));
        modelList.add(new ModelClass("Andhra Pradesh "));
        modelList.add(new ModelClass("ooty"));
        modelList.add(new ModelClass("Rajasthan"));

    }

    private void setRecyclerview() {
        Adapter adapter = new Adapter(modelList);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(adapter);
    }
}