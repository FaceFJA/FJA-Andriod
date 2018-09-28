package com.example.ty395.fja.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.ty395.fja.Connecter.API;
import com.example.ty395.fja.Connecter.RetrofitService;
import com.example.ty395.fja.R;
import com.google.gson.JsonObject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LoginActivity extends AppCompatActivity {
Button bt_login;
EditText edit_email;
EditText edit_password;
String getEmail;
String getPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        bt_login=(Button)findViewById(R.id.bt_login);
        edit_email=(EditText)findViewById(R.id.edit_email);
        edit_password=(EditText)findViewById(R.id.edit_password);
        bt_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getEmail=edit_email.getText().toString();
                getPassword=edit_password.getText().toString();
                getEmail=getEmail.trim();
                getPassword=getPassword.trim();
                if(getEmail.getBytes().length<=0|getPassword.getBytes().length<=0){
                    Toast.makeText(getApplicationContext(),"이메일 혹은 비밀번호가 입력되지 않았습니다",Toast.LENGTH_SHORT).show();
                }
                else{
                    post();
                }
            }
        });
    }
    public void post(){
        API retrofit= RetrofitService.getClient().create(API.class);
        JsonObject jsonObject=new JsonObject();
        jsonObject.addProperty("id",getEmail);
        jsonObject.addProperty("pw",getPassword);
        Call<Void> call= retrofit.post_login(jsonObject);
        call.enqueue(new Callback<Void>() {
            @Override
            public void onResponse(Call<Void> call, Response<Void> response) {
                Void repo = response.body();
                if(response.code()==200) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
                finish();
                }
                else{
                    Toast.makeText(getApplicationContext(),"아이디 혹은 비밀번호가 맞지 않습니다.",Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<Void> call, Throwable t) {

            }
        });
    }
}
