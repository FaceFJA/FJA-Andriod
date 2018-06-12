package com.example.ty395.fja;

import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

import java.lang.String;

public class MemberActivity extends AppCompatActivity {
    EditText edit_email;
    EditText edit_password;
    EditText edit_check_password;
    EditText edit_nickname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_member);
        edit_email = (EditText) findViewById(R.id.edit_email);
        edit_password = (EditText) findViewById(R.id.edit_password);
        edit_check_password = (EditText) findViewById(R.id.edit_check_password);
        edit_nickname = (EditText) findViewById(R.id.edit_nickname);
        if(edit_email.getText().toString().length()==0);
        Toast.makeText(this,"아이디를 입력해주세요",Toast.LENGTH_SHORT).show();
    }
}
