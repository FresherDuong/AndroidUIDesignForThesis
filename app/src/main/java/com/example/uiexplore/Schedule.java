package com.example.uiexplore;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import java.util.ArrayList;
import java.util.Objects;

public class Schedule extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schedule);

        Objects.requireNonNull(getSupportActionBar()).hide();

        Window window = Schedule.this.getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        window.setStatusBarColor(ContextCompat.getColor(Schedule.this, R.color.timeTableColor));

        RecyclerView timeTable = (RecyclerView) findViewById(R.id.rvSchedule);

        ArrayList<ScheduleData> scheduleData = new ArrayList<>();
        scheduleData.add(new ScheduleData("laixe01", "8AM - 10AM"));
        scheduleData.add(new ScheduleData("laixe01", "8AM - 10AM"));
        scheduleData.add(new ScheduleData("laixe01", "8AM - 10AM"));
        scheduleData.add(new ScheduleData("laixe01", "8AM - 10AM"));
        scheduleData.add(new ScheduleData("laixe01", "8AM - 10AM"));
        scheduleData.add(new ScheduleData("laixe01", "8AM - 10AM"));
        scheduleData.add(new ScheduleData("laixe01", "8AM - 10AM"));
        scheduleData.add(new ScheduleData("laixe01", "8AM - 10AM"));
        scheduleData.add(new ScheduleData("laixe01", "8AM - 10AM"));
        


        ScheduleAdapter timeTableAdapter = new ScheduleAdapter(scheduleData);
        timeTable.setLayoutManager(new LinearLayoutManager(this));
        timeTable.setAdapter(timeTableAdapter);
    }
}