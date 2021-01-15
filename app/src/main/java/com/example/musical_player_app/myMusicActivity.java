package com.example.musical_player_app;

import android.content.Intent;
import android.os.Bundle;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatActivity;

import static android.R.attr.button;
import static android.R.attr.duration;

public class myMusicActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_music);

        // Find the View Button Now Playing
        final ImageButton buttonPlay = (ImageButton) findViewById(R.id.playItem1);

        // Set a click listener on that View
        buttonPlay.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when Play Button was clicked on (Only Firts Item).
            @Override
            public void onClick(View v) {
                // Create a new intent to open the nowPlayingActivity
                Intent nowPlayingIntent = new Intent(myMusicActivity.this, nowPlayingActivity.class);

                // Start the new activity
                startActivity(nowPlayingIntent);
            }
        });

        // Find the View Button Now Playing
        final ImageButton buttonPlay2 = (ImageButton) findViewById(R.id.playItem2);

        // Set a click listener on that View
        buttonPlay2.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when Play Button was clicked on (Not 1st Item)
            @Override
            public void onClick(View v) {
                showMessage();
            }
        });

        // Find the View Button Now Playing
        final ImageButton buttonPlay3 = (ImageButton) findViewById(R.id.playItem3);

        // Set a click listener on that View
        buttonPlay3.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when Play Button was clicked on (Not 1st Item)
            @Override
            public void onClick(View v) {
                showMessage();
            }
        });

        // Find the View Button Now Playing
        final ImageButton buttonPlay4 = (ImageButton) findViewById(R.id.playItem4);

        // Set a click listener on that View
        buttonPlay4.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when Play Button was clicked on (Not 1st Item).
            @Override
            public void onClick(View v) {
                showMessage();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.search_menu, menu);

        return true;
    }

    public void showMessage() {
        Toast.makeText(this, R.string.toast_demo, Toast.LENGTH_LONG).show();

    }
}
