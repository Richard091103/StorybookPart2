package com.example.storybook_part2;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class page1 extends AppCompatActivity {

    EditText pangalan;
    String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page1);
        pangalan = findViewById(R.id.pangalan);
    }

    public void goToPage9(View view) {
        name = pangalan.getText().toString();
        Log.d("Page1", "Name entered: " + name);
        Intent i = new Intent(this, page9.class);
        i.putExtra("name", name);
        startActivity(i);
    }

    public void onBackPressed() {
        // This will finish the current activity and go back to the previous one
        super.onBackPressed();
    }
}
