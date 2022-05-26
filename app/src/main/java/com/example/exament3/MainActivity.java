package com.example.exament3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.exament3.Servicios.DetallePokemonActivity;
import com.example.exament3.Servicios.FormPokemonActivity;
import com.example.exament3.Servicios.PokemonActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Pasar a pantalla Mis Pokemons
        Button botonMisPokemons = findViewById(R.id.btnMisPokemons);
        botonMisPokemons.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(), PokemonActivity.class);
                startActivity(intent);
            }
        });

        //Pasar a la pantalla Capturar Pokemons

        Button botonCapturar = findViewById(R.id.btnCapturarPokemons);
        botonCapturar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentCaputar = new Intent(getApplicationContext(), FormPokemonActivity.class);
                startActivity(intentCaputar);
            }
        });




    }
}