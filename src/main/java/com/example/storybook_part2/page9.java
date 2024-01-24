package com.example.storybook_part2;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class page9 extends AppCompatActivity {

    TextView text;
    String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page9);

        // Initialize the TextView
        text = findViewById(R.id.text);

        Intent i = getIntent();
        name = i.getStringExtra("name");
        Log.d("Page3", "Received name: " + name);

        if (name != null) {
            text.setText(name);
        } else {
            text.setText("Error: Name is null");
        }
    }

    public void goToPage1(View view) {
        Intent i = getIntent();
        Intent intent = new Intent(this, page1.class);
        intent.putExtras(i);
        startActivity(intent);
        finish();
    }

    public void goToPage2(View view) {
        Intent i = getIntent();
        Intent intent = new Intent(this, page2.class);
        intent.putExtras(i);
        startActivity(intent);
        finish();
    }
}
