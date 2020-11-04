package com.example.atmconsultoria;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.google.android.material.navigation.NavigationView;

import androidx.drawerlayout.widget.DrawerLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.Menu;

public class MainActivity extends AppCompatActivity {

    private AppBarConfiguration mAppBarConfiguration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                enviarEmail();
            }
        });
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_principal,R.id.nav_servicos,R.id.nav_clientes,
                R.id.nav_contatos,R.id.nav_sobre
        )
                .setDrawerLayout(drawer)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);
    }

    public void enviarEmail(){

        String celular = "tel:11996352894";
        String imagem = "http://hyperallergic.com/wp-content/uploads/2015/07/wallstreetslavemarket05.jpg";
        String maps = "https://www.google.com.br/maps/place/Esta%C3%A7%C3%A3o+Anhangaba%C3%BA/@-23.5478432,-46.6410189,17z/data=!3m1!4b1!4m5!3m4!1s0x94cef51bac71d3f1:0xb68411ecc3611473!8m2!3d-23.5478432!4d-46.6388302";
//        Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse(celular));
//        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(imagem));
//        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(maps));


        Intent intent = new Intent(Intent.ACTION_SEND);

        intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"atendimento@atmconsultoria.com.br"});
        intent.putExtra(Intent.EXTRA_SUBJECT,"Contato pelo APP");
        intent.putExtra(Intent.EXTRA_TEXT, "Mensagem Automática");

//        intent.setType("message/rfc822");
//        intent.setType("text/plain");
//        intent.setType("image/*");
        intent.setType("application/pdf");

        startActivity(Intent.createChooser(intent, "Escolha um App de e-mail"));

    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }
}
