package com.example.exament3.Servicios;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface PokemonService {

    @GET("628f75c90e69410599dcceff")
    Call<List<Pokemon>> all();

}
