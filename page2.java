package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class page2 extends AppCompatActivity {

    TextView hello;
    String pangalan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);
        hello = findViewById(R.id.hello);
        Intent i = getIntent();
        pangalan = i.getStringExtra("name");
        hello.setText("Noong unang panahon may nakatirang mag-ina sa isang malayong pook. Ang ina ay si Aling Rosa at ang anak ay si "pangalan + " . Mahal na mahal ni Aling Rosa ang kanyang bugtong na anak. Kaya lumaki si Pinang sa layaw.");
    }
}