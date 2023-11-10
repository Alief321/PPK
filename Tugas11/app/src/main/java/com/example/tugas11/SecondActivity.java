package com.example.tugas11;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView textViewResult = findViewById(R.id.textViewResult);

        // Ambil data dari intent
        Intent intent = getIntent();
        String name = intent.getStringExtra("NAME");
        String surname = intent.getStringExtra("SURNAME");
        String age = intent.getStringExtra("AGE");

        // Tampilkan hasil di TextView
        String result = "Nama: " + name + "\n\nSurname: " + surname + "\n\nAge: " + age;
        textViewResult.setText(result);
    }
}