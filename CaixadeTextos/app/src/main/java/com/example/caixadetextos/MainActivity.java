package com.example.caixadetextos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {
//    Criando um atributo para ser acessado em outros metodos
    private EditText campoNome;
    private TextInputEditText campoEmail;
    private TextView textoResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        Capturando evento do tipo EditText nome
        campoNome = findViewById(R.id.editNome);
        campoEmail = findViewById(R.id.editEmail);
        textoResultado = findViewById(R.id.textResultado);
    }

    public void enviar(View view) {
//        Pegando o evento e colocando em uma variavel
        String nome = campoNome.getText().toString();
        String email = campoEmail.getText().toString();
        textoResultado.setText("nome: " + nome + "\n" + "e-mail: " + email);
    }

    public void limpar(View view){
        campoNome.setText("");
        campoEmail.setText("");
    }
}
