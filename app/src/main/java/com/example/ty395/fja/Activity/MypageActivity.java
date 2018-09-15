package com.example.ty395.fja.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.ty395.fja.R;

public class MypageActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_4);
        TextView text_nickname=findViewById(R.id.text_nickname);
        Intent intent=getIntent();
        String name=intent.getExtras().getString("name");
        text_nickname.setText(name);
    }
}
