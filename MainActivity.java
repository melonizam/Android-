package com.example.melodic.sounddemo;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    MediaPlayer mediaPlayer;

    public void playAudio(View view){
        mediaPlayer.start();
    }

    public void pauseAudio(View view){
        mediaPlayer.pause();
    }

    public void stopAudio(View view){
        mediaPlayer.stop();
         mediaPlayer.prepareAsync();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mediaPlayer = MediaPlayer.create(this, R.raw.dukkho);
    }
}