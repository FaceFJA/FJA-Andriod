package com.example.ty395.fja.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.SlidingDrawer;
import android.widget.Toast;

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
        final ArrayList<Comment_Item>comment_items=new ArrayList<>();
        CommentAdapter commentAdapter= new CommentAdapter(comment_items);
        recyclerView.setAdapter(commentAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        comment_items.add(new Comment_Item("패션왕","잘 어울리네요!"));
        comment_items.add(new Comment_Item("패션피플","다음엔 다른 스타일로 도전해보심이...."));
        comment_items.add(new Comment_Item("패션찐따","저는 저런 스타일이 좋아요!"));
        comment_items.add(new Comment_Item("패.패들ㅇr","무난하게 소화하시네요"));
        comment_items.add(new Comment_Item("패션왕","잘 어울리네요!"));
        comment_items.add(new Comment_Item("패션피플","다음엔 다른 스타일로 도전해보심이...."));
        comment_items.add(new Comment_Item("패션찐따","저는 저런 스타일이 좋아요!"));
        comment_items.add(new Comment_Item("패.패들ㅇr","무난하게 소화하시네요"));
        comment_items.add(new Comment_Item("패션왕","잘 어울리네요!"));
        comment_items.add(new Comment_Item("패션피플","다음엔 다른 스타일로 도전해보심이...."));
        comment_items.add(new Comment_Item("패션찐따","저는 저런 스타일이 좋아요!"));
        comment_items.add(new Comment_Item("패.패들ㅇr","무난하게 소화하시네요"));
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
                CommentDialog commentDialog= new CommentDialog(PostActivity.this);
                commentDialog.Date();
            }
        });
    }
}
