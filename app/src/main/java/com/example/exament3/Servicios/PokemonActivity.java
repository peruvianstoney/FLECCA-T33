package com.example.exament3.Servicios;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.exament3.Adapters.PokemonAdapter;
import com.example.exament3.R;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class PokemonActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pokemon);





        // Vinculamos la actividad de PokemonActivity

        RecyclerView rv = findViewById(R.id.rvPokemon);
        rv.setLayoutManager(new LinearLayoutManager(PokemonActivity.this));
        List<Pokemon>pokemons = GetPokemons();
        PokemonAdapter pokemonAdapter = new PokemonAdapter(pokemons);
        rv.setAdapter(pokemonAdapter);


        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://mockapi.io/clone/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        PokemonService service = retrofit.create(PokemonService.class);
        service.all().enqueue(new Callback<List<Pokemon>>() {
            @Override
            public void onResponse(Call<List<Pokemon>> call, Response<List<Pokemon>> response) {


            }

            @Override
            public void onFailure(Call<List<Pokemon>> call, Throwable t) {

            }
        });




    }




    private List<Pokemon> GetPokemons(){

        List<Pokemon> pokemons = new ArrayList<>();
        pokemons.add(new Pokemon("Armadillosour","Tipo: agua","https://assets.pokemon.com/assets/cms2/img/pokedex/detail/004.png",-7.160593,-78.521711 ));
        pokemons.add(new Pokemon("Purple Punch","Tipo: Tierra","https://assets.pokemon.com/assets/cms2/img/pokedex/detail/008.png",1,1 ));
        pokemons.add(new Pokemon("Demons Breath","Tipo: Fuego","https://assets.pokemon.com/assets/cms2/img/pokedex/detail/012.png",-7.160593,-78.5217119 ));
        pokemons.add(new Pokemon("Honey Haze","Tipo: Agua","https://assets.pokemon.com/assets/cms2/img/pokedex/detail/015.png",-7.160593,-78.5217119 ));
        pokemons.add(new Pokemon("Stardust Funk","Tipo: Fuego","https://assets.pokemon.com/assets/cms2/img/pokedex/detail/018.png",-7.160593,-78.5217119 ));
        pokemons.add(new Pokemon("Lemon IPA","Tipo: Tierra","https://assets.pokemon.com/assets/cms2/img/pokedex/detail/020.png",-7.160593,-78.5217119 ));
        return pokemons;
    }



}