package com.example.caixadetextos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {
//    Criando um atributo para ser acessado em outros metodos
    private EditText campoNome;
    private TextInputEditText campoEmail;
    private TextView textoResultado;

//    Atributos dos checks
    private CheckBox checkVerde, checkBranco, checkVermelho;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        Capturando evento do tipo EditText nome
        campoNome = findViewById(R.id.editNome);
        campoEmail = findViewById(R.id.editEmail);
        textoResultado = findViewById(R.id.textResultado);

//        CheckBox
        checkVerde = findViewById(R.id.checkVerde);
        checkBranco = findViewById(R.id.checkBranco);
        checkVermelho = findViewById(R.id.checkVermelho);
    }

    public void check(){

        String texto = "";
        if(checkVerde.isChecked()){
//            Pega o text do check...
//            String corSelecionada = checkVerde.getText().toString();
//            texto = corSelecionada;
            texto = "Verde selecionado - ";
        }

        if(checkBranco.isChecked()){
            texto = texto +  "Branco Selecionado - ";
        }

        if(checkVermelho.isChecked()){
            texto = texto +  "Vermelho Selecionado - ";
        }

        textoResultado.setText(texto);
    }

    public void enviar(View view) {

        check();

/*//        Pegando o evento e colocando em uma variavel
        String nome = campoNome.getText().toString();
        String email = campoEmail.getText().toString();
        textoResultado.setText("nome: " + nome + "\n" + "e-mail: " + email);*/
    }

    public void limpar(View view){
        campoNome.setText("");
        campoEmail.setText("");
    }
}
