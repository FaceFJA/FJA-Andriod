package com.example.ty395.fja.Fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.annotation.Nullable;
import android.support.constraint.ConstraintLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CalendarView;
import android.widget.LinearLayout;

import com.example.ty395.fja.Activity.Choose_Date_Dialog;
import com.example.ty395.fja.R;

public class Fragment3 extends Fragment {
    public Fragment3(){}
    CalendarView calendarView;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInsrtanceState) {
        LinearLayout layout = (LinearLayout) inflater.inflate(R.layout.fragment_3, container, false);
        CalendarView calendarView = layout.findViewById(R.id.calendar);
        calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView view, int year, int month, int dayOfMonth) {
                Choose_Date_Dialog choose_date_dialog=new Choose_Date_Dialog(getActivity());
                choose_date_dialog.Date();
            }
        });
        return layout;
    }
}
