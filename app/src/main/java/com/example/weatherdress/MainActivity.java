package com.example.weatherdress; // Asegúrate de que este nombre coincida con el tuyo

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    // 1. LAS VARIABLES VAN AQUÍ: Justo debajo de "public class..." y antes de "onCreate"
    private EditText editNombre;
    private RadioGroup grupoGenero;
    private Button btnEnviar;
    private Button btnReiniciar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // Esto carga el diseño de Claudia

        // 2. EL ENLACE VA AQUÍ: Dentro del "onCreate", debajo de "setContentView"
        editNombre = findViewById(R.id.editNombre);
        grupoGenero = findViewById(R.id.radioGroupGenero);
        btnEnviar = findViewById(R.id.btnEnviar);
        btnReiniciar = findViewById(R.id.btnReiniciar);

        // 3. LA LÓGICA DEL BOTÓN VA AQUÍ: También dentro del "onCreate"
        btnReiniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Borra el texto
                editNombre.setText("");
                // Quita la selección de Masculino/Femenino
                grupoGenero.clearCheck();
            }
        });
    }
}
