package com.example.ty395.fja.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ty395.fja.Activity.MainActivity;
import com.example.ty395.fja.Activity.PostnowActivity;
import com.example.ty395.fja.Adapter.RecyclerAdapter2;
import com.example.ty395.fja.Item.EvalationItem;
import com.example.ty395.fja.Item.Evalation_Recycleitem;
import com.example.ty395.fja.R;
import com.example.ty395.fja.Adapter.RecycleAdapter;

import java.util.ArrayList;

public class Fragment2 extends Fragment implements View.OnClickListener{
    RecyclerView recyclerView;
    RecyclerAdapter2 recycleAdapter;
    ArrayList<EvalationItem> itemlist=new ArrayList<>();
    public Fragment2(){}
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInsrtanceState){
        ViewGroup layout=(ViewGroup)inflater.inflate(R.layout.fragment_2,container,false);
        recyclerView=(RecyclerView) layout.findViewById(R.id.recycler);
        itemlist.clear();
        CardView cardView=layout.findViewById(R.id.item1);
        cardView.setOnClickListener(this);
        recyclerView.setHasFixedSize(true);
        recycleAdapter=new RecyclerAdapter2(getActivity(),itemlist);
        recyclerView.setAdapter(recycleAdapter);
        itemlist.add(new EvalationItem(R.drawable.person6,"제 옷 이쁘죠??","오늘 5000원에 득템!! 여러분은 혹시 혜자로 사신 옷 없나요??"));
        itemlist.add(new EvalationItem(R.drawable.person7,"혹시 여러분은 어떤 스타일의 옷을 입으시나요??","저는 후리한 스타일을 즐겨입어요"));
        itemlist.add(new EvalationItem(R.drawable.person8,"여러분 최고의 데이트룩은 모라고 생각하세요??","저는 베이직한게 더 좋은거 같아요"));
        itemlist.add(new EvalationItem(R.drawable.person9,"자신의 여행룩 이야기하기","이 옷은 저의 여행룩입니다! 여러분들의 여행룩 이야기 해주셔요"));
        return layout;
    }

    @Override
    public void onClick(View v) {
        Intent intent=new Intent(getActivity(), PostnowActivity.class);
        startActivity(intent);
    }
}
