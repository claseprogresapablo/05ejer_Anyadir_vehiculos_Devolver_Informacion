package com.example.a05ejer_anyadir_vehiculos_devolver_informacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.a05ejer_anyadir_vehiculos_devolver_informacion.modelos.Coche;
import com.example.a05ejer_anyadir_vehiculos_devolver_informacion.modelos.Moto;

public class Activity_add_moto extends AppCompatActivity {

    private EditText txtMarca;
    private EditText txtModelo;
    private EditText txtCC;
    private Button btnCancelar;
    private Button btnCrear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_moto);
        inicializarVistas();

        btnCrear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //crear moto
                Moto moto = new Moto(
                        txtMarca.getText().toString(),
                        txtModelo.getText().toString(),
                        Integer.parseInt(txtCC.getText().toString())
                );

                Intent intent = new Intent();
                Bundle bundle = new Bundle();
                bundle.putSerializable("MOTO", moto);
                intent.putExtras(bundle);
                //devolver
                setResult(RESULT_OK,intent);
                finish();

            }
        });

        btnCancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setResult(RESULT_CANCELED);
                finish();
            }
        });



    }

    private void inicializarVistas() {

        txtMarca = findViewById(R.id.txtMarcaMoto);
        txtModelo = findViewById(R.id.txtModeloMoto);
        txtCC = findViewById(R.id.txtCCMoto);
        btnCrear = findViewById(R.id.btnCrearMoto);
        btnCancelar = findViewById(R.id.btnCancelarMoto);
    }
}