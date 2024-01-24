package com.example.storybook_part2;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class page3 extends AppCompatActivity {

    TextView text;
    String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page3);
        text = findViewById(R.id.text);

        Intent i = getIntent();
        name = i.getStringExtra("name");
        Log.d("Page3", "Received name: " + name);

        if (name != null) {
            text.setText("‘I can’t believe it’s time for the royal ball! exclaimed " + name + " with a mix of joy and anticipation.");
        } else {
            text.setText("Error: Name is null");
        }
    }

    public void goToPage2(View view) {
        Intent i = getIntent();
        Intent intent = new Intent(this, page2.class);
        intent.putExtras(i);
        startActivity(intent);
        finish();
    }

    public void goToPage4(View view) {
        Intent i = getIntent();
        Intent intent = new Intent(this, page4.class);
        intent.putExtras(i);
        startActivity(intent);
        finish();
    }
}
