package com.example.ty395.fja.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

import com.example.ty395.fja.Adapter.CommentAdapter;
import com.example.ty395.fja.Item.Comment_Item;
import com.example.ty395.fja.R;

import java.util.ArrayList;

public class PostActivity2 extends AppCompatActivity {
    RecyclerView recyclerView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post_past);
        recyclerView=findViewById(R.id.recycler);
        final ArrayList<Comment_Item> comment_items=new ArrayList<>();
        CommentAdapter commentAdapter= new CommentAdapter(comment_items);
        recyclerView.setAdapter(commentAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        comment_items.add(new Comment_Item("기안894","저는 동네백수처럼 입어요.."));
        comment_items.add(new Comment_Item("차태민","저는 교복을 즐겨입어요"));
        comment_items.add(new Comment_Item("노영은","무지티에 청바지가 짱이죠"));
        comment_items.add(new Comment_Item("하이루","옷은 역시 도전적이죠"));
        comment_items.add(new Comment_Item("옷은 날개","저는 빈티지 감성의 옷을 좋아해요"));
        comment_items.add(new Comment_Item("0","999999"));
        final ImageView ic_back=findViewById(R.id.ic_back);
        ic_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
        ImageView ic_comment=findViewById(R.id.ic_comment);
        ic_comment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CommentDialog commentDialog= new CommentDialog(PostActivity2.this);
                commentDialog.Date();
            }
        });
    }
}
