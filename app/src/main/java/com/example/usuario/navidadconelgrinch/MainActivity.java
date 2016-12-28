package com.example.usuario.navidadconelgrinch;

import android.annotation.TargetApi;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;


import static com.example.usuario.navidadconelgrinch..*;

public class MainActivity extends AppCompatActivity {

    private MediaPlayer mediaPlayer = new MediaPlayer();

    private SoundPool
            spTemaGrinch,
            spAgenda,
            spAtrevidos,
            spVerde,
            spTeDetesto,
            spMotivacion,
            spMuyBienIre;

    private int
            resTemaGrinch,
            resAgenda,
            resAtrevidos,
            resVerde,
            resTeDetesto,
            resMotivacion,
            resMuyBienIre;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);


        createSoundPool();
    }




    public void createSoundPool(){
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            createNewSoundPool();
        } else {
            createOldSoundPool();
        }
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    protected void createNewSoundPool(){
        setContentView(R.layout.activity_main);
        AudioAttributes attributes = new AudioAttributes.Builder()
                .setUsage(AudioAttributes.USAGE_GAME)
                .setContentType(AudioAttributes.CONTENT_TYPE_MUSIC)
                .build();
        spTemaGrinch= new SoundPool.Builder().setAudioAttributes(attributes).build();
        spAgenda = new SoundPool.Builder().setAudioAttributes(attributes).build();
        spAtrevidos = new SoundPool.Builder().setAudioAttributes(attributes).build();
        spVerde = new SoundPool.Builder().setAudioAttributes(attributes).build();
        spTeDetesto = new SoundPool.Builder().setAudioAttributes(attributes).build();
        spMotivacion = new SoundPool.Builder().setAudioAttributes(attributes).build();
        spMuyBienIre = new SoundPool.Builder().setAudioAttributes(attributes).build();


        chargeSoundPool();
    }

    @SuppressWarnings("deprecation")
    protected void createOldSoundPool(){
        spTemaGrinch = new SoundPool(15, AudioManager.STREAM_MUSIC,0);
        spAgenda = new SoundPool(15,AudioManager.STREAM_MUSIC,0);
        spAtrevidos = new SoundPool(15,AudioManager.STREAM_MUSIC,0);
        spVerde = new SoundPool(15,AudioManager.STREAM_MUSIC,0);
        spTeDetesto = new SoundPool(15,AudioManager.STREAM_MUSIC,0);
        spMotivacion = new SoundPool(15,AudioManager.STREAM_MUSIC,0);
        spMuyBienIre = new SoundPool(15,AudioManager.STREAM_MUSIC,0);

        chargeSoundPool();
    }

    public void chargeSoundPool() {
        resTemaGrinch = spTemaGrinch.load(getApplicationContext(), R.raw.temagrinch, 1);
        resAgenda = spAgenda.load(getApplicationContext(), R.raw.agenda, 1);
        resAtrevidos = spAgenda.load(getApplicationContext(), R.raw.atrevidos, 1);
        resVerde = spVerde.load(getApplicationContext(), R.raw.verde, 1);
        resTeDetesto = spTeDetesto.load(getApplicationContext(), R.raw.tedetesto, 1);
        resMotivacion = spMotivacion.load(getApplicationContext(), R.raw.motivacion, 1);
        resMuyBienIre = spMuyBienIre.load(getApplicationContext(), R.raw.muybienire, 1);


    }

    public void temaGrinch(View view) {
        if (resTemaGrinch != 0){
            spTemaGrinch.play(resTemaGrinch, 1, 1, 0, 0, 1);
        }
    }

    public void agenda(View view) {
        if (resAgenda != 0){
            spAgenda.play(resAgenda, 1, 1, 0, 0, 1);
        }
    }

    public void atrevidos(View view) {
        if (resAtrevidos != 0){
            spAtrevidos.play(resAtrevidos, 1, 1, 0, 0, 1);
        }
    }

    public void verde(View view) {
        if (resVerde != 0){
            spVerde.play(resVerde, 1, 1, 0, 0, 1);
        }
    }

    public void teDetesto(View view) {
        if (resTeDetesto != 0){
            spTeDetesto.play(resTeDetesto, 1, 1, 0, 0, 1);
        }
    }

    public void motivacion(View view) {
        if (resMotivacion != 0){
            spMotivacion.play(resMotivacion, 1, 1, 0, 0, 1);
        }
    }

    public void muyBienIre(View view) {
        if (resMuyBienIre != 0){
            spMuyBienIre.play(resMuyBienIre, 1, 1, 0, 0, 1);
        }
    }

}
