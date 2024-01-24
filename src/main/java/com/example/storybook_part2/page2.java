package com.example.storybook_part2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class page2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);

    }

    public void goToPage9(View view) {
        Intent i = getIntent();
        Intent intent = new Intent(this, page9.class);
        intent.putExtras(i);
        startActivity(intent);
        finish();
    }

    public void goToPage3(View view) {
        Intent i = getIntent();
        Intent intent = new Intent(this, page3.class);
        intent.putExtras(i);
        startActivity(intent);
        finish();
    }
}
