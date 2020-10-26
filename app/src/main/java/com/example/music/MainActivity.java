package com.example.music;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageView = (ImageView) findViewById(R.id.imageView3);

        Glide.with(this).load("https://img.youtube.com/vi/ebXbLfLACGM/0.jpg");
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.blame_audi_ft_john_newman);
    }
    @Override
    protected void onResume() {
        super.onResume();
    }
    public void playMusic(View view){
        mediaPlayer.start();
    }
}