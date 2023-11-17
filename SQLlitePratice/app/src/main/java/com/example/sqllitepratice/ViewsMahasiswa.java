package com.example.sqllitepratice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ViewsMahasiswa extends AppCompatActivity {
    private ArrayList<MahasiswaModal>
            mahasiswaModalArrayList;
    private DBHandler dbHandler;
    private MahasiswaRVAdapter mahasiswaRVAdapter;
    private RecyclerView mahasiswaRV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_views_mahasiswa);

        mahasiswaModalArrayList = new ArrayList<>();
        dbHandler = new DBHandler(ViewsMahasiswa.this);

        mahasiswaModalArrayList =
                dbHandler.readMahasiswa();

        mahasiswaRVAdapter = new
                MahasiswaRVAdapter(mahasiswaModalArrayList,
                ViewsMahasiswa.this);
        mahasiswaRV = findViewById(R.id.idRVMahasiswa);

        LinearLayoutManager linearLayoutManager = new
                LinearLayoutManager(ViewsMahasiswa.this,
                RecyclerView.VERTICAL, false);

        mahasiswaRV.setLayoutManager(linearLayoutManager);

        mahasiswaRV.setAdapter(mahasiswaRVAdapter);
    }
}