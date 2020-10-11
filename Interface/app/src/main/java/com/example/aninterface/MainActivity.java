package com.example.aninterface;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*
        ######INTERFACE#######
        * Pode-se dizer a grosso modo, que uma interface é um contrato
        * que quando assumido por uma classe, deve ser implementado.
        *
        * Interface é utilizada pois podemos ter muitos objetos (classes)
        * que podem possuir a mesma ação (métodos) porém, podem executa-los
        * de maneiras diferentes.
        */

        Obama obama = new Obama();
        obama.direitosDeveres();
    }
}
