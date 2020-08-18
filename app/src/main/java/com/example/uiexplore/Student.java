package com.example.uiexplore;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Objects;

public class Student extends AppCompatActivity {
    TextView txtTenLop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student);

        Objects.requireNonNull(getSupportActionBar()).hide();

        Window window = Student.this.getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        window.setStatusBarColor(ContextCompat.getColor(Student.this, R.color.niceGreen));

        RecyclerView timeTable = (RecyclerView) findViewById(R.id.rvStudent);
        txtTenLop = findViewById(R.id.txtTenLop);

        ArrayList<TimeTableData> timeTableData = new ArrayList<>();
        timeTableData.add(new TimeTableData("Dư Đình Dương", 33));
        timeTableData.add(new TimeTableData("Lã Đắc Hiếu", 31));
        timeTableData.add(new TimeTableData("Phạm Thị Nga", 72));
        timeTableData.add(new TimeTableData("Phạm Minh Hiếu", 13));
        timeTableData.add(new TimeTableData("Hà Bạch Ngân", 15));
        timeTableData.add(new TimeTableData("Nguyễn Bảo Ngọc", 71));
        timeTableData.add(new TimeTableData("Hoàng Thị Trà My", 12));


        StudentAdapter timeTableAdapter = new StudentAdapter(timeTableData, Student.this);
        timeTable.setLayoutManager(new LinearLayoutManager(this));
        timeTable.setAdapter(timeTableAdapter);
    }

    @Override
    protected void onResume() {
        super.onResume();

        Intent intent = getIntent();
        String className = intent.getStringExtra("className");

        txtTenLop.setText(className);
    }
}