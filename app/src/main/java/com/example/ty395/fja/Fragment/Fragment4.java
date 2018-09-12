package com.example.ty395.fja.Fragment;

import android.content.Intent;
import android.support.constraint.ConstraintLayout;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import com.example.ty395.fja.Activity.NameChange;
import com.example.ty395.fja.R;

public class Fragment4 extends Fragment implements View.OnClickListener{
    public Fragment4(){}
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInsrtanceState){
        LinearLayout layout =(LinearLayout) inflater.inflate(R.layout.fragment_4,container,false);
        Button bt_name_check=layout.findViewById(R.id.bt_name_check);
        bt_name_check.setOnClickListener(this);
        return layout;
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(getActivity(), NameChange.class);
        startActivity(intent);
    }
}
