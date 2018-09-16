package com.example.ty395.fja.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.ty395.fja.Item.Comment_Item;
import com.example.ty395.fja.Item.Evalation_Recycleitem;
import com.example.ty395.fja.R;

import java.util.ArrayList;

public class CommentAdapter extends RecyclerView.Adapter<CommentAdapter.ViewHolder> {
    ArrayList<Comment_Item> comment_items;
    public CommentAdapter(ArrayList<Comment_Item> comment_items) { ;
        this.comment_items =comment_items ;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_comment,parent,false);
        return new CommentAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Comment_Item commentItem=comment_items.get(position);
        holder.text_nickname.setText(commentItem.getText_nickname());
        holder.text_recommend.setText(commentItem.getText_recommend());
    }

    @Override
    public int getItemCount() {
        return comment_items.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView text_nickname;
        TextView text_recommend;
        public ViewHolder(View view) {
            super(view);
            text_nickname=view.findViewById(R.id.text_nick);
            text_recommend=view.findViewById(R.id.text_recommend);
        }
    }
}
