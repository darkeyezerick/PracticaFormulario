package com.example.a3y3zzerick.practicaformularioerick;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivityPantalla2Erick extends AppCompatActivity {

    Button btnVolver;
    Button btnAceptar;
    TextView RecibirNombre;
    TextView RecibirDireccion;
    TextView RecibirTelefono;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_pantalla2_erick);

        btnVolver = (Button)findViewById(R.id.btnPantalla1);
        btnAceptar = (Button)findViewById(R.id.btnBienvenido3);


        RecibirNombre = (TextView)findViewById(R.id.RecibirNombre);
        RecibirDireccion = (TextView)findViewById(R.id.RecibirDireccion);
        RecibirTelefono = (TextView)findViewById(R.id.RecibirTelefono);

        Bundle bundle = getIntent().getExtras();

        String dato = bundle.getString("Infoo").toString();
        RecibirNombre.setText(dato);
        RecibirDireccion.setText(dato);
        RecibirTelefono.setText(dato);

        btnAceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivityPantalla2Erick.this, MainActivityPantalla3Erick.class);
                startActivity(intent);
            }
        });

        btnVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent volver1 = new Intent(MainActivityPantalla2Erick.this, MainActivityPantalla1Erick.class);
                startActivity(volver1);
            }
        });




    }
}
