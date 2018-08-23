package com.example.ty395.fja.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ty395.fja.Item.Evalation_Recycleitem;
import com.example.ty395.fja.R;

import java.util.ArrayList;

public class RecycleAdapter extends RecyclerView.Adapter<RecycleAdapter.ViewHolder> {
    Context context;
    ArrayList<Evalation_Recycleitem> evalation_recycleitems;
    int recycler_item;
    public RecycleAdapter(FragmentActivity activity, ArrayList<Evalation_Recycleitem> evalation_recycleitems) {
        this.context = context;
        this.evalation_recycleitems = evalation_recycleitems;
        this.recycler_item=recycler_item;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_evalation,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Evalation_Recycleitem evalation_recycleitem=evalation_recycleitems.get(position);
        holder.main_title.setText(evalation_recycleitem.getTitle());
        holder.sub_title.setText(evalation_recycleitem.getSubtitle());
        holder.image.setImageResource(evalation_recycleitem.getImage());
    }

    @Override
    public int getItemCount() {
        return evalation_recycleitems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView main_title,sub_title;
        ImageView image;
        public ViewHolder(View itemView) {
            super(itemView);
            main_title=(TextView)itemView.findViewById(R.id.text_title);
            sub_title=(TextView)itemView.findViewById(R.id.text_subtitle);
            image=(ImageView)itemView.findViewById(R.id.ic_evalation);
        }
    }
}