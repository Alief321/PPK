package com.example.tugas10;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private EditText editTextSide;
    private EditText editTextSide2;
    private Button buttonCalculate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextSide = findViewById(R.id.editTextSide);
        buttonCalculate = findViewById(R.id.buttonCalculate);
        editTextSide2 = findViewById(R.id.editTextSide2);

        buttonCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculateSquareArea();
            }
        });
    }

    private void calculateSquareArea() {
        String sideText = editTextSide.getText().toString();

        if (!sideText.isEmpty()) {
            double side = Double.parseDouble(sideText);
            double area = side * side;

            editTextSide2.setText("Luas Persegi: " + area);
        } else {
            editTextSide2.setText("Masukkan panjang sisi terlebih dahulu.");
        }
    }
}