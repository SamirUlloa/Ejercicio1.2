package com.example.ejercicio12;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button=(Button) findViewById(R.id.btnEnviar);

        final EditText nombres=(EditText) findViewById(R.id.txtNombres);
        final EditText apellidos=(EditText) findViewById(R.id.txtApellidos);
        final EditText edad=(EditText) findViewById(R.id.txtEdad);
        final EditText correo=(EditText) findViewById(R.id.txtCorreo);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), SegundaActivity.class);
                intent.putExtra("nombres", nombres.getText().toString());
                intent.putExtra("apellidos", apellidos.getText().toString());
                intent.putExtra("edad", edad.getText().toString());
                intent.putExtra("correo", correo.getText().toString());
                startActivity(intent);
            }
        });
    }
}