package com.example.ty395.fja.Activity;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.ty395.fja.Fragment.Fragment4;
import com.example.ty395.fja.R;

public class Name_Change_Dialog {
    private Context context;
    EditText edit_name;
    public Name_Change_Dialog(Context context){
        this.context=context;
    }


    public void CallFunction(){
        final Dialog dialog=new Dialog(context);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.dialog_name_change);
        dialog.show();
        final Button bt_okay=(Button)dialog.findViewById(R.id.bt_okay);
        edit_name=(EditText)dialog.findViewById(R.id.edit_name);
        bt_okay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context,"이름 변경이 완료되었습니다",Toast.LENGTH_SHORT).show();
                dialog.dismiss();
            }
        });
    }
}
