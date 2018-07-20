package com.blogspot.varuncertificate.musicalstructureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class Albums extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_albums);

        // Find the ImageButtons for playing specific album
        ImageButton playAlbumOne = findViewById(R.id.idPlayAlbumOne);
        ImageButton playAlbumTwo = findViewById(R.id.idPlayAlbumTwo);

        ImageButton buttonToPlaylistOfAlbumOne = findViewById(R.id.addToPlaylistOfAlbumOne);
        ImageButton buttonToPlaylistOfAlbumTwo = findViewById(R.id.addToPlaylistOfAlbumTwo);

        Button nowPlayingMenuButton = findViewById(R.id.settingsMenuOfNowPlaying);
        Button artistMenuButton = findViewById(R.id.settingsMenuOfArtist);
        Button musicStoreMenuButton = findViewById(R.id.settingsMenuOfMusicStore);
        Button settingsMenuButton = findViewById(R.id.settingsMenuOfSettings);


        // CLICKS ON MENU BUTTONS:
        nowPlayingMenuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nowPlayingIntent = new Intent(Albums.this, nowPlaying.class);
                startActivity(nowPlayingIntent);
            }
        });

        artistMenuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent artistIntent = new Intent(Albums.this, Artist.class);
                startActivity(artistIntent);
            }
        });

        musicStoreMenuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent musicStoreIntent = new Intent(Albums.this, MusicStore.class);
                startActivity(musicStoreIntent);
            }
        });

        settingsMenuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent settingsIntent = new Intent(Albums.this, Settings.class);
                startActivity(settingsIntent);
            }
        });


        // CLICKS ON PLAY BUTTONS:  Move user to the "Now playing" screen and start playing the selected album
        playAlbumOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nowPlayingIntent = new Intent(Albums.this, nowPlaying.class);
                startActivity(nowPlayingIntent);
            }
        });

        playAlbumTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nowPlayingIntent = new Intent(Albums.this, nowPlaying.class);
                startActivity(nowPlayingIntent);
            }
        });

        // CLICKS ON PLAY ADD TO PLAYLIST BUTTON:  Show the toast with description
        buttonToPlaylistOfAlbumOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), R.string.Album_is_added_to_playlist, Toast.LENGTH_SHORT).show();
            }
        });

        buttonToPlaylistOfAlbumTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), R.string.Album_is_added_to_playlist, Toast.LENGTH_SHORT).show();
            }
        });

    }
}
