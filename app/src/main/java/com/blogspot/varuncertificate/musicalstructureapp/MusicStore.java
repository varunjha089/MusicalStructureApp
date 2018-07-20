package com.blogspot.varuncertificate.musicalstructureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class MusicStore extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music_store);


        // Mapping buttons for Music Store screen
        ImageButton infoButtonOfAlbumOne = findViewById(R.id.infoAlbumOne);
        ImageButton infoButtonOfAlbumTwo = findViewById(R.id.infoAlbumTwo);
        ImageButton infoButtonOfAlbumThree = findViewById(R.id.infoAlbumThree);
        ImageButton infoButtonOfAlbumFour = findViewById(R.id.infoAlbumFour);

        ImageButton addToShoppingCartButtonOfAlbumOne = findViewById(R.id.addToShoppingCartAlbumOne);
        ImageButton addToShoppingCartButtonOfAlbumTwo = findViewById(R.id.addToShoppingCartAlbumTwo);
        ImageButton addToShoppingCartButtonOfAlbumThree = findViewById(R.id.addToShoppingCartAlbumThree);
        ImageButton addToShoppingCartButtonAlbum4 = findViewById(R.id.addToShoppingCartAlbumFour);

        Button nowIsPlayingTopMenuButton = findViewById(R.id.settingsMenuOfNowPlaying);
        Button albumsTopMenuButton = findViewById(R.id.settingsMenuOfAlbums);
        Button artistTopMenuButton = findViewById(R.id.settingsMenuOfArtist);
        Button settingsTopMenuButton = findViewById(R.id.settingsMenuSettings);

        // Listeners for info buttons
        // CLICKS ON MENU BUTTONS:
        nowIsPlayingTopMenuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nowPlayingIntent = new Intent(MusicStore.this, nowPlaying.class);
                startActivity(nowPlayingIntent);
            }
        });

        albumsTopMenuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent albumsIntent = new Intent(MusicStore.this, Albums.class);
                startActivity(albumsIntent);
            }
        });


        artistTopMenuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent artistIntent = new Intent(MusicStore.this, Artist.class);
                startActivity(artistIntent);
            }
        });

        settingsTopMenuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent settingsIntent = new Intent(MusicStore.this, Settings.class);
                startActivity(settingsIntent);
            }
        });

        infoButtonOfAlbumOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), R.string.Info_of_album_one, Toast.LENGTH_SHORT).show();
            }
        });

        infoButtonOfAlbumTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), R.string.Info_of_album_two, Toast.LENGTH_SHORT).show();
            }
        });

        infoButtonOfAlbumThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), R.string.Info_of_album_three, Toast.LENGTH_SHORT).show();
            }
        });

        infoButtonOfAlbumFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), R.string.Info_of_album_four, Toast.LENGTH_SHORT).show();
            }
        });

        // Listeners for Add Shopping Card Buttons
        addToShoppingCartButtonOfAlbumOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), R.string.Added_to_Shopping_Cart, Toast.LENGTH_SHORT).show();
            }
        });

        addToShoppingCartButtonOfAlbumTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), R.string.Added_to_Shopping_Cart, Toast.LENGTH_SHORT).show();
            }
        });

        addToShoppingCartButtonOfAlbumThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), R.string.Added_to_Shopping_Cart, Toast.LENGTH_SHORT).show();
            }
        });

        addToShoppingCartButtonAlbum4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), R.string.Added_to_Shopping_Cart, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
