package com.example.ty395.fja.Activity;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RelativeLayout;

import com.example.ty395.fja.R;

public class MypageActivity extends AppCompatActivity {
    RelativeLayout layout_change_my_name;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_4);
        layout_change_my_name=(RelativeLayout)findViewById(R.id.layout_change_name);
        layout_change_my_name.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Name_Change_Dialog name_change_dialog=new Name_Change_Dialog(MypageActivity.this);
                FragmentManager fm = getSupportFragmentManager();
                name_change_dialog.CallFunction(fm);
            }
        });
    }
}
