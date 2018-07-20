package com.blogspot.varuncertificate.musicalstructureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Settings extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        // Mapping buttons
        Button registerSpotifyButton = findViewById(R.id.buttonRegister);
        Button loginSpotifyButton = findViewById(R.id.buttonLogin);
        Button loginToSpotifyViaFacebook = findViewById(R.id.loginViaFacebook);
        Button loginToSpotifyViaGoogle = findViewById(R.id.loginViaGoogle);

        Button nowPlayingMenuButton = findViewById(R.id.settingsMenuNowIsPlaying);
        Button albumsMenuButton = findViewById(R.id.settingsMenuAlbums);
        Button artistMenuButton = findViewById(R.id.settingsMenuArtist);
        Button musicStoreMenuButton = findViewById(R.id.settingsMenuMusicStore);

        // Listeners for info buttons
        // CLICKS ON TOP MENU BUTTONS:
        nowPlayingMenuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nowPlayingIntent = new Intent(Settings.this, nowPlaying.class);
                startActivity(nowPlayingIntent);
            }
        });

        albumsMenuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent albumsIntent = new Intent(Settings.this, Albums.class);
                startActivity(albumsIntent);
            }
        });

        artistMenuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent artistIntent = new Intent(Settings.this, Artist.class);
                startActivity(artistIntent);
            }
        });

        musicStoreMenuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent musicStoreIntent = new Intent(Settings.this, MusicStore.class);
                startActivity(musicStoreIntent);
            }
        });

        registerSpotifyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), R.string.register_message, Toast.LENGTH_SHORT).show();
            }
        });

        loginSpotifyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), R.string.login_message, Toast.LENGTH_SHORT).show();
            }
        });

        loginToSpotifyViaFacebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), R.string.login_message, Toast.LENGTH_SHORT).show();
            }
        });

        loginToSpotifyViaGoogle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), R.string.login_message, Toast.LENGTH_SHORT).show();
            }
        });


    }
}
