package com.example.uiexplore;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import java.util.Objects;

public class Login extends AppCompatActivity {
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Objects.requireNonNull(getSupportActionBar()).hide();
        Window window = Login.this.getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        window.setStatusBarColor(ContextCompat.getColor(Login.this, R.color.login));

        btnLogin = findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(view -> {
            MyCustomDialog loadingSpinner = new MyCustomDialog(Login.this, "Xác thực tài khoản...");
            loadingSpinner.startLoadingDialog();

            new Handler(Looper.getMainLooper()).postDelayed(() -> {
                loadingSpinner.dismissDialog();
                Intent intent = new Intent(Login.this, Profile.class);
                startActivity(intent);
                finish();
            }, 4000);
        });
    }
}