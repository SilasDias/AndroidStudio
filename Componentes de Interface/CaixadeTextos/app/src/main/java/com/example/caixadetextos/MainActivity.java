package com.example.caixadetextos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {
//    Criando um atributo para ser acessado em outros metodos
    private EditText campoNome;
    private TextInputEditText campoEmail;
    private TextView textoResultado;

//    Atributos dos checks
    private CheckBox checkVerde, checkBranco, checkVermelho;

//    RadioButton
    private RadioButton sexoMasculino, sexoFeminino;
    private RadioGroup opcaoSexo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        Capturando evento do tipo EditText nome
        campoNome       = findViewById(R.id.editNome);
        campoEmail      = findViewById(R.id.editEmail);
        textoResultado  = findViewById(R.id.textResultado);

//        CheckBox
        checkVerde      = findViewById(R.id.checkVerde);
        checkBranco     = findViewById(R.id.checkBranco);
        checkVermelho   = findViewById(R.id.checkVermelho);

//        RadioButton
        sexoMasculino   = findViewById(R.id.radioButtonMasculino);
        sexoFeminino    = findViewById(R.id.radioButtonFeminino);
        opcaoSexo       = findViewById(R.id.radioGroupSexo);

//        Chamando o metodo para acionar o seletor do sexo antes do botao enviar
        radioButton();

    }

    public  void radioButton(){

//      Ouvinde do metodo radiogroup
        opcaoSexo.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId == R.id.radioButtonMasculino){
                    textoResultado.setText("Masculino");
                }else if (checkedId == R.id.radioButtonFeminino){
                    textoResultado.setText("Feminino");
                }
            }
        });

        /*String valida = "";
        if(sexoMasculino.isChecked()){
            textoResultado.setText("Masculino");
        }else if(sexoFeminino.isChecked()){
            textoResultado.setText("Masculino");
        }*/
    }


    public void enviar(View view) {

//        radioButton();
//        check();

/*//        Pegando o evento e colocando em uma variavel
        String nome = campoNome.getText().toString();
        String email = campoEmail.getText().toString();
        textoResultado.setText("nome: " + nome + "\n" + "e-mail: " + email);*/
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

    public void limpar(View view){
        campoNome.setText("");
        campoEmail.setText("");
    }
}
