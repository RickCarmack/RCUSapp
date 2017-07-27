package com.example.android.rcusapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the View that shows the history category
        TextView history = (TextView) findViewById(R.id.history);

        // Set a click listener on that View
        history.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent historyIntent = new Intent(MainActivity.this, history.class);

                // Start the new activity
                startActivity(historyIntent);
            }
        });

        // Find the View that shows the creeds category
        TextView creeds = (TextView) findViewById(R.id.creeds);

        // Set a click listener on that View
        creeds.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the creeds category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link CreedsActivity}
                Intent creedsIntent = new Intent(MainActivity.this, creeds.class);

                // Start the new activity
                startActivity(creedsIntent);
            }
        });

        // Find the View that shows the confessions category
        TextView confessions = (TextView) findViewById(R.id.confessions);

        // Set a click listener on that View
        confessions.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the confessions category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link ConfessionsActivity}
                Intent confessionsIntent = new Intent(MainActivity.this, confessions.class);

                // Start the new activity
                startActivity(confessionsIntent);
            }
        });

        // Find the View that shows the congregations category
        TextView congregations = (TextView) findViewById(R.id.congregations);

        // Set a click listener on that View
        congregations.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the congregations category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link CongregationsActivity}
                Intent congregationsIntent = new Intent(MainActivity.this, congregations.class);

                // Start the new activity
                startActivity(congregationsIntent);
            }
        });
    }
}
