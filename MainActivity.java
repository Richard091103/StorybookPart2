package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText pangalan;
    String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pangalan = findViewById(R.id.pangalan);
    }

    public void goToPage2(View view) {
        name = pangalan.getText().toString();
        Toast.makeText(this, "Hello, "+name+"!", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(this, page2.class);
        i.putExtra("name",name);
        startActivity(i);
    }
}