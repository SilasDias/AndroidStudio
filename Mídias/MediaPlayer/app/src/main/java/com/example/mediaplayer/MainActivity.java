package com.example.mediaplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity {

    private MediaPlayer mediaPlayer;
    private SeekBar seekVolume;
    private AudioManager audioManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.teste);
        seekVolume = findViewById(R.id.seekVolume);
        inicializarSeekBar();

    }

    public void inicializarSeekBar(){
//        Configurar o audio manager
        audioManager = (AudioManager) getSystemService(Context.AUDIO_SERVICE);

//        Recuperar os valores de volume máximo e o volume atual
        int volumeMaximo = audioManager.getStreamMaxVolume(AudioManager.STREAM_MUSIC);
        int volumeAtual = audioManager.getStreamVolume(AudioManager.STREAM_MUSIC);

//        Configurar os valores maximos para o SeekBar
        seekVolume.setMax(volumeMaximo);

//        Configurando o progresso atual do SeekBar
        seekVolume.setProgress(volumeAtual);

//        Controle do Volume
        seekVolume.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                audioManager.setStreamVolume(AudioManager.STREAM_MUSIC,progress,0);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

    }

    public void executarSom(View view){
//        Verica se mediaPlayer existe
        if (mediaPlayer != null){
            mediaPlayer.start();
        }

    }

        public void pausarMusica(View view){
//        Verifica se a musica ta tocando
        if (mediaPlayer.isPlaying()){
            mediaPlayer.pause();
        }
    }

    public void pararMusica(View view) {
        if (mediaPlayer.isPlaying()){
            mediaPlayer.stop();
            mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.teste);

        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mediaPlayer != null && mediaPlayer.isPlaying()){
            mediaPlayer.stop();
            mediaPlayer.release();
            mediaPlayer = null;
        }
    }

    //    Metodo para pausar musica ao minimizar o app
/*    @Override
    protected void onStop() {
        super.onStop();
        if (mediaPlayer.isPlaying()){
            mediaPlayer.pause();
        }

    }*/
}
