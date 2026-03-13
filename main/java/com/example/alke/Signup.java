package com.example.alke;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class Signup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        Button btnSignup = findViewById(R.id.btnCrear);

        btnSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Aquí podrías agregar validaciones de "contraseñas iguales" más adelante
                Toast.makeText(Signup.this, "¡Cuenta creada con éxito!", Toast.LENGTH_SHORT).show();

                // Redirigir al Home
                Intent intent = new Intent(Signup.this, Home.class);
                startActivity(intent);
                finish(); // Cerramos esta pantalla para que no pueda volver al registro
            }
        });
    }
}