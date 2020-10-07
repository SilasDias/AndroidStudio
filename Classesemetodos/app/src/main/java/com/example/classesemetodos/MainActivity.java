package com.example.classesemetodos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

/*//        instanciar uma classe
        Casa minhaCasa = new Casa();

//        usando o objeto minhaCasa e uma propriedade
        minhaCasa.cor = "Verde";

//        criando outro objeto da classe casa
        Casa minhaCasa1 = new Casa();
        minhaCasa1.cor = "Amarelo";

//        Exibindo a propriedade da classe
        System.out.printf(minhaCasa.cor);

//        Chamando o metodo da classe
        minhaCasa.abrirPorta();*/

//        CLASSE FUNCIONARIO

        Funcionario funcionario = new Funcionario();
        funcionario.name = "Silas Dias";
        funcionario.salary = 2800;

//        Chamando o metodo
        funcionario.recoveSalary();


    }
}
