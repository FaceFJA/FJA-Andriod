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

public class MemberActivity extends AppCompatActivity {
    Button bt_cerfication;
    EditText edit_email;
    EditText edit_password;
    EditText edit_name;
    EditText edit_id;
    Integer gender;
    String email;
    String password;
    String name;
    String id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_member);
        bt_cerfication = (Button) findViewById(R.id.bt_cerfication);
        final Button man = findViewById(R.id.bt_man);
        final Button woman = findViewById(R.id.bt_woman);
        final Button another = findViewById(R.id.bt_another);
        final Button choose_man = findViewById(R.id.bt_man_choose);
        final Button choose_woman = findViewById(R.id.bt_woman_choose);
        final Button choose_another = findViewById(R.id.bt_another_choose);
        edit_email = findViewById(R.id.edit_email);
        edit_password = findViewById(R.id.edit_password);
        edit_name = findViewById(R.id.edit_name);
        edit_id = findViewById(R.id.edit_id);
        final Button bt_check_nickname = findViewById(R.id.bt_check_nickname);
        bt_cerfication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                email = edit_email.getText().toString();
                name = edit_name.getText().toString();
                password = edit_password.getText().toString();
                id = edit_id.getText().toString();
                if (email.getBytes().length <= 0 | name.getBytes().length <= 0 | password.getBytes().length <= 0 | id.getBytes().length <= 0) {
                    Toast.makeText(getApplicationContext(), "입력이 완료되지 않았습니다", Toast.LENGTH_SHORT).show();
                } else {
                    post();
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
                Toast.makeText(getApplicationContext(), "남자", Toast.LENGTH_SHORT);
                gender = 1;
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
                Toast.makeText(getApplicationContext(), "여자", Toast.LENGTH_SHORT);
                gender = 0;
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
                Toast.makeText(getApplicationContext(), "기타", Toast.LENGTH_SHORT);
                gender = 2;
            }
        });
    }

    public void post() {
        API retrofit = RetrofitService.getClient().create(API.class);
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("id", id);
        jsonObject.addProperty("pw", password);
        jsonObject.addProperty("name", name);
        jsonObject.addProperty("gender", gender);
        jsonObject.addProperty("old", 36);
        jsonObject.addProperty("email", email);

        Call<Void> call = retrofit.post_member(jsonObject);
        call.enqueue(new Callback<Void>() {
            @Override
            public void onResponse(Call<Void> call, Response<Void> response) {
                    Void repo = response.body();
                    if (response.code()==200) {
                        Toast.makeText(getApplicationContext(), "회원가입이 완료되었습니다.", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(getApplicationContext(), StartActivity.class);
                        startActivity(intent);
                    }
            }

            @Override
            public void onFailure(Call<Void> call, Throwable t) {

            }
        });
    }
}

