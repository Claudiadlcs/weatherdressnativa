package com.example.weatherdress;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ResultadoActivity extends AppCompatActivity {

    private TextView textoResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        textoResultado = findViewById(R.id.textViewResultado);

        Intent intent = getIntent();
        String nombreRecibido = intent.getStringExtra("nombre");

        if (nombreRecibido != null) {
            textoResultado.setText(nombreRecibido);
        }
    }
}