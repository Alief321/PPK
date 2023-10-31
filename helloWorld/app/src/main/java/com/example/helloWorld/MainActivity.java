package com.example.helloWorld;

import androidx.appcompat.app.AppCompatActivity;
import com.example.helloWorld.R;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String MyActivityTag =
            "lifecycle";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(MyActivityTag, "onCreate State");
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.i(MyActivityTag, "onStart State");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.i(MyActivityTag, "onResume State");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.i(MyActivityTag, "onPause State");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.i(MyActivityTag, "onStop State");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.i(MyActivityTag, "onDestroy State");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(MyActivityTag, "onRestart State");
    }
}
