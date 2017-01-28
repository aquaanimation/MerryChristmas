package com.example.android.happybirthday;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static com.example.android.happybirthday.R.id.wishes;

public class DataEntry extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_entry);


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
