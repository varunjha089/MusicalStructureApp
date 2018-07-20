package com.blogspot.varuncertificate.musicalstructureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Artist extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artist);

        // Mapping buttons
        Button readMoreArtistOne = findViewById(R.id.readMoreButtonArtistOne);
        Button readMoreArtistTwo = findViewById(R.id.readMoreButtonArtistTwo);
        Button readMoreArtistThree = findViewById(R.id.readMoreButtonArtistThree);
        Button readMoreArtistFour = findViewById(R.id.readMoreButtonArtistFour);

        Button menuButtonOfNowPlaying = findViewById(R.id.settingsMenuNowPlaying);
        Button menuButtonOfAlbums = findViewById(R.id.settingsAlbumsMenu);
        Button menuButtonOfMusicStore = findViewById(R.id.settingsMusicStoreMenu);
        Button menuButtonOfSettings = findViewById(R.id.settingsMenuSettings);


        // Listeners for buttons
        // CLICKS ON TOP MENU BUTTONS:
        menuButtonOfNowPlaying.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nowPlayingIntent = new Intent(Artist.this, nowPlaying.class);
                startActivity(nowPlayingIntent);
            }
        });

        menuButtonOfAlbums.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent albumsIntent = new Intent(Artist.this, Albums.class);
                startActivity(albumsIntent);
            }
        });

        menuButtonOfMusicStore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent musicStoreIntent = new Intent(Artist.this, MusicStore.class);
                startActivity(musicStoreIntent);
            }
        });

        menuButtonOfSettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent settingsIntent = new Intent(Artist.this, Settings.class);
                startActivity(settingsIntent);
            }
        });


        readMoreArtistOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), R.string.intent_missing, Toast.LENGTH_SHORT).show();
            }
        });

        readMoreArtistTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), R.string.intent_missing, Toast.LENGTH_SHORT).show();
            }
        });

        readMoreArtistThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), R.string.intent_missing, Toast.LENGTH_SHORT).show();
            }
        });

        readMoreArtistFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), R.string.intent_missing, Toast.LENGTH_SHORT).show();
            }
        });

    }
}
