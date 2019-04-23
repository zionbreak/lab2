package com.example.zaets42ipzlab02;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class second_activity extends AppCompatActivity {
    TextView secText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_activity);
        secText = findViewById(R.id.textView);
        String string = getIntent().getStringExtra("Message");
        secText.setText(string);
    }
}
