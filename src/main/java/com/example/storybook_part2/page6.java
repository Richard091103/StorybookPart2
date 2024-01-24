package com.example.storybook_part2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class page6 extends AppCompatActivity {

    TextView text;
    String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page6);
        text = findViewById(R.id.text);

        Intent i = getIntent();
        name = i.getStringExtra("name");
        Log.d("Page3", "Received name: " + name);

        if (name != null) {
            text.setText(name + " replied, ‘We would be honored to help.’");
        } else {
            text.setText("Error: Name is null");
        }
    }

    public void goToPage5(View view) {
        Intent i = getIntent();
        Intent intent = new Intent(this, page5.class);
        intent.putExtras(i);
        startActivity(intent);
        finish();
    }

    public void goToPage7(View view) {
        Intent i = getIntent();
        Intent intent = new Intent(this, page7.class);
        intent.putExtras(i);
        startActivity(intent);
        finish();
    }
}