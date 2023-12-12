package com.example.my_notebook_intent07_alis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public TextView my_writing;
    public Button btn_write;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        my_writing =findViewById(R.id.et_my_writing);
        btn_write =findViewById(R.id.btn_write);

        btn_write.setOnClickListener(v -> {
            Intent intent = new Intent(this, NoteBookActivity2.class);
            intent.putExtra("message", my_writing.getText().toString());
            startActivity(intent);


        });





    }
}