package com.example.ty395.fja.Fragment;

import android.content.Intent;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.ty395.fja.Activity.Name_Change_Dialog;
import com.example.ty395.fja.R;

import java.net.URISyntaxException;

public class Fragment4 extends Fragment implements View.OnClickListener{
    public Fragment4(){}
    String name;
    TextView text_nickname;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInsrtanceState){
        LinearLayout layout =(LinearLayout) inflater.inflate(R.layout.fragment_4,container,false);
        LinearLayout layout_nickname=layout.findViewById(R.id.layout_nickname);
        layout_nickname.setOnClickListener(this);
        text_nickname=layout.findViewById(R.id.text_nickname);
        return layout;
    }

    @Override
    public void onClick(View v) {
        Name_Change_Dialog name_change_dialog= new Name_Change_Dialog(getActivity());
        name_change_dialog.CallFunction();
    }
}
