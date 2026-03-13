package com.example.alke;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class RequestMoney extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_money);

        ImageView btnBack = findViewById(R.id.btnBackReq);
        Button btnConfirm = findViewById(R.id.btnSolicitar);
        EditText etAmount = findViewById(R.id.etMontoReq);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        btnConfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String monto = etAmount.getText().toString();

                if (!monto.isEmpty()) {
                    Toast.makeText(RequestMoney.this, "Has enviado $" + monto, Toast.LENGTH_LONG).show();
                    finish();
                } else {
                    Toast.makeText(RequestMoney.this, "Ingresa un monto", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}