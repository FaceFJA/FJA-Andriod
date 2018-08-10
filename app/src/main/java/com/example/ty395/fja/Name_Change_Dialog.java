package com.example.ty395.fja;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;

public class Name_Change_Dialog {
    private Context context;
    public Name_Change_Dialog(Context context){
        this.context=context;
    }
    void CallFunction(){
        final Dialog dialog=new Dialog(context);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.dialog_name_change);
        dialog.show();
        final Button bt_okay=(Button)dialog.findViewById(R.id.bt_okay);
        bt_okay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context,"이름 변경이 완료되었습니다",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
