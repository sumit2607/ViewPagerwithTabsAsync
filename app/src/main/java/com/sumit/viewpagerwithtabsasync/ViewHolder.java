package com.sumit.viewpagerwithtabsasync;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ViewHolder extends RecyclerView.ViewHolder {

    private TextView tvString;


    public ViewHolder(@NonNull View itemView) {
        super(itemView);
        intitview(itemView);
    }

    private void intitview(View itemView) {
        tvString = itemView.findViewById(R.id.tvString);

    }
    public  void setData(ModelClass modelClass){
        tvString.setText(modelClass.getName());

    }
}
