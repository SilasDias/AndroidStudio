package com.example.listadetarefas.helper;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import androidx.annotation.Nullable;

public class DBHelper extends SQLiteOpenHelper {

    public static int VERSION = 1;
    public static String NAME_DB = "DB_TAREFAS";
    public static String TABELA_TAREFAS = "tarefas";


    public DBHelper(@Nullable Context context) {
        super(context, NAME_DB, null, VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
//        É chamado so uma vez para criar o app

//        Criando uma tabela
        String sql = "CREATE TABLE IF NOT EXISTS " + TABELA_TAREFAS
                     + " (id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                     " nome TEXT NOT NULL); ";

        try {

            db.execSQL(sql);
            Log.i("INFO DB", "Erro ao criar a tabela");

        }catch (Exception e ){
            Log.i("INFO DB", "Erro ao criar a tabela" + e.getMessage());
        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
//        Usado para da um upgrade no app

//       Alterando tabela
        /*String sql = "ALTER TABLE " + TABELA_TAREFAS + " ADD COLUMN status VARCHAR(2)";

        try {

            db.execSQL(sql);
            onCreate(db);
            Log.i("INFO DB", "Erro ao Atualizar App");

        }catch (Exception e ){
            Log.i("INFO DB", "Erro ao Atualizar App" + e.getMessage());
        }*/


//        Deletando a tabela
        String sql = "DROP TABLE IF EXISTS " + TABELA_TAREFAS + " ;";

        try {

            db.execSQL(sql);
            onCreate(db);
            Log.i("INFO DB", "Erro ao Atualizar App");

        }catch (Exception e ){
            Log.i("INFO DB", "Erro ao Atualizar App" + e.getMessage());
        }

    }
}
