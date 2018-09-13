package com.example.ty395.fja.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.ty395.fja.Activity.MainActivity;
import com.example.ty395.fja.R;

public class WriteActivity extends AppCompatActivity {
    TextView text_back;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_write);
        text_back=(TextView)findViewById(R.id.text_back);
        text_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"메인화면으로 이동합니다",Toast.LENGTH_SHORT).show();
                Intent intent= new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
        TextView text_post=findViewById(R.id.text_post);
        text_post.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PostDialog postDialog=new PostDialog(WriteActivity.this);
                postDialog.CallFuntion();
            }
        });
    }
}