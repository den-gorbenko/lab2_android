package com.example.lab2;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SixthActivity extends AppCompatActivity {
    public static int REQUEST_CODE = 100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sixth);
        //id for img and text
        ImageView imageView5 = findViewById(R.id.imageView8);
        TextView textView2 = findViewById(R.id.textView5);

    }
}


