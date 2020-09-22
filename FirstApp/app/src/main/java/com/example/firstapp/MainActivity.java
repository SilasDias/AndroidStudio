package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void alterarTexto(View view){
        // referencia do textView açao para textoExibicao
        TextView texto = findViewById(R.id.textoExibicao1);
        // Trocar o texto
        texto.setText("Aqui não");

    }
}
