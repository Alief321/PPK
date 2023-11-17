package com.example.sqllitepratice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText nim, nama, kelas, nohp;
    private Button addMhs, lihatMhs;
    private DBHandler dbHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nim = findViewById(R.id.nimEditText);
        nama = findViewById(R.id.namaEditText);
        kelas = findViewById(R.id.kelasEditText);
        nohp = findViewById(R.id.nohpEditText);
        addMhs = findViewById(R.id.tambahButton);
        lihatMhs = findViewById(R.id.lihatButton);
        // creating a new dbhandler class
        // and passing our context to it.
        dbHandler = new DBHandler(MainActivity.this);
        addMhs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nimmhs = nim.getText().toString();
                String namamhs =
                        nama.getText().toString();
                String kelasmhs =
                        kelas.getText().toString();
                String nohpmhs =
                        nohp.getText().toString();
                if (nimmhs.isEmpty() && namamhs.isEmpty()
                        && kelasmhs.isEmpty() && nohpmhs.isEmpty()) {
                    Toast.makeText(MainActivity.this,
                            "Lengkapilah semua data..", Toast.LENGTH_SHORT).show();
                    return;
                }
                dbHandler.addNewMahasiswa(nimmhs,
                        namamhs, kelasmhs, nohpmhs);
                Toast.makeText(MainActivity.this, "Data Mahasiswa Telah Ditambahkan", Toast.LENGTH_SHORT).show();
                nim.setText("");
                nama.setText("");
                kelas.setText("");
                nohp.setText("");
            }
        });

        lihatMhs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // opening a new activity via a intent.
                Intent i = new Intent(MainActivity.this, ViewsMahasiswa.class);
                startActivity(i);
            }
        });
    }
}