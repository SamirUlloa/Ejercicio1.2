package com.example.ejercicio12;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SegundaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        TextView nombres = (TextView) findViewById(R.id.SAtxtNombres);
        TextView apellidos = (TextView) findViewById(R.id.SAtxtApellidos);
        TextView edad = (TextView) findViewById(R.id.SAtxtEdad);
        TextView correo = (TextView) findViewById(R.id.SAtxtCorreo);
        Intent intent = getIntent();
        nombres.setText(intent.getStringExtra("nombres"));
        apellidos.setText(intent.getStringExtra("apellidos"));
        edad.setText(intent.getStringExtra("edad"));
        correo.setText(intent.getStringExtra("correo"));
    }
}