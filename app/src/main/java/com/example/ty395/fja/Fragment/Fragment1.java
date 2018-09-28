package com.example.ty395.fja.Fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ty395.fja.Item.EvalationItem;
import com.example.ty395.fja.Item.Evalation_Recycleitem;
import com.example.ty395.fja.R;
import com.example.ty395.fja.Adapter.RecycleAdapter;

import java.util.ArrayList;

public class Fragment1 extends Fragment {
    RecyclerView recyclerView;
    RecycleAdapter recycleAdapter;
    ArrayList<Evalation_Recycleitem> itemlist=new ArrayList<>();
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInsrtanceState){
        ViewGroup layout=(ViewGroup)inflater.inflate(R.layout.fragment_1,container,false);
        Log.d("Fragment1", "onCreate is called");
        itemlist.clear();
        recyclerView=(RecyclerView) layout.findViewById(R.id.recycler);
        recyclerView.setHasFixedSize(true);
        recycleAdapter=new RecycleAdapter(getActivity(),itemlist);
        recyclerView.setAdapter(recycleAdapter);
        itemlist.add(new Evalation_Recycleitem(R.drawable.person1,"오늘은 어떤 옷을 입고 나가는게 좋을까요?","오늘 친구들과 같이 나가기로 하였는데 어떤 옷을 입어야 할지 고민이에요!"));
        itemlist.add(new Evalation_Recycleitem(R.drawable.person2,"제 옷 어때요??","이번에 새로산 제 옷 어떤가요?"));
        itemlist.add(new Evalation_Recycleitem(R.drawable.person3,"면접룩 확인","제 면접룩 괜찮은가요?"));
        itemlist.add(new Evalation_Recycleitem(R.drawable.person4,"친구들과 여행가기로 했어요!","신상옷을 구매했는데 어떤가요?"));
        return layout;
    }
}
