package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
   // public static final String EXTRA_TEXT="com.example.myapplication.EXTRA_TEXT";

    private Button h1,c1;
private TextView t1;
    String counter;
private int numCounter=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1=(TextView)findViewById(R.id.text1);
        Button h1=(Button)findViewById(R.id.hello1);

        h1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {




                 counter=t1.getText().toString();
                Intent intent=new Intent(MainActivity.this,Activity2.class);

               // intent.putExtra(Intent.EXTRA_TEXT,counter );
                intent.putExtra("message",counter);
                startActivity(intent);
                finish();
            }
        });
        Button c1=(Button)findViewById(R.id.count);
        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView texts=(TextView)findViewById(R.id.text1);
numCounter++;
texts.setText(Integer.toString(numCounter));

            }
        });


    }

}
