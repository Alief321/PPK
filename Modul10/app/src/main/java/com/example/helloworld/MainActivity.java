package com.example.helloworld;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView txt1;
    private Button btn1;
    private Button btn2;
    private View.OnClickListener listener;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt1 = (TextView) findViewById(R.id.txtview1);
        btn1 = (Button) findViewById(R.id.button);
        btn2 = (Button) findViewById(R.id.button2);
        listener = new View.OnClickListener(){
            public void onClick(View v){
                txt1.setText("Button 2 Clicked");
            }
        };
        btn2.setOnClickListener(listener);
    }

    public void btnClick(View view) {
        txt1.setText("Button Clicked");
    }
}