package com.example.ty395.fja.Adapter;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ty395.fja.Activity.PostActivity;
import com.example.ty395.fja.Item.EvalationItem;
import com.example.ty395.fja.Item.Evalation_Recycleitem;
import com.example.ty395.fja.R;

import java.util.ArrayList;

public class EvalationAdapter extends RecyclerView.Adapter<EvalationAdapter.ViewHolder> {
    ArrayList<EvalationItem> evalationItems;
    public EvalationAdapter(FragmentActivity activity, ArrayList<EvalationItem> evalationItems){
        this.evalationItems=evalationItems;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_continue_evalation,parent,false);
        return new EvalationAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        EvalationItem evalationItem=evalationItems.get(position);
        holder.main_title.setText(evalationItem.getTitle());
        holder.sub_title.setText(evalationItem.getSubtitle());
        holder.image.setImageResource(evalationItem.getImage());
        holder.image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(v.getContext(),PostActivity.class);
                v.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return 2;
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
