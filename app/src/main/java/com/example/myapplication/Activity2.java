package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        Intent intent;
        intent = getIntent();

        String number=intent.getStringExtra("message");

        TextView textview1=(TextView) findViewById(R.id.text2);

        TextView textview2=(TextView) findViewById(R.id.text3);

textview1.setText("WELCOME WELCOME TO SOFTWARE ENGINEER");
textview2.setText(number);
    }
}
