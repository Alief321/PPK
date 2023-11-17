package com.example.recycleviewactivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private MahasiswaAdapter adapter;
    private ArrayList<Mahasiswa> mahasiswaArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addData();
        recyclerView = (RecyclerView)
                findViewById(R.id.recycler_view);
        RecyclerView.LayoutManager layoutManager = new
                LinearLayoutManager(MainActivity.this);
        adapter = new MahasiswaAdapter(mahasiswaArrayList, this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }

    void addData(){
        mahasiswaArrayList = new ArrayList<>();
        mahasiswaArrayList.add(new Mahasiswa("Dimas Maulana", "1414370309", "123456789"));
        mahasiswaArrayList.add(new Mahasiswa("Fadly Yonk", "1214234560", "987654321"));
        mahasiswaArrayList.add(new Mahasiswa("Ariyandi Nugraha", "1214230345", "987648765"));
        mahasiswaArrayList.add(new Mahasiswa("Aham Siswana", "1214378098", "098758124"));
        mahasiswaArrayList.add(new Mahasiswa("Rahadi Jalu", "235121344", "0812345355"));
        mahasiswaArrayList.add(new Mahasiswa("Muhammad Luqman", "123445560", "099877384857"));
        mahasiswaArrayList.add(new Mahasiswa("Isfan Fauzi", "7879230345", "548586723"));
        mahasiswaArrayList.add(new Mahasiswa("Geri Yesa", "00904378098", "928986872"));
    }

}