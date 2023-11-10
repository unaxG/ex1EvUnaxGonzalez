package com.example.ex1evunaxgonzalez;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ActivityDescripcion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_descripcion);

        //inicializacion de varibles
        Bundle bundle = getIntent().getExtras();
        String ciudad = bundle.getString("ciudad");
        int puntBar = bundle.getInt("puntBar");
        int puntBil = bundle.getInt("puntBil");
        int puntGra = bundle.getInt("puntGra");
        int puntMad = bundle.getInt("puntMad");

        Button volver = (Button) findViewById(R.id.buttonVolver);
        Button volverYFavorito = (Button) findViewById(R.id.buttonFavYVolver);

        TextView titulo = (TextView) findViewById(R.id.textViewTituloCiudad);
        ImageView imagen = (ImageView) findViewById(R.id.imageViewCiudad);
        TextView puntuacion = (TextView) findViewById(R.id.textViewPuntuacionCiudad);
        TextView descripcion = (TextView) findViewById(R.id.textViewDescripcionCiudad);

        //nombre de la ciudad
        titulo.setText(ciudad);

        //ifs que dictaminan que imagen, puntuacion y descripcion poner
        if(ciudad.equals("barcelona")){
            imagen.setImageResource(R.drawable.barcelona);
            titulo.setText("Barcelona");
            descripcion.setText("Barcelona es una ciudad española, capital de la comunidad autónoma de Cataluña, " +
                    "de la provincia homónima y de la comarca del Barcelonés. Con una población de 1 636 193 habitantes " +
                    "en 2022, es la segunda ciudad más poblada de España y de la península ibérica después de" +
                    " Madrid, y la décima de la Unión Europea. El área metropolitana de Barcelona tiene 5 575 204 " +
                    "habitantes (2019), siendo así la quinta aglomeración urbana de mayor población de la Unión " +
                    "Europea.");
            puntuacion.setText("Puntuacion: "+puntBar);
        }

        if(ciudad.equals("bilbao")){
            imagen.setImageResource(R.drawable.bilbao);
            titulo.setText("Bilbao");
            descripcion.setText("Bilbao (en euskera: Bilbo) es un municipio situado en el norte " +
                    "de España y una villa de dicho municipio, capital de la provincia y territorio histórico de " +
                    "Vizcaya, en la comunidad autónoma del País Vasco. La villa de Bilbao es la capital y única " +
                    "localidad del municipio, y con 346 843 habitantes según el padrón de 2019, es la urbe" +
                    " más poblada de la comunidad autónoma, siendo la cabecera del área metropolitana de Bilbao, una " +
                    "conurbación de más de 1 000 000 de habitantes que se extiende a lo largo de la ría de " +
                    "Bilbao o del Nervión.");
            puntuacion.setText("Puntuacion: "+puntBil);
        }

        if(ciudad.equals("granada")){
            imagen.setImageResource(R.drawable.granada);
            titulo.setText("Granada");
            descripcion.setText("Granada es una ciudad y municipio español, capital de la provincia homónima, " +
                    "en la comunidad autónoma de Andalucía. Está situada en la parte central de la comarca de " +
                    "la Vega de Granada, a una altitud de 680 m s. n. m., en una amplia depresión intrabética " +
                    "formada por el río Genil y por el piedemonte del macizo más alto de la península ibérica, " +
                    "Sierra Nevada, que condiciona su clima.");
            puntuacion.setText("Puntuacion: "+puntGra);
        }

        if(ciudad.equals("madrid")){
            imagen.setImageResource(R.drawable.madrid);
            titulo.setText("Madrid");
            descripcion.setText("Madrid es un municipio y una ciudad de España. La localidad, con categoría " +
                    "histórica de villa, es la capital del Estado y de la Comunidad de Madrid. " +
                    "En su término municipal, el más poblado de España, están empadronadas 3 280 782 personas " +
                    "(INE 2022), constituyéndose como la segunda ciudad más poblada de la Unión Europea, así " +
                    "como su área metropolitana, con 6 779 888 habitantes empadronados.");
            puntuacion.setText("Puntuacion: "+puntMad);


        }


        //listener volver, tan solo devuelve a la pagina anterior
        volver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cambioPantalla = new Intent(ActivityDescripcion.this, PantallaPrincipalActivity.class);
                cambioPantalla.putExtra("puntBar", puntBar);
                cambioPantalla.putExtra("puntBil", puntBil);
                cambioPantalla.putExtra("puntGra", puntGra);
                cambioPantalla.putExtra("puntMad", puntMad);
                startActivity(cambioPantalla);
            }
        });

        //listener para volver y añadir 1 al contador de la puntuacion de la ciudad
        volverYFavorito.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



                Intent cambioPantalla = new Intent(ActivityDescripcion.this, PantallaPrincipalActivity.class);

                if(ciudad.equals("barcelona")){
                    cambioPantalla.putExtra("puntBar", puntBar+1);
                }else{
                    cambioPantalla.putExtra("puntBar", puntBar);
                }

                if(ciudad.equals("bilbao")){
                    cambioPantalla.putExtra("puntBil", puntBil+1);
                }else{
                    cambioPantalla.putExtra("puntBil", puntBil);
                }

                if(ciudad.equals("granada")){
                    cambioPantalla.putExtra("puntGra", puntGra+1);
                }else{
                    cambioPantalla.putExtra("puntGra", puntGra);
                }

                if(ciudad.equals("madrid")){
                    cambioPantalla.putExtra("puntMad", puntMad+1);
                }else{
                    cambioPantalla.putExtra("puntMad", puntMad);
                }

                startActivity(cambioPantalla);
            }
        });



    }
}