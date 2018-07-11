package com.example.ty395.fja;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class RecycleAdapter extends RecyclerView.Adapter<RecycleAdapter.ViewHolder> {

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView title;
        TextView subtitle;
        ImageView image;

        ViewHolder(View v) {
            super(v);
            title = v.findViewById(R.id.text_title);
            subtitle = v.findViewById(R.id.text_subtitle);
            image = v.findViewById(R.id.ic_evalation);
        }
    }

    private ArrayList<Evalation_Recycleitem> itemArrayList;

    RecycleAdapter(ArrayList<Evalation_Recycleitem> itemArrayList) {
        this.itemArrayList = itemArrayList;
    }

    @Override
    public RecycleAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_evalation, parent, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecycleAdapter.ViewHolder holder, int position) {
        ViewHolder myViewHolder=(ViewHolder)holder;
        myViewHolder.title.setText(itemArrayList.get(position).getTitle());
        myViewHolder.image.setImageResource(itemArrayList.get(position).getImage());
        myViewHolder.subtitle.setText(itemArrayList.get(position).getSubtitle());
    }

    @Override
    public int getItemCount() {
        return itemArrayList.size();
    }
}