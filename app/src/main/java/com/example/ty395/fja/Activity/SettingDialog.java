package com.example.ty395.fja.Activity;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ty395.fja.R;

public class SettingDialog {
    private Context context;
    public SettingDialog(Context context){this.context=context;}
    void Date(){
        final Dialog dialog=new Dialog(context);
       dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.dialog_setting);
        dialog.show();
        final TextView text_no_choose=dialog.findViewById(R.id.text_nochoose);
        final TextView text_choose=dialog.findViewById(R.id.text_choose);
        final ImageView ic_choose=dialog.findViewById(R.id.ic_choose);
        final ImageView ic_no_chooose=dialog.findViewById(R.id.ic_no_choose);
        final ImageView ic_clear=dialog.findViewById(R.id.ic_clear);
        ic_choose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text_choose.setVisibility(View.INVISIBLE);
                ic_no_chooose.setVisibility(View.VISIBLE);
                text_no_choose.setVisibility(View.VISIBLE);
                ic_choose.setVisibility(View.INVISIBLE);
            }
        });
        ic_no_chooose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text_choose.setVisibility(View.VISIBLE);
                text_no_choose.setVisibility(View.INVISIBLE);
                ic_choose.setVisibility(View.VISIBLE);
                ic_no_chooose.setVisibility(View.INVISIBLE);
            }
        });
        text_choose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               text_choose.setVisibility(View.INVISIBLE);
                text_no_choose.setVisibility(View.VISIBLE);
                ic_choose.setVisibility(View.INVISIBLE);
                ic_no_chooose.setVisibility(View.VISIBLE);
            }
        });
        text_no_choose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text_choose.setVisibility(View.VISIBLE);
                text_no_choose.setVisibility(View.INVISIBLE);
                ic_choose.setVisibility(View.VISIBLE);
                ic_no_chooose.setVisibility(View.INVISIBLE);
            }
        });
        ic_clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(context,MainActivity.class);
                context.startActivity(intent);
            }
        });
    }
}
