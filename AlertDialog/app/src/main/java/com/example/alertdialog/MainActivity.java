package com.example.alertdialog;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public  void abrirDialog(View view){

//    Instanciar AlertDialog()
    AlertDialog.Builder dialog = new AlertDialog.Builder(this);

//    Configurar titulo e mensagem
        dialog.setTitle("Titulo da dialog");
        dialog.setMessage("Mensagem da dialog");

//    Configurar cancelamento força o usuario escolher uma ação
        dialog.setCancelable(false);

//    Configurar icone
        dialog.setIcon(android.R.drawable.ic_btn_speak_now);



//    Configurar acoes para sim e não
        dialog.setPositiveButton("Sim", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

//                Ação depois que clicar no botão sim
                Toast.makeText(
                        getApplicationContext(),
                        "Executar ação ao clicar no botão sim",
                        Toast.LENGTH_SHORT
                ).show();
            }
        });

        dialog.setNegativeButton("Não", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
//                Ação depois que clicar no botão sim
                Toast.makeText(
                        getApplicationContext(),
                        "Executar ação ao clicar no botão não",
                        Toast.LENGTH_SHORT

                ).show();

            }
        });

//    Criar e seguir AlertDialog
        dialog.create();
        dialog.show();

    }


}
