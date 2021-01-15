package com.example.musical_player_app;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.preference.Preference;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class buyMusicActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy_music);

        // Find the View Button Buy Music on Play Store
        final Button buttonBuyMusic = (Button) findViewById(R.id.buy_store);

        // Set a click listener on that View
        buttonBuyMusic.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the BuyMusic Button was clicked on.
            @Override
            public void onClick(View v) {
                TextView SearchTextview = (TextView) findViewById(R.id.buscar);
                String texto = SearchTextview.getText().toString();
                searchPlayStore(texto);
            }
        });
    }

    public void searchPlayStore(String texto) {
        Uri uri = Uri.parse("https://play.google.com/store/search?q=" + texto + "&c=music");
        Intent goToMarket = new Intent(Intent.ACTION_VIEW, uri);
        try {
            startActivity(goToMarket);
        } catch (ActivityNotFoundException e) {
            Toast.makeText(this,
                    R.string.error_play_store,
                    Toast.LENGTH_SHORT).show();
        }
    }

}

