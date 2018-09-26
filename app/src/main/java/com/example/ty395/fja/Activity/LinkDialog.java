package com.example.ty395.fja.Activity;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.view.Window;
import android.widget.Button;

import com.example.ty395.fja.BuildConfig;
import com.example.ty395.fja.R;

public class LinkDialog {
    Context context;
    public LinkDialog(Context context){
        this.context=context;
    }
    public void Date(){
        final Dialog dialog=new Dialog(context);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.dialog_link);
        dialog.show();
        Button button=dialog.findViewById(R.id.bt_link);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });
    }
}
