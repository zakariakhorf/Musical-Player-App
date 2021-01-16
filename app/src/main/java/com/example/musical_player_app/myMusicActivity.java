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
		songs.add(new music("Bruno Mars", "24k Magic"));
		songs.add(new music("Eminem", "Moms spaghetti"));
		songs.add(new music("Cardi B", "No song "));
		songs.add(new music("Micheal jackson", "Blue jean "));
		songs.add(new music("Marshmallow", "Happier"));

		musicAdapter adapter = new musicAdapter(songs, getApplicationContext());

		listView.setAdapter(adapter);
		listView.setOnItemClickListener((parent, view, position, id) -> {

			music dataModel = songs.get(position);

			Snackbar.make(view, dataModel.getSong() + "\n" + dataModel.getArtist(), Snackbar.LENGTH_LONG)
					.setAction("No action", null).show();
		});
	}


}
