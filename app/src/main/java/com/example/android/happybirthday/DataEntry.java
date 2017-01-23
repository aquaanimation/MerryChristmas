package com.example.android.happybirthday;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class DataEntry extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_entry);


    }
    public void saveTextClick(View v) {

        Button button = (Button) v;
        startActivity(new Intent(getApplicationContext(), MainActivity.class));

    }

}
