package com.example.ty395.fja.Activity;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;

import com.example.ty395.fja.R;

public class PostDialog  {
    Context context;
    public PostDialog(Context context){
        this.context=context;
    }
    void CallFuntion(){
        final Dialog dialog=new Dialog(context);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.dialog_enrollment);
        dialog.show();
        Button bt_post=dialog.findViewById(R.id.bt_post);
        bt_post.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(context,MainActivity.class);
                context.startActivity(intent);
                Toast.makeText(context.getApplicationContext(),"게시글 등록이 완료되었습니다",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
