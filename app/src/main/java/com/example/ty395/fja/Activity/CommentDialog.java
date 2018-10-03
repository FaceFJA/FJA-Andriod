package com.example.ty395.fja.Activity;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.ty395.fja.Connecter.API;
import com.example.ty395.fja.Connecter.CommentModel;
import com.example.ty395.fja.Connecter.RetrofitService;
import com.example.ty395.fja.R;
import com.google.gson.JsonObject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class CommentDialog {
    Context context;
    EditText edit_comment;
    String text;
    public CommentDialog(Context context){
        this.context=context;
    }
    public void Date(){
        final Dialog dialog=new Dialog(context);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.dialog_comment);
        dialog.show();
        Button button=dialog.findViewById(R.id.button);
        edit_comment=dialog.findViewById(R.id.edit_comment);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text=edit_comment.getText().toString();
                post();
                dialog.dismiss();
            }
        });
    }
    public void post() {
        API retrofit = RetrofitService.getClient().create(API.class);
        JsonObject jsonObject=new JsonObject();
        jsonObject.addProperty("text",text);
        Call<Void> call=retrofit.post_comment(jsonObject);
        call.enqueue(new Callback<Void>() {
            @Override
            public void onResponse(Call<Void> call, Response<Void> response) {

            }

            @Override
            public void onFailure(Call<Void> call, Throwable t) {

            }
        });
    }

}
