package com.example.weatherdress; // Asegúrate de que este nombre coincida con el tuyo

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    private EditText editNombre;
    private RadioGroup grupoGenero;
    private Button btnEnviar;
    private Button btnReiniciar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // Esto carga el diseño de Claudia

        editNombre = findViewById(R.id.editNombre);
        grupoGenero = findViewById(R.id.radioGroupGenero);
        btnEnviar = findViewById(R.id.btnEnviar);
        btnReiniciar = findViewById(R.id.btnReiniciar);

        btnReiniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editNombre.setText("");
                grupoGenero.clearCheck();
            }
        });
        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nombreUsuario = editNombre.getText().toString();

                Intent intent = new Intent(MainActivity.this, ResultadoActivity.class);

                intent.putExtra("nombre", nombreUsuario);

                startActivity(intent);
            }
        });
    }
}
