package com.example.zaets42ipzlab02;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText edittext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edittext = findViewById(R.id.editText);
    }
    public void onClick(View view) {
        Intent intent = new Intent(MainActivity.this, second_activity.class);
        String message = edittext.getText().toString();
        intent.putExtra("Message", message);
        startActivity(intent);
    }
    public void secondOnClick(View view){
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.putExtra(Intent.EXTRA_TEXT, edittext.getText().toString());
        intent.setType("text/plain");
        startActivity(intent);
    }
}
