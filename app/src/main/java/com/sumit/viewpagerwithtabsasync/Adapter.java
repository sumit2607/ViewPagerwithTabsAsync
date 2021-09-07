package com.sumit.viewpagerwithtabsasync;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<ViewHolder> {
    private List<ModelClass> modelClass;

    public Adapter(List<ModelClass> modelClass){
        this.modelClass = modelClass;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout, parent, false);
        return new ViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        ModelClass model = modelClass.get(position);
        holder.setData(model);
    }

    @Override
    public int getItemCount() {
        return modelClass.size();
    }
}
