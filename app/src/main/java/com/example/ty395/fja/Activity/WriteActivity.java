package com.example.ty395.fja.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.ty395.fja.Activity.MainActivity;
import com.example.ty395.fja.R;

public class WriteActivity extends AppCompatActivity {
    TextView text_back;
    private int REQ_PICK_CODE=100;

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
        final Spinner spinner = (Spinner) findViewById(R.id.spinner);
        ArrayAdapter adapter = ArrayAdapter.createFromResource(this, R.array.number, android.R.layout.simple_spinner_item);
        spinner.setAdapter(adapter);
        ImageView ic_camera=findViewById(R.id.ic_camera);
        ic_camera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pickerIntent = new Intent(Intent.ACTION_PICK);
                pickerIntent.setType(android.provider.MediaStore.Images.Media.CONTENT_TYPE);
                pickerIntent.setData(android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                startActivityForResult(pickerIntent, REQ_PICK_CODE);
            }
        });
        ImageView ic_link=findViewById(R.id.ic_link);
        ic_link.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LinkDialog linkDialog=new LinkDialog(WriteActivity.this);
                linkDialog.Date();
            }
        });
    }
}
