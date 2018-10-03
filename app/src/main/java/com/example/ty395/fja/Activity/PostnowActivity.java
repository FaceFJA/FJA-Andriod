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
import com.example.ty395.fja.Adapter.PostAdater;
import com.example.ty395.fja.Item.CommentItem;
import com.example.ty395.fja.Item.Comment_Item;
import com.example.ty395.fja.R;

import java.util.ArrayList;

public class PostnowActivity extends AppCompatActivity{
    RecyclerView recyclerView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post_now);
        recyclerView=findViewById(R.id.recyclerview);
        ArrayList<CommentItem>comment_item=new ArrayList<>();
        PostAdater commentAdapter= new PostAdater(comment_item);
        recyclerView.setAdapter(commentAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        comment_item.add(new CommentItem("자칭패피","저는 스트릿룩으로 입었답니당"));
        comment_item.add(new CommentItem("홍대걸","저는 아이유룩을 좋아했습니다."));
        comment_item.add(new CommentItem("패션보이","음 저는 저 사진대로 입었답니다."));
        comment_item.add(new CommentItem("박나래","저는 화려한 룩을 좋아해서 즐겨입었어요"));
        comment_item.add(new CommentItem("춤추는 갈매기","그건 잘 모르겠고 저 코트가 이쁘네요"));
        comment_item.add(new CommentItem("0","111555"));
        ImageView ic_back=findViewById(R.id.ic_back);
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
                CommentDialog commentDialog= new CommentDialog(PostnowActivity.this);
                commentDialog.Date();
            }
        });
    }
}
