package com.example.uiexplore;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import java.util.Objects;

public class FaceCheckInConfirm extends AppCompatActivity {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_face_check_in_confirm);

        Objects.requireNonNull(getSupportActionBar()).hide();

        Window window = FaceCheckInConfirm.this.getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        window.setStatusBarColor(ContextCompat.getColor(FaceCheckInConfirm.this, R.color.btnBlue));

        button = findViewById(R.id.button4);
        button.setOnClickListener(view -> {
            Intent intent = new Intent(this, UnknownFace.class);
            startActivity(intent);
        });
    }
}