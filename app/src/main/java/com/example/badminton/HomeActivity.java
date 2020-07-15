package com.example.badminton;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {

    EditText etUsername;
    EditText etPassword;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etUsername = findViewById(R.id.et_username);
        etPassword = findViewById(R.id.et_password);
        btnLogin = findViewById(R.id.btn_login);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               initUsername();
            }
        });
    }

    private void initUsername() {
        if (etUsername.getText().toString().isEmpty() || etPassword.getText().toString().isEmpty()) {
            Toast.makeText(getApplicationContext(), "Not Valid", Toast.LENGTH_SHORT).show();
        } else {
            Intent pindahHalaman = new Intent(this, SecondActivity.class);
            pindahHalaman.putExtra("username", etUsername.getText().toString());
//            pindahHalaman.putExtra("password", etPassword.getText().toString());
            startActivity(pindahHalaman);
            Toast.makeText(getApplicationContext(), "Username valid", Toast.LENGTH_SHORT).show();
        }
    }
}