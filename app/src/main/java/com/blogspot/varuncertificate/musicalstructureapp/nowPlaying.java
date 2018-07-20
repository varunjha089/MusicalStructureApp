package com.blogspot.varuncertificate.musicalstructureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class nowPlaying extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);


        // Mapping for all buttons on the screen
        ImageButton playButton = findViewById(R.id.playSongButton);
        ImageButton previousSongButton = findViewById(R.id.previousSongButton);
        ImageButton nextSongButton = findViewById(R.id.nextSongButton);
        ImageButton repeatButton = findViewById(R.id.repeatButton);
        ImageButton shuffleButton = findViewById(R.id.shuffleButton);
        ImageButton buyCurrentSongButton = findViewById(R.id.buyCurrentSongButton);

        Button albumsMenuButton = findViewById(R.id.settingsMenuAlbums);
        Button artistMenuButton = findViewById(R.id.settingsMenuArtist);
        Button musicStoreMenuButton = findViewById(R.id.settingsMenuMusicStore);
        Button settingsMenuButton = findViewById(R.id.settingsMenuSettings);

        // Listeners for info buttons
        // CLICKS ON TOP MENU BUTTONS
        albumsMenuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent albumsIntent = new Intent(nowPlaying.this, Albums.class);
                startActivity(albumsIntent);
            }
        });


        artistMenuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent artistIntent = new Intent(nowPlaying.this, Artist.class);
                startActivity(artistIntent);
            }
        });

        musicStoreMenuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent musicStoreIntent = new Intent(nowPlaying.this, MusicStore.class);
                startActivity(musicStoreIntent);
            }
        });

        settingsMenuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent settingsIntent = new Intent(nowPlaying.this, Settings.class);
                startActivity(settingsIntent);
            }
        });

        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), R.string.playing_song, Toast.LENGTH_SHORT).show();
            }
        });

        previousSongButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), R.string.previous_song, Toast.LENGTH_SHORT).show();
            }
        });

        nextSongButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), R.string.next_song, Toast.LENGTH_SHORT).show();
            }
        });

        repeatButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), R.string.repeat_nowPlaying_class, Toast.LENGTH_SHORT).show();
            }
        });

        shuffleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), R.string.shuffle_is_enabelled, Toast.LENGTH_SHORT).show();
            }
        });

        buyCurrentSongButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), R.string.thanks_for_buying, Toast.LENGTH_SHORT).show();
            }
        });

    }

}
