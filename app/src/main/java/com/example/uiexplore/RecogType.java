package com.example.uiexplore;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import java.util.Objects;

public class RecogType extends AppCompatActivity {
    View vCheckIn, vCheckOut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recog_type);

        Objects.requireNonNull(getSupportActionBar()).hide();

        Window window = RecogType.this.getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        window.setStatusBarColor(ContextCompat.getColor(RecogType.this, R.color.blurWhite));

        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);

        vCheckIn = findViewById(R.id.viewLoginAccount);
        vCheckOut = findViewById(R.id.viewLoginFace);

        vCheckIn.setOnClickListener(view -> {
            Intent intent = new Intent(RecogType.this, FaceCheckInConfirm.class);
            startActivity(intent);
        });

        vCheckOut.setOnClickListener(view -> {
            Intent intent = new Intent(RecogType.this, FaceCheckOutConfirm.class);
            startActivity(intent);
        });
    }
}