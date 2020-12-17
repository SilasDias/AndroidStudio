package com.example.itensdemenu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
//        Converter um arquivo xml, em objeto tipo views. Criar um xml para o menu.

        getMenuInflater().inflate(R.menu.menu_principal, menu);
        return super.onCreateOptionsMenu(menu);
    }

//    Criar evento de clique
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
//        Usando switch para pegar evento e ter uma ação

        switch (item.getItemId()){
            case R.id.itemSalvar :
                Toast.makeText(MainActivity.this,
                        "Item Salvar", Toast.LENGTH_SHORT).show();
                break;
            case R.id.itemEditar :
                Toast.makeText(MainActivity.this,
                        "Item Editar", Toast.LENGTH_SHORT).show();
                break;
            case R.id.itemConfiguracao :
                Toast.makeText(MainActivity.this,
                        "Item Configuração", Toast.LENGTH_SHORT).show();
                break;

        }
        return super.onOptionsItemSelected(item);
    }
}
