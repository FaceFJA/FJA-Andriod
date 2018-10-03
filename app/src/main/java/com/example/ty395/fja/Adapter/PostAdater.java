package com.example.ty395.fja.Adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.ty395.fja.Activity.CommentDialog;
import com.example.ty395.fja.Item.CommentItem;
import com.example.ty395.fja.Item.Comment_Item;
import com.example.ty395.fja.R;

import java.util.ArrayList;

public class PostAdater extends RecyclerView.Adapter<PostAdater.ViewHolder> {
    ArrayList<CommentItem> comment_item;
    public PostAdater(ArrayList<CommentItem> comment_item) {
        this.comment_item =comment_item ;
    }
    @NonNull
    @Override
    public PostAdater.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_comment2,parent,false);
        return new PostAdater.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PostAdater.ViewHolder holder, int position) {
        CommentItem commentItem=comment_item.get(position);
        holder.text_nickname.setText(commentItem.getText_nickname());
        holder.text_recommend.setText(commentItem.getText_recommend());
    }

    @Override
    public int getItemCount() {
        return comment_item.size();
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
