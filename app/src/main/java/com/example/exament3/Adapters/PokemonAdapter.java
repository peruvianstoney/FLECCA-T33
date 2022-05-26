package com.example.exament3.Adapters;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.exament3.R;
import com.example.exament3.Servicios.DetallePokemonActivity;
import com.example.exament3.Servicios.FormPokemonActivity;
import com.example.exament3.Servicios.Pokemon;
import com.squareup.picasso.Picasso;

import java.util.List;

public class PokemonAdapter extends RecyclerView.Adapter<PokemonAdapter.PokemonViewHolder> {



    List<Pokemon> pokemons;

    private Context context;

    public PokemonAdapter(List<Pokemon> pokemons, Context context){
        this.pokemons =pokemons;
        this.context=context;
    }
        public int contador = 1;


        int [] datosImg;


        public  PokemonAdapter(List<Pokemon>pokemon){
            this.pokemons = pokemon;
        }


    @NonNull
    @Override
    public PokemonAdapter.PokemonViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_pokemon_adapter,parent,false);

            return new PokemonViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PokemonViewHolder holder, int position) {

            View view = holder.itemView;
            Pokemon pokemon = pokemons.get(position);


        TextView textViewNombre = view.findViewById(R.id.tvNombre);
        TextView textViewTipo = view.findViewById(R.id.tvTipo);
        ImageView imageViewImagen = view.findViewById(R.id.imgView);



        textViewNombre.setText(pokemon.getNombre());
        textViewTipo.setText(pokemon.getTipo());

        Picasso.get().load(pokemon.getUrl_imagen()).into(imageViewImagen);


        Button butonDetalle =view.findViewById(R.id.btnDetallePokemon);
        butonDetalle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentdetalle = new Intent(context.getApplicationContext() , DetallePokemonActivity.class);
                context.startActivity(intentdetalle);
            }
        });


       // Button butonDetalle =view.findViewById(R.id.btnDetallePokemon);
      //  Intent intentDetalle = new Intent(context.getApplicationContext(), DetallePokemonActivity.class);
        //context.startActivity(intentDetalle);

        // Enviar los datos de cada uno para el detalle
       // Bundle bundle = new Bundle();
       // bundle.putSerializable("Pokemno", pokemon);






    }

    @Override
    public int getItemCount() {
        return pokemons.size();
    }

    public class PokemonViewHolder extends RecyclerView.ViewHolder {

            public PokemonViewHolder(View itemView) {
                super(itemView);
            }
    }



}
