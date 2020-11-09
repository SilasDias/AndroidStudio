package com.example.preferenciasdousuario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    private TextInputEditText editNome;
    private Button buttonSalvar;
    private TextView textResultado;
    private static final String ARQUIVO_PREFERENCIA = "ArquivoPreferencia";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editNome = findViewById(R.id.editNome);
        buttonSalvar = findViewById(R.id.buttonSalvar);
        textResultado = findViewById(R.id.textResultado);

        buttonSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                SharedPreferences preferences = getSharedPreferences(ARQUIVO_PREFERENCIA, 0);
                SharedPreferences.Editor editor = preferences.edit();

//                Validar o nome
                if (editNome.getText().toString().equals("")){ //valida se o usuario digitou vazio
                    Toast.makeText(getApplicationContext(),"Preencha o nome",
                            Toast.LENGTH_SHORT).show();
                } else {
                    String nome = editNome.getText().toString(); //chama o conteudo
                    editor.putString("nome", nome);// pega os dados e joga na chave "nome"
                    editor.commit();//inseri os valores
                    textResultado.setText("Olá, " + nome);
                }

            }
        });

//        Recuperar o que foi salvo
        SharedPreferences preferences = getSharedPreferences(ARQUIVO_PREFERENCIA, 0);

//        Validar se temos o nome em preferencias
        if (preferences.contains("nome")){

            String nome = preferences.getString("nome","Usuário não definido");
            textResultado.setText("Olá, " + nome);

        }else {
            textResultado.setText("Olá, usuário não definido");
        }

    }
}
