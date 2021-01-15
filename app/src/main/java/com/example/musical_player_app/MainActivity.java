package com.example.musical_player_app;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);


		// Find the View Button Now Playing
		final Button buttonNowPlaying = (Button) findViewById(R.id.now_playing);

		// Set a click listener on that View
		buttonNowPlaying.setOnClickListener(new View.OnClickListener() {
			// The code in this method will be executed when the Now Playing Button was clicked on.
			@Override
			public void onClick(View v) {
				// Create a new intent to open the nowPlayingActivity
				Intent nowPlayingIntent = new Intent(MainActivity.this, nowPlayingActivity.class);

				// Start the new activity
				startActivity(nowPlayingIntent);
			}
		});

		// Find the View Button My Music
		final Button buttonMyMusic = (Button) findViewById(R.id.my_music);

		// Set a click listener on that View
		buttonMyMusic.setOnClickListener(new View.OnClickListener() {
			// The code in this method will be executed when the MyMusic Button was clicked on.
			@Override
			public void onClick(View v) {
				// Create a new intent to open the myMusicActivity
				Intent myMusicIntent = new Intent(MainActivity.this, myMusicActivity.class);

				// Start the new activity
				startActivity(myMusicIntent);
			}
		});

		// Find the View Button My Music
		final Button buttonBuyMusic = (Button) findViewById(R.id.buy_music);

		// Set a click listener on that View
		buttonBuyMusic.setOnClickListener(new View.OnClickListener() {
			// The code in this method will be executed when the BuyMusic Button was clicked on.
			@Override
			public void onClick(View v) {
				// Create a new intent to open the buyMusicActivity
				Intent buyMusicIntent = new Intent(MainActivity.this, buyMusicActivity.class);

				// Start the new activity
				startActivity(buyMusicIntent);
			}
		});

	}
}
