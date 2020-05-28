package com.example.lab2;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    public static int REQUEST_CODE = 100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        //id for botton and img
        Button button2 = findViewById(R.id.button2);
        Button button3 = findViewById(R.id.button3);
        Button button4 = findViewById(R.id.button4);
        Button button5 = findViewById(R.id.button5);
        ImageView imageView1 = findViewById(R.id.imageView1);
        ImageView imageView2 = findViewById(R.id.imageView2);
        ImageView imageView3 = findViewById(R.id.imageView3);
        ImageView imageView4 = findViewById(R.id.imageView4);
        //button click transition in ThirdActivity
        button2.setOnClickListener(v -> {
            Intent intent = new Intent(this, ThirdActivity.class);
            startActivityForResult(intent, REQUEST_CODE);
        });
        //button click transition in FourthActivity
        button3.setOnClickListener(v -> {
            Intent intent2 = new Intent(this, FourthActivity.class);
            startActivityForResult(intent2, REQUEST_CODE);
        });
        //button click transition in FifthActivity
        button4.setOnClickListener(v -> {
            Intent intent3 = new Intent(this, FifthActivity.class);
            startActivityForResult(intent3, REQUEST_CODE);
        });
        //button click transition in SixthActivity
        button5.setOnClickListener(v -> {
            Intent intent4 = new Intent(this, SixthActivity.class);
            startActivityForResult(intent4, REQUEST_CODE);
        });
    }

}