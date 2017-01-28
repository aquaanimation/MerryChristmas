package com.example.android.happybirthday;

import android.content.Intent;
import android.content.res.Resources;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static com.example.android.happybirthday.R.id.paragraphText;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Resources res = getResources();
        setContentView(R.layout.activity_main);

        TextView paragraphText = (TextView) findViewById(R.id.wishes);
        TextView signatureText = (TextView) findViewById(R.id.signature);
        Intent intent = getIntent();
        String str = intent.getStringExtra("wishes_text");
        String str_sig = intent.getStringExtra("signature_text");
        if (str != null && !str.isEmpty() && !str.equals("null")){
            paragraphText.setText(str);
        }
        if (str_sig != null && !str_sig.isEmpty() && !str_sig.equals("null")){
            signatureText.setText(str_sig);
        }


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

        /**
         * display("dhsjfkajsdfhsadfj");**/
          startActivity(new Intent(getApplicationContext(), DataEntry.class));
    }
    private void display(String text) {
        TextView paragraphText = (TextView) findViewById(R.id.wishes);
        paragraphText.setText("" + text);
    }

}
