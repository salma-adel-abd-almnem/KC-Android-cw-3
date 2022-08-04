package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView textView= findViewById(R.id.textView8);
        TextView textView1=findViewById(R.id.textView7);
        EditText editText=findViewById(R.id.editTextTextPersonName6);
        EditText editText1=findViewById(R.id.editTextTextPersonName5);
        Button button=findViewById(R.id.button3);
    }
}