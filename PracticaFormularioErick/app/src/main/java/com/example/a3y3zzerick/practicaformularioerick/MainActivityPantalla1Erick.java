package com.example.a3y3zzerick.practicaformularioerick;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivityPantalla1Erick extends AppCompatActivity {

    Button btnSgte;
    EditText NombreEnviar;
    EditText DireccionEnviar;
    EditText TelefonoEnviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_pantalla1_erick);

            NombreEnviar = (EditText)findViewById(R.id.NombreEnviar);
            DireccionEnviar =(EditText)findViewById(R.id.DireccionEnviar);
            TelefonoEnviar = (EditText)findViewById(R.id.TelefonoEnviar);

            btnSgte = (Button)findViewById(R.id.btnPantalla2);
            btnSgte.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v){
                    Intent intent = new Intent(MainActivityPantalla1Erick.this, MainActivityPantalla2Erick.class);
                    intent.putExtra("Info", NombreEnviar.getText().toString());
                    intent.putExtra("Info", DireccionEnviar.getText().toString());
                    intent.putExtra("Info", TelefonoEnviar.getText().toString());
                    startActivity(intent);
                }

            });

    }
}
