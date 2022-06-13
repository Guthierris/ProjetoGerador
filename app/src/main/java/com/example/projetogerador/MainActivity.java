package com.example.projetogerador;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sortear (View v){
        TextView texto = findViewById(R.id.TextoGerador);
        int numero = new Random().nextInt(10);

        texto.setText("Valor Gerado: "+numero);
    }


}