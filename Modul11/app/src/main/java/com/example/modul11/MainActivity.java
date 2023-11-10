package com.example.modul11;

import androidx.appcompat.app.AppCompatActivity;

import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btn1, btn2, btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = (Button) findViewById(R.id.button1);
        btn2 = (Button) findViewById(R.id.button2);
        btn3 = (Button) findViewById(R.id.button3);
    }

    public void btnClick(View view) {
        Intent tlp = new Intent(Intent.ACTION_DIAL,
                Uri.parse("tel:081234567899"));
        startActivity(tlp);
    }

    public void btn2Click(View view) {
        Intent setting = new Intent(
                android.provider.Settings.ACTION_SETTINGS);
        startActivity(setting);
        Toast.makeText(this, "you have Pressed : " +
                btn2.getText(), Toast.LENGTH_LONG).show();
    }

    public void btn3Click(View view) {
        Intent myIntent= new Intent();
        myIntent.setType("audio/mp3");
        myIntent.setAction(Intent.ACTION_GET_CONTENT);
        startActivity(myIntent);
    }
}