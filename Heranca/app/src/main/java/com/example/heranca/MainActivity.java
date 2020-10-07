package com.example.heranca;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

/*//        Instanciando classe Animal
        Animal animal = new Animal();
//        Chamando o metodo
        animal.correr();*/

//      Usando a classe cachorro com a herança da classe animal
        Cachorro cachorro = new Cachorro();
        cachorro.setCor("Caramelo");

        System.out.println(cachorro.getCor());

/*//        Usando a classe passaro com a herança da classe animal
        Passaro passaro = new Passaro();
        passaro.voar();*/

    }
}
