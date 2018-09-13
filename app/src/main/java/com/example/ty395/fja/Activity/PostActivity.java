package com.example.ty395.fja.Activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.SlidingDrawer;

import com.example.ty395.fja.Adapter.CommentAdapter;
import com.example.ty395.fja.Adapter.RecycleAdapter;
import com.example.ty395.fja.Item.Comment_Item;
import com.example.ty395.fja.Item.Evalation_Recycleitem;
import com.example.ty395.fja.R;

import java.util.ArrayList;

public class PostActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post);
        recyclerView=findViewById(R.id.recycler);
        ArrayList<Comment_Item>comment_items=new ArrayList<>();
        CommentAdapter commentAdapter= new CommentAdapter(comment_items);
        recyclerView.setAdapter(commentAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        comment_items.add(new Comment_Item("패션왕"));
        comment_items.add(new Comment_Item("패션왕"));
        comment_items.add(new Comment_Item("패션왕"));
        comment_items.add(new Comment_Item("패션왕"));
        comment_items.add(new Comment_Item("패션왕"));
        comment_items.add(new Comment_Item("패션왕"));
        comment_items.add(new Comment_Item("패션왕"));
        comment_items.add(new Comment_Item("패션왕"));
        comment_items.add(new Comment_Item("패션왕"));
        comment_items.add(new Comment_Item("패션왕")); comment_items.add(new Comment_Item("패션왕"));
        comment_items.add(new Comment_Item("패션왕"));
        comment_items.add(new Comment_Item("패션왕"));
        comment_items.add(new Comment_Item("패션왕"));


    }
}
