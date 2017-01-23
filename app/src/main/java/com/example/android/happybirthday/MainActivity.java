package com.example.android.happybirthday;

import android.content.Intent;
import android.content.res.Resources;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Resources res = getResources();
        setContentView(R.layout.activity_main);

        String paragraphText = getResources().getString(R.string.p_text);


        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.merry_xmas_song);

        final Button toggleSoundBtn = (Button) findViewById(R.id.toggleSound);

        toggleSoundBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (!mediaPlayer.isPlaying()) {
                    mediaPlayer.start();
                }else{
                    mediaPlayer.reset();
                    mediaPlayer.pause();
                }

            }
        });
        }
    public void editTextClick(View v) {

        Button button = (Button) v;
        startActivity(new Intent(getApplicationContext(), DataEntry.class));


    }


}
