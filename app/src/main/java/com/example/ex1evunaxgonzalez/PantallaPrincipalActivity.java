package com.example.ex1evunaxgonzalez;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class PantallaPrincipalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pantalla_principal);

        Bundle bundle = getIntent().getExtras();
        int puntBar = bundle.getInt("puntBar");
        int puntBil = bundle.getInt("puntBil");
        int puntGra = bundle.getInt("puntGra");
        int puntMad = bundle.getInt("puntMad");

        ImageView barcelona = (ImageView) findViewById(R.id.imageViewBarcelona);
        ImageView bilbao = (ImageView) findViewById(R.id.imageViewBilbao);
        ImageView granada = (ImageView) findViewById(R.id.imageViewGranada);
        ImageView madrid = (ImageView) findViewById(R.id.imageViewMadrid);

        TextView puntuacionBarcelona =(TextView) findViewById(R.id.puntuacionBarcelona );
        TextView puntuacionBilbao=(TextView) findViewById(R.id.puntuacionBilbao );
        TextView puntuacionGranada =(TextView) findViewById(R.id.puntuacionGranada );
        TextView puntuacionMadrid =(TextView) findViewById(R.id.puntuacionMadrid );

        puntuacionBarcelona.setText("Puntuacion: "+puntBar);
        puntuacionBilbao.setText("Puntuacion: "+puntBil);
        puntuacionGranada.setText("Puntuacion: "+puntGra);
        puntuacionMadrid.setText("Puntuacion: "+puntMad);

        barcelona.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cambioPantalla = new Intent(PantallaPrincipalActivity.this, ActivityDescripcion.class);
                String ciudad = "barcelona";
                cambioPantalla.putExtra("ciudad", ciudad);
                cambioPantalla.putExtra("puntBar", puntBar);
                cambioPantalla.putExtra("puntBil", puntBil);
                cambioPantalla.putExtra("puntGra", puntGra);
                cambioPantalla.putExtra("puntMad", puntMad);
                startActivity(cambioPantalla);
            }
        });


        bilbao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cambioPantalla = new Intent(PantallaPrincipalActivity.this, ActivityDescripcion.class);
                String ciudad = "bilbao";
                cambioPantalla.putExtra("ciudad", ciudad);
                cambioPantalla.putExtra("puntBar", puntBar);
                cambioPantalla.putExtra("puntBil", puntBil);
                cambioPantalla.putExtra("puntGra", puntGra);
                cambioPantalla.putExtra("puntMad", puntMad);
                startActivity(cambioPantalla);
            }

        });

        granada.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cambioPantalla = new Intent(PantallaPrincipalActivity.this, ActivityDescripcion.class);
                String ciudad = "granada";
                cambioPantalla.putExtra("ciudad", ciudad);
                cambioPantalla.putExtra("puntBar", puntBar);
                cambioPantalla.putExtra("puntBil", puntBil);
                cambioPantalla.putExtra("puntGra", puntGra);
                cambioPantalla.putExtra("puntMad", puntMad);
                startActivity(cambioPantalla);
            }

        });

        madrid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cambioPantalla = new Intent(PantallaPrincipalActivity.this, ActivityDescripcion.class);
                String ciudad = "madrid";
                cambioPantalla.putExtra("ciudad", ciudad);
                cambioPantalla.putExtra("puntBar", puntBar);
                cambioPantalla.putExtra("puntBil", puntBil);
                cambioPantalla.putExtra("puntGra", puntGra);
                cambioPantalla.putExtra("puntMad", puntMad);
                startActivity(cambioPantalla);
            }

        });
    }
}
