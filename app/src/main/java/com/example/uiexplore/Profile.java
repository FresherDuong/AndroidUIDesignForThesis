package com.example.uiexplore;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;

import java.util.Objects;

public class Profile extends AppCompatActivity {
    CardView cvRollCall, cvTimeTable, cvClassroom, cvLogOut, cvSearch, cvSync;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        Window window = Profile.this.getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        window.setStatusBarColor(ContextCompat.getColor(Profile.this, R.color.profilePage));

        Objects.requireNonNull(getSupportActionBar()).hide();
//        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);

        cvRollCall = findViewById(R.id.cv_roll_call);
        cvRollCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Profile.this, FaceConfirm.class);
                startActivity(intent);
            }
        });

        cvTimeTable = findViewById(R.id.cv_time_table);
        cvTimeTable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Profile.this, TimeTable.class);
                startActivity(intent);
            }
        });

        cvClassroom = findViewById(R.id.cv_classroom);
        cvClassroom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Profile.this, Classroom.class);
                startActivity(intent);
            }
        });

        cvLogOut = findViewById(R.id.cv_log_out);
        cvLogOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        cvSearch = findViewById(R.id.cv_search);
        cvSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Profile.this, Search.class);
                startActivity(intent);
            }
        });

        cvSync = findViewById(R.id.cv_sync);
        cvSync.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Profile.this, "Syncing...", Toast.LENGTH_SHORT).show();
            }
        });
    }
}