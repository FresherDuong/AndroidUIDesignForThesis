package com.example.uiexplore;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import java.util.ArrayList;
import java.util.Objects;

public class Classroom extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_classroom);

        Objects.requireNonNull(getSupportActionBar()).hide();

        Window window = Classroom.this.getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        window.setStatusBarColor(ContextCompat.getColor(Classroom.this, R.color.niceGreen));

        RecyclerView timeTable = (RecyclerView) findViewById(R.id.rvClassroom);

        ArrayList<TimeTableData> timeTableData = new ArrayList<>();
        timeTableData.add(new TimeTableData("laixe01", 33));
        timeTableData.add(new TimeTableData("laixe02", 31));
        timeTableData.add(new TimeTableData("laixe03", 72));
        timeTableData.add(new TimeTableData("laixe04", 13));
        timeTableData.add(new TimeTableData("laixe05", 15));
        timeTableData.add(new TimeTableData("laixe06", 71));
        timeTableData.add(new TimeTableData("laixe07", 12));


        ClassroomAdapter timeTableAdapter = new ClassroomAdapter(timeTableData, Classroom.this);
        timeTable.setLayoutManager(new LinearLayoutManager(this));
        timeTable.setAdapter(timeTableAdapter);
    }
}