package com.example.ex1evunaxgonzalez;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


//En esta pantalla simplemente damos la bienvenida
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //incializando boton y pantalla
        setContentView(R.layout.activity_main);
        Button iniciar = (Button) findViewById(R.id.buttonIniciarApp);

        //un boton escucha para pasar al usuario a la siguiente panatalla
        iniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent cambioPantalla = new Intent(MainActivity.this, PantallaPrincipalActivity.class);
                //la siguiente pagina pide la variable de la puntuacion a los comits de otras paginas, por lo cual se las envio
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