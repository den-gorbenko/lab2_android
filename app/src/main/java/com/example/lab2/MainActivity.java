package com.example.lab2;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static int REQUEST_CODE = 100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //id for botton
        Button button = findViewById(R.id.button);
        //button click transition in SecondActivity
        button.setOnClickListener(v -> {
            Intent intent = new Intent(this, SecondActivity.class);
            startActivityForResult(intent, REQUEST_CODE);
        });

    }
}

