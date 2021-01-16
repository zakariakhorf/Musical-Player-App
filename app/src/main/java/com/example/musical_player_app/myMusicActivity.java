package com.example.musical_player_app;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;

public class myMusicActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_my_music);
		ListView listView = (ListView) findViewById(R.id.listview);
		ArrayList<music> songs = new ArrayList<music>();
		songs.add(new music(getString(R.string.track_name1), getString(R.string.artist_name1)));
		songs.add(new music(getString(R.string.track_name2), getString(R.string.artist_name2)));
		songs.add(new music(getString(R.string.track_name3), getString(R.string.artist_name3)));
		songs.add(new music(getString(R.string.track_name4), getString(R.string.artist_name4)));
		songs.add(new music(getString(R.string.track_name5), getString(R.string.artist_name5)));

		musicAdapter adapter = new musicAdapter(songs, getApplicationContext());

		listView.setAdapter(adapter);
		listView.setOnItemClickListener((parent, view, position, id) -> {

			music dataModel = songs.get(position);

			Snackbar.make(view, dataModel.getSong() + "\n" + dataModel.getArtist(), Snackbar.LENGTH_LONG)
					.setAction("No action", null).show();
		});
	}


}
