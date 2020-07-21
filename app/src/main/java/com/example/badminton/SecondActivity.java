package com.example.badminton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView textviewUsername;
    String getUsername;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        getUsername = getIntent().getStringExtra("username");

        textviewUsername = findViewById(R.id.tv_username);

        textviewUsername.setText(getUsername);
    }

}