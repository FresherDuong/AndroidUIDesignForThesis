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

public class FaceConfirmLogin extends AppCompatActivity {
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_face_confirm_login);

        Objects.requireNonNull(getSupportActionBar()).hide();

        Window window = FaceConfirmLogin.this.getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        window.setStatusBarColor(ContextCompat.getColor(FaceConfirmLogin.this, R.color.b4StartGra));

        btnLogin = findViewById(R.id.btn_login_face);

        btnLogin.setOnClickListener(view -> {
            Intent intent = new Intent(FaceConfirmLogin.this, Profile.class);
            startActivity(intent);
        });
    }
}