package com.example.ty395.fja.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.ty395.fja.R;

public class MemberActivity extends AppCompatActivity{
    Button bt_cerfication;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_member);
        bt_cerfication=(Button)findViewById(R.id.bt_cerfication);
        Button man=findViewById(R.id.man);
        Button woman=findViewById(R.id.woman);
        Button another=findViewById(R.id.another);
        bt_cerfication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"회원가입이 완료되었습니다.",Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(getApplicationContext(),StartActivity.class);
                startActivity(intent);
            }
        });
    }
}
