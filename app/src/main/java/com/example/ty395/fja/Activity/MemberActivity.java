package com.example.ty395.fja.Activity;

import android.content.Intent;
import android.opengl.Visibility;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.ty395.fja.R;

public class MemberActivity extends AppCompatActivity{
    Button bt_cerfication;
    EditText edit_email;
    EditText edit_password;
    EditText edit_check_password;
    EditText edit_nickname;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_member);
        bt_cerfication=(Button)findViewById(R.id.bt_cerfication);
        final Button man=findViewById(R.id.bt_man);
        final Button woman=findViewById(R.id.bt_woman);
        final Button another=findViewById(R.id.bt_another);
        final Button choose_man=findViewById(R.id.bt_man_choose);
        final Button choose_woman=findViewById(R.id.bt_woman_choose);
        final Button choose_another=findViewById(R.id.bt_another_choose);
        edit_email=findViewById(R.id.edit_email);
        edit_password=findViewById(R.id.edit_password);
        edit_check_password=findViewById(R.id.edit_check_password);
        edit_nickname=findViewById(R.id.edit_nickname);
        final Button bt_check_nickname=findViewById(R.id.bt_check_nickname);
        bt_cerfication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String email,password,check_password,nickname;
                email=edit_email.getText().toString();
                check_password=edit_check_password.getText().toString();
                password=edit_password.getText().toString();
                nickname=edit_nickname.getText().toString();
                    if(email.getBytes().length<=0|check_password.getBytes().length<=0|password.getBytes().length<=0|nickname.getBytes().length<=0){
                        Toast.makeText(getApplicationContext(),"입력이 완료되지 않았습니다",Toast.LENGTH_SHORT).show();
                    }
                    else{
                    Toast.makeText(getApplicationContext(), "회원가입이 완료되었습니다.", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(getApplicationContext(), StartActivity.class);
                    startActivity(intent);
                }
            }
        });
        man.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                choose_man.setVisibility(View.VISIBLE);
                man.setVisibility(View.INVISIBLE);
                choose_another.setVisibility(View.INVISIBLE);
                woman.setVisibility(View.VISIBLE);
                another.setVisibility(View.VISIBLE);
                choose_woman.setVisibility(View.INVISIBLE);
            }
        });
        woman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                choose_woman.setVisibility(View.VISIBLE);
                woman.setVisibility(View.INVISIBLE);
                choose_man.setVisibility(View.INVISIBLE);
                choose_another.setVisibility(View.INVISIBLE);
                man.setVisibility(View.VISIBLE);
                another.setVisibility(View.VISIBLE);
            }
        });
        another.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                choose_another.setVisibility(View.VISIBLE);
                choose_woman.setVisibility(View.INVISIBLE);
                choose_man.setVisibility(View.INVISIBLE);
                another.setVisibility(View.INVISIBLE);
                man.setVisibility(View.VISIBLE);
                woman.setVisibility(View.VISIBLE);
            }
        });
    }
}
