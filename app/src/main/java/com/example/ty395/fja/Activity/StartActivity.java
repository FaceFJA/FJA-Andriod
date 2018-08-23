package com.example.ty395.fja.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.ty395.fja.Activity.LoginActivity;
import com.example.ty395.fja.Activity.MemberActivity;
import com.example.ty395.fja.R;

public class StartActivity extends AppCompatActivity {
    Button bt_new_member;
    Button bt_login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        bt_new_member=(Button)findViewById(R.id.bt_new_member);
        bt_login=(Button)findViewById(R.id.bt_login);
        bt_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(), LoginActivity.class);
                startActivity(intent);
                finish();
            }
        });
        bt_new_member.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(), MemberActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}