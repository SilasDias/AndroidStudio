package com.example.pedrapapeloutesouraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void selecionadoPedra(View view) {
//        Chama o metedo
        this.opcaoSelecionada("pedra");
    }

    public void selecionadoPapel(View view) {
        this.opcaoSelecionada("papel");
    }

    public void selecionadoTesoura(View view) {
        this.opcaoSelecionada("tesoura");
    }


    public void opcaoSelecionada(String opcaoUsuario) {
//        Pegando a imagem da views
        ImageView imagemResultado = findViewById(R.id.imageResultado);

//        Pegando frase de resultado
        TextView textoResultado = findViewById(R.id.textResultado);

        int number = new Random().nextInt(3); // 0,1,2
        String opcoes[] = {"pedra", "papel", "tesoura"};
        String opcaoApp = opcoes[number];

//        trocando imagem

        switch (opcaoApp) {
            case "pedra":
                imagemResultado.setImageResource(R.drawable.pedra);
                break;
            case "papel":
                imagemResultado.setImageResource(R.drawable.papel);
                break;
            case "tesoura":
                imagemResultado.setImageResource(R.drawable.tesoura);
                break;
        }

        if (
                (opcaoApp == "tesoura" && opcaoUsuario == "papel") ||
                (opcaoApp == "papel" && opcaoUsuario == "pedra") ||
                (opcaoApp == "pedra" && opcaoUsuario == "tesoura")
        ) { //app ganhador

            textoResultado.setText("Você perdeu :(");

        } else if (
                (opcaoUsuario == "tesoura" && opcaoApp== "papel") ||
                (opcaoUsuario== "papel" && opcaoApp== "pedra") ||
                (opcaoUsuario== "pedra" && opcaoApp== "tesoura")
        ) {// usuario ganhador

            textoResultado.setText("Você ganhou:)");

        } else {//empate

            textoResultado.setText("Empatamos ;)");

        }
    }


}
