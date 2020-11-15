package com.example.bancodedadossqlite;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        try {
//            Criando um banco de dados
            SQLiteDatabase bancoDados = openOrCreateDatabase("app", MODE_PRIVATE, null);

//            Criando Tabela
            bancoDados.execSQL("CREATE TABLE IF NOT EXISTS pessoas (id INTEGER PRIMARY KEY AUTOINCREMENT, nome VARCHAR, idade INT(3))");

//            Inserir dados
//            bancoDados.execSQL("INSERT INTO pessoas (nome, idade) VALUES ('Mario', 40)");
//            bancoDados.execSQL("INSERT INTO pessoas (nome, idade) VALUES ('Pedro', 50)");
//            bancoDados.execSQL("INSERT INTO pessoas (nome, idade) VALUES ('Mariana', 18)");
//            bancoDados.execSQL("INSERT INTO pessoas (nome, idade) VALUES ('Maria', 35)");

//            Update
//            bancoDados.execSQL("UPDATE pessoas SET idade = 19 WHERE nome = 'Mariana' ");
//            bancoDados.execSQL("UPDATE pessoas SET nome = 'Mariana Silva', idade = 19 WHERE id = 3 ");

//            Delete
//            bancoDados.execSQL("DELETE FROM pessoas WHERE nome = 'Joana' AND idade = 33");
//            bancoDados.execSQL("DELETE FROM pessoas WHERE id = 4 "); //Deletando Id's
//            Apagando a Tabela
//            bancoDados.execSQL("DROP TABLE pessoas");


//            Recuperar dados
/*            String consulta = "SELECT nome, idade FROM pessoas" +
                              " WHERE nome = 'Silas' AND idade = 30 ";*/

/*            String consulta = "SELECT nome, idade FROM pessoas " +
                              "WHERE idade >= 35 AND idade = 18 ";*/

/*            String consulta = "SELECT nome, idade FROM pessoas" +
                    " WHERE nome IN('Silas','Pedro') ";*/ //IN pesquisa por intervalo

/*
            String consulta = "SELECT nome, idade FROM pessoas" +
                    " WHERE nome IN('Silas','Pedro') ";
*/

/*            String consulta = "SELECT nome, idade FROM pessoas" +
                    " WHERE idade BETWEEN 35 AND 50";*/

/*
            String filtro = "mar";
            String consulta = "SELECT nome, idade FROM pessoas" +
                    " WHERE nome LIKE '%" + filtro + "%' "; // %qualquer coisa a direita
*/

/*            String consulta = "SELECT nome, idade FROM pessoas" +
                    " WHERE 1=1 ORDER BY idade ASC LIMIT 3"; //Ordenar buscas asc=ascendente/desc=descendente*/

            String consulta = "SELECT * FROM pessoas" + //usar * substitui todos os campos
                    " WHERE 1=1 ";



            Cursor cursor = bancoDados.rawQuery(consulta, null);

            //Indices da tabela
            int indiceNome = cursor.getColumnIndex("nome");
            int indiceIdade = cursor.getColumnIndex("idade");
            int indiceId = cursor.getColumnIndex("id");

            cursor.moveToFirst(); //move o curso para o primeiro da lista
            while (cursor != null){

                String nome = cursor.getString(indiceNome);
                String idade = cursor.getString(indiceIdade);
                String id = cursor.getString(indiceId);

                Log.i("RESULTADO - id ", id + " / nome: " + nome + " / idade: " + idade);
                cursor.moveToNext();
            }


        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
