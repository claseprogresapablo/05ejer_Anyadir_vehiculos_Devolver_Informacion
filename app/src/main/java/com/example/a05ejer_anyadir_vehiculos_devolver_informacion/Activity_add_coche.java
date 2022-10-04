package com.example.a05ejer_anyadir_vehiculos_devolver_informacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.a05ejer_anyadir_vehiculos_devolver_informacion.modelos.Coche;

public class Activity_add_coche extends AppCompatActivity {

    private EditText txtMarca;
    private EditText txtModelo;
    private EditText txtColor;
    private Button btnCancelar;
    private Button btnCrear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_coche);

        inicializarVistar();
        btnCrear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //crear coche
                Coche coche = new Coche(
                        txtMarca.getText().toString(),
                        txtModelo.getText().toString(),
                        txtColor.getText().toString()
                );

                Intent intent = new Intent();
                Bundle bundle = new Bundle();
                bundle.putSerializable("CAR", coche);
                intent.putExtras(bundle);
                //devolver
                setResult(RESULT_OK,intent);
                finish();

            }
        });

        btnCancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });



    }

    private void inicializarVistar() {

        txtMarca = findViewById(R.id.txtMarcaCoche);
        txtModelo = findViewById(R.id.txtModeloCoche);
        txtColor = findViewById(R.id.txtColorCoche);
        btnCrear = findViewById(R.id.btnCrearCoche);
        btnCancelar = findViewById(R.id.btnCancelarCoche);
    }
}