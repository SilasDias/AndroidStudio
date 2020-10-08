package com.example.modificadores;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Conta conta = new Conta();
        conta.depositar(100);
        conta.sacar(50);

        System.out.println(conta.getSaldo());
    }
}
