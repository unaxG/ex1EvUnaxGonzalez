package com.example.ex1evunaxgonzalez;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button iniciar = (Button) findViewById(R.id.buttonIniciarApp);

        iniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent cambioPantalla = new Intent(MainActivity.this, PantallaPrincipalActivity.class);
                int a = 0;
                cambioPantalla.putExtra("puntBar", a);
                cambioPantalla.putExtra("puntBil", a);
                cambioPantalla.putExtra("puntGra", a);
                cambioPantalla.putExtra("puntMad", a);
                startActivity(cambioPantalla);

            }

        });

    }
}