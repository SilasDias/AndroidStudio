package com.example.caixasdetexto;

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
        campoNome.findViewById(R.id.editNome);
//        Capturando evento do tipo TextInputEditText email
        campoEmail.findViewById(R.id.editEmail);
//        Capturando evento do tipo TextViews
        textoResultado.findViewById(R.id.textResultado);
    }

    public void enviar(View view){

//        Pegando o evento e colocando em uma variavel
        String nome = campoNome.getText().toString(); //casting String
//        Evento email colocano numa String
        String email = campoEmail.getText().toString();
//        Pegando o nome e colocando na campo
        textoResultado.setText(nome + "\n" + email);

    }

    public void limpar(View view) {
        campoNome.setText("");
        campoEmail.setText("");
    }
}
