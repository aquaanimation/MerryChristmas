package com.example.android.happybirthday;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputType;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static android.R.id.message;
import static com.example.android.happybirthday.R.id.wishes;

public class DataEntry extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_entry);
        EditText message = (EditText) findViewById(R.id.paragraphText);
        EditText messageSig = (EditText) findViewById(R.id.signatureText);

        final SharedPreferences prefs = PreferenceManager
                .getDefaultSharedPreferences(this);

        message.setText(prefs.getString("autoSave", ""));
        message.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before,
                                      int count)
            {
                prefs.edit().putString("autoSave", s.toString()).commit();
            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count,
                                          int after)
            {
            }

            @Override
            public void afterTextChanged(Editable s)
            {
            }
        });
        messageSig.setText(prefs.getString("autoSaveSig", ""));
        messageSig.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before,
                                      int count)
            {
                prefs.edit().putString("autoSaveSig", s.toString()).commit();
            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count,
                                          int after)
            {
            }

            @Override
            public void afterTextChanged(Editable s)
            {
            }
        });


    }
    public void saveTextClick(View v) {

        Button button = (Button) v;
        EditText etWishes = (EditText) findViewById(R.id.paragraphText);
        EditText etSignature = (EditText) findViewById(R.id.signatureText);
        Intent intent = new Intent(DataEntry.this, MainActivity.class);
        intent.putExtra("wishes_text", etWishes.getText().toString());
        intent.putExtra("signature_text", etSignature.getText().toString());
        startActivity(intent);

    }

}
