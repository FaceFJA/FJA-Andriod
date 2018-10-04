package com.example.ty395.fja.Activity;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;

import com.example.ty395.fja.R;

public class StarDialog {
    Context context;
    public StarDialog(Context context){
        this.context=context;
    }
    public void Star(){
        final Dialog dialog=new Dialog(context);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.setContentView(R.layout.dialog_star);
        dialog.show();
        Button button=dialog.findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
                Toast.makeText(context,"별점 부여가 완료되었습니다.",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
