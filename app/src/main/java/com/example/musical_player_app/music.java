package com.example.musical_player_app;


public class music {

	String song;
	String artist;

	public music(String song, String artist) {
		this.artist = artist;
		this.song = song;


	}


	public String getSong() {
		return song;
	}

	public String getArtist() {
		return artist;
	}
}
