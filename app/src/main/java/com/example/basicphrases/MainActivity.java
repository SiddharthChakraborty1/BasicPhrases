package com.example.basicphrases;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static com.example.basicphrases.R.*;

public class MainActivity extends AppCompatActivity {
    Button b1,b2,b3,b4,b5,b6,b7,b8;
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_main);




    }

    public void Play(View view)
    {
        Button current = (Button) view;
        mediaPlayer = MediaPlayer.create(this,getResources().getIdentifier(current.getTag().toString(),"raw",getPackageName()));
        mediaPlayer.start();


    }
}