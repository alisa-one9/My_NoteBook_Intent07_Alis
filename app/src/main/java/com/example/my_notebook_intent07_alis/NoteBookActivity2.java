package com.example.my_notebook_intent07_alis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

public class NoteBookActivity2 extends AppCompatActivity {
    public TextView textDone;
    public String comingData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note_book2);

        textDone = findViewById(R.id.tvdone);

        Bundle bundle = getIntent().getExtras();
        String message = bundle.getString("message");
        if (null != message) {

            comingData= message;
        }
        textDone.setText(comingData);

    }
}