package com.example.alke;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        EditText etEmail = findViewById(R.id.et_email);
        EditText etPass = findViewById(R.id.et_password);
        Button btnSubmit = findViewById(R.id.btn_login_submit);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = etEmail.getText().toString();

                if (email.isEmpty()) {
                    Toast.makeText(Login.this, "Por favor ingrese su correo", Toast.LENGTH_SHORT).show();
                } else {
                    // Si todo está "bien", vamos al Home
                    Intent intent = new Intent(Login.this, Home.class);
                    startActivity(intent);
                }
            }
        });
    }
}