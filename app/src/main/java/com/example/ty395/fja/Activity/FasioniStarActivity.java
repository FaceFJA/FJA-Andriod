package com.example.ty395.fja.Activity;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.CalendarView;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.ty395.fja.R;

public class FasioniStarActivity extends AppCompatActivity{
    CalendarView calendarView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_3);
        calendarView = findViewById(R.id.calendar);
        calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView view, int year, int month, int dayOfMonth) {
                Toast.makeText(getApplicationContext(), year + "/" + (month + 1) + "/" + dayOfMonth, Toast.LENGTH_SHORT).show();
                Choose_Date_Dialog choose_date_dialog = new Choose_Date_Dialog(FasioniStarActivity.this);
                choose_date_dialog.Date();
            }
        });
    }
}
