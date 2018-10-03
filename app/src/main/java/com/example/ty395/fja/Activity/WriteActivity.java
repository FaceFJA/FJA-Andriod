package com.example.ty395.fja.Activity;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Base64;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.ty395.fja.Connecter.API;
import com.example.ty395.fja.Connecter.PostModel;
import com.example.ty395.fja.Connecter.RetrofitService;
import com.example.ty395.fja.R;
import com.google.gson.JsonObject;

import java.io.ByteArrayOutputStream;
import java.util.Random;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class WriteActivity extends AppCompatActivity {
    TextView text_back;
    private int REQ_PICK_CODE = 1112;
    ImageView ic_picture;
    EditText edit_titie;
    EditText edit_text;
    String title;
    String text;
    String category;
    String images;
    Integer postid;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_write);
        text_back = (TextView) findViewById(R.id.text_back);
        ic_picture=findViewById(R.id.ic_picture);
        final Spinner spinner = (Spinner) findViewById(R.id.spinner);
        edit_text=findViewById(R.id.edit_text);
        edit_titie=findViewById(R.id.edit_title);
        ArrayAdapter adapter = ArrayAdapter.createFromResource(this, R.array.number, android.R.layout.simple_spinner_item);
        spinner.setAdapter(adapter);
        ImageView ic_camera = findViewById(R.id.ic_camera);
        Random random= new Random();
        postid=random.nextInt(10000);

        ic_camera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_PICK);
                intent.setData(android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                intent.setType("image/*");
                startActivityForResult(intent, REQ_PICK_CODE);
            }
        });
        ImageView ic_link = findViewById(R.id.ic_link);
        ic_link.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LinkDialog linkDialog = new LinkDialog(WriteActivity.this);
                linkDialog.Date();
            }
        });
        text_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "메인화면으로 이동합니다", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
        TextView text_post = findViewById(R.id.text_post);
        text_post.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text=edit_text.getText().toString();
                title=edit_titie.getText().toString();
//                ByteArrayOutputStream outStream = new ByteArrayOutputStream();
//                Resources res= getResources();
//                Bitmap bitmap = BitmapFactory.decodeResource(res, R.drawable.person1);
//                bitmap.compress(Bitmap.CompressFormat.PNG, 100, outStream);
//                byte[] image = outStream.toByteArray();
//                images = Base64.encodeToString(image, 0);
                post();
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        try {
            //이미지를 하나 골랐을때
            if (requestCode == REQ_PICK_CODE && resultCode == RESULT_OK && null != data) {
                //data에서 절대경로로 이미지를 가져옴
                Uri uri = data.getData();

                Bitmap bitmap = MediaStore.Images.Media.getBitmap(getContentResolver(),uri);
                //이미지가 한계이상(?) 크면 불러 오지 못하므로 사이즈를 줄여 준다.
                int nh = (int) (bitmap.getHeight() * (1024.0 / bitmap.getWidth()));
                Bitmap scaled = Bitmap.createScaledBitmap(bitmap, 1024, nh, true);

                ic_picture = (ImageView) findViewById(R.id.ic_picture);
                ic_picture.setImageBitmap(scaled);

            } else {
                Toast.makeText(this, "취소 되었습니다.", Toast.LENGTH_LONG).show();
            }

        } catch (Exception e) {
            Toast.makeText(this, "Oops! 로딩에 오류가 있습니다.", Toast.LENGTH_LONG).show();
            e.printStackTrace();
        }

    }
    public void post(){
        API retrofit= RetrofitService.getClient().create(API.class);
        JsonObject jsonObject=new JsonObject();
        jsonObject.addProperty("title",title);
        jsonObject.addProperty("text",text);
        jsonObject.addProperty("category","결혼식");
        jsonObject.addProperty("images","images");
        Call<Void> call=retrofit.post_post(jsonObject);
        call.enqueue(new Callback<Void>() {
            @Override
            public void onResponse(Call<Void> call, Response<Void> response) {
                if(response.code()==404){
                    Intent intent=new Intent(WriteActivity.this,MainActivity.class);
                    startActivity(intent);
                }
            }

            @Override
            public void onFailure(Call<Void> call, Throwable t) {

            }
        });
    }
}

