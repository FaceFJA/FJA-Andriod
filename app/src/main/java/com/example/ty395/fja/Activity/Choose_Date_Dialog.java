package com.example.ty395.fja.Activity;

import android.app.Dialog;
import android.content.Context;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ty395.fja.Connecter.API;
import com.example.ty395.fja.Connecter.RetrofitService;
import com.example.ty395.fja.R;
import com.google.gson.JsonObject;

import retrofit2.Call;

public class Choose_Date_Dialog {
    private Context context;
    ImageView ic_person1;
    ImageView ic_person2;
    ImageView ic_person3;
    TextView text_person1;
    TextView text_person2;
    TextView text_person3;
    public Choose_Date_Dialog(Context context){this.context=context;}
    public void Date(){
        final Dialog dialog=new Dialog(context);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.dialog_choose_date);
        dialog.show();
    }

}
