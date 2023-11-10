package com.example.tugas11;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         final EditText editTextname = findViewById(R.id.editTextName);
         final EditText editTextsurname  = findViewById(R.id.editTextSurName);
         final EditText editTextage = findViewById(R.id.editTextAge);
         btn1 = (Button) findViewById(R.id.button);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = editTextname.getText().toString();
                String surname = editTextsurname.getText().toString();
                String age = editTextage.getText().toString();

                // Pindah ke aktivitas kedua dan kirim data
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("NAME", name);
                intent.putExtra("SURNAME", surname);
                intent.putExtra("AGE", age);
                startActivity(intent);
            }
        });
    }

}