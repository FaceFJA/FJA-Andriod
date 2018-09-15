package com.example.ty395.fja.Activity;

import android.app.Dialog;
import android.content.Context;
import android.view.Window;

import com.example.ty395.fja.R;

public class Choose_Date_Dialog {
    private Context context;
    public Choose_Date_Dialog(Context context){this.context=context;}
    public void Date(){
        final Dialog dialog=new Dialog(context);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.dialog_choose_date);
        dialog.show();
    }

}
