package com.example.caraoucoroaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ResultadoActivity extends AppCompatActivity {

    private Button buttonVoltar;
    private ImageView imageResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        buttonVoltar = findViewById(R.id.buttonVoltar);
        imageResultado = findViewById(R.id.imageResultado);

        buttonVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                finish();
/*                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);*/

            }
        });

//      Recuperando os dados
        Bundle dados = getIntent().getExtras();
        int number = dados.getInt("numero");

        if (number == 0){ //cara
            imageResultado.setImageResource(R.drawable.moeda_cara);

        }else { //coroa
            imageResultado.setImageResource(R.drawable.moeda_coroa);

        }

    }
}
