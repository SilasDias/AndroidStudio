package com.example.sorteio;

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

    public void sortNumber(View view){
        // referencia
        TextView text = findViewById(R.id.textResult);
        // numero randomico de 0 a 10
        int x = new Random().nextInt(11);
        // printa o numero
        text.setText("Numero selecionado: " + x);
    }
}

