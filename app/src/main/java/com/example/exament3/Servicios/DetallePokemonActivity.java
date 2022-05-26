package com.example.exament3.Servicios;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.exament3.R;

import org.w3c.dom.Text;

public class DetallePokemonActivity extends AppCompatActivity {

    TextView nombreDetalle, tipoDetalle;
    ImageView ImagenDetalle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_pokemon);


        nombreDetalle = (TextView) findViewById(R.id.tvNombre);
        tipoDetalle =(TextView) findViewById(R.id.tvTipo);
        ImagenDetalle = (ImageView) findViewById(R.id.imgView);


    }
}