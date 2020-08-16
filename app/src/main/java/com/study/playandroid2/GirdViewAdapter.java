package com.study.playandroid2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/**
 * @author zhaixiaofan
 * @date 2020-08-15 20:52
 */
public class GirdViewAdapter extends RecyclerView.Adapter {

    Context context;

    public GirdViewAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new MyVH(LayoutInflater.from(context).inflate(R.layout.adpter_gird_view, null));
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return 8;
    }

    static class MyVH extends RecyclerView.ViewHolder {

        public MyVH(@NonNull View itemView) {
            super(itemView);
        }
    }
}
