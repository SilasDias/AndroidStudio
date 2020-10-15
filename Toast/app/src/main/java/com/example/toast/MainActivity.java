package com.example.toast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void abrirToast(View view){

        ImageView image = new ImageView(getApplicationContext());
        image.setImageResource(android.R.drawable.star_big_off);

        TextView textView = new TextView(getApplicationContext());
        textView.setBackgroundResource(R.color.colorPrimary);
        textView.setText("Olá, Toast!");

//        Toast Personalizado
        Toast toast = new Toast(getApplicationContext());
        toast.setDuration(Toast.LENGTH_LONG);
//        toast.setView(image);
        toast.setView(textView);
        toast.show();


        /*Toast.makeText(

                getApplicationContext(),
                "Ação realizada com sucesso!",
                Toast.LENGTH_SHORT
        ).show();*/

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
