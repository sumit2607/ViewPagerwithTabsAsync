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


public class NameFragment extends Fragment {
      private RecyclerView recyclerView;
      private List<ModelClass> modelList = new ArrayList<>();

    public NameFragment() {
        // Required empty public constructor
    }


    public static NameFragment newInstance() {
        NameFragment fragment = new NameFragment();
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_name, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView = view.findViewById(R.id.recyclerview);
        setRecyclerview();
        buildData();
    }

    private void buildData() {
        modelList.add(new ModelClass("Sumit Rai"));
        modelList.add(new ModelClass("Amit Rai"));
        modelList.add(new ModelClass("Jack"));
        modelList.add(new ModelClass("Suneel"));
        modelList.add(new ModelClass("Sachin"));
        modelList.add(new ModelClass("Bing Bong"));
        modelList.add(new ModelClass("Messi"));
        modelList.add(new ModelClass("Raj"));
        modelList.add(new ModelClass("Narendra "));
        modelList.add(new ModelClass("Llyod "));
        modelList.add(new ModelClass("Nrupul Dev"));
        modelList.add(new ModelClass("Pratheek "));
        modelList.add(new ModelClass("Yogesh singh"));
        modelList.add(new ModelClass("Virat Kholi"));
        modelList.add(new ModelClass("Aditya rai"));

    }

    private void setRecyclerview() {
        Adapter adapter = new Adapter(modelList);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(adapter);
    }
}