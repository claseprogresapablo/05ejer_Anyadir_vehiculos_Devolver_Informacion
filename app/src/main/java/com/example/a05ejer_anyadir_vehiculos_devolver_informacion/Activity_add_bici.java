package com.example.a05ejer_anyadir_vehiculos_devolver_informacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.a05ejer_anyadir_vehiculos_devolver_informacion.modelos.Bici;
import com.example.a05ejer_anyadir_vehiculos_devolver_informacion.modelos.Moto;

public class Activity_add_bici extends AppCompatActivity {

    private EditText txtMarca;
    private EditText txtPulgadas;
    private Button btnCancelar;
    private Button btnCrear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_bici);

        inicializarVistas();

        btnCrear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //crear BICI
                Bici bici = new Bici(
                        txtMarca.getText().toString(),
                        Float.parseFloat(txtPulgadas.getText().toString())

                );

                Intent intent = new Intent();
                Bundle bundle = new Bundle();
                bundle.putSerializable("BICI", bici);
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

    private void inicializarVistas() {

        txtMarca = findViewById(R.id.txtMarcaBici);
        txtPulgadas = findViewById(R.id.txtPulgadasBici);
        btnCrear = findViewById(R.id.btnCrearBici);
        btnCancelar = findViewById(R.id.btnCancelarBici);

    }
}