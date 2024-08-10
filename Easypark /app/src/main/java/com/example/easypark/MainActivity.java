package com.example.easypark;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton; // Ensure to use ImageButton if applicable
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton startButton = findViewById(R.id.start_button); // Ensure this is an ImageButton
        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to Screen2Activity
                Intent intent = new Intent(MainActivity.this, Screen2Activity.class);
                startActivity(intent);

                // Optional: Display a Toast message
                Toast.makeText(MainActivity.this, "Navigating to Screen2", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
