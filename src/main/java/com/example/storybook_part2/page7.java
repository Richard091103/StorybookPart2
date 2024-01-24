package com.example.storybook_part2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class page7 extends AppCompatActivity {

    TextView text;
    String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page7);
        text = findViewById(R.id.text);

        Intent i = getIntent();
        name = i.getStringExtra("name");
        Log.d("Page3", "Received name: " + name);

        if (name != null) {
            text.setText("With a smile, " + name + " added,‘Let our two kingdoms unite for peace!’");
        } else {
            text.setText("Error: Name is null");
        }
    }

    public void goToPage6(View view) {
        Intent i = getIntent();
        Intent intent = new Intent(this, page6.class);
        intent.putExtras(i);
        startActivity(intent);
        finish();
    }

    public void goToPage8(View view) {
        Intent i = getIntent();
        Intent intent = new Intent(this, page8.class);
        intent.putExtras(i);
        startActivity(intent);
        finish();
    }
}