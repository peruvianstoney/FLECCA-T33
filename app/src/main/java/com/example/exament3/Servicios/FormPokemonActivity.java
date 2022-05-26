package com.example.exament3.Servicios;

import androidx.appcompat.app.AppCompatActivity;

import android.hardware.lights.LightsManager;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import com.example.exament3.R;

import java.util.List;

public class FormPokemonActivity extends AppCompatActivity {

    private ListView lista;
    List<String> items;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_pokemon);


        final EditText txtNombre = findViewById(R.id.edtNuevoNombre);
        final EditText txtTipo = findViewById(R.id.edtNuevoTipo);
        final EditText txtUrl = findViewById(R.id.edtNuevaImagen);
        final EditText txtlatitud= findViewById(R.id.edtNuevaLatiud);
        final EditText txtLongitud= findViewById(R.id.edtNuevaLongitud);
        final Button BtnAgregar = findViewById(R.id.btnGuardar);
        ArrayAdapter adapter;
        adapter = new ArrayAdapter(getApplicationContext(),  android.R.layout.simple_list_item_1,items);
        lista.setAdapter(adapter);

        BtnAgregar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                items.add(txtNombre.getText().toString());
                items.add(txtTipo.getText().toString());
                items.add(txtUrl.getText().toString());
                items.add(txtlatitud.getText().toString());
                items.add(txtLongitud.getText().toString());

                adapter.notifyDataSetChanged();
            }
        });
    }
}