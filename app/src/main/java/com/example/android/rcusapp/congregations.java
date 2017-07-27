package com.example.android.rcusapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class congregations extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_congregations);
        setTitle("RCUS > Congregations");

        // Find the View that shows the classis category
        TextView classis = (TextView) findViewById(R.id.byClassis);

        // Set a click listener on that View
        classis.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the classis category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link ClassisActivity}
                Intent classisIntent = new Intent(congregations.this, classis.class);

                // Start the new activity
                startActivity(classisIntent);
            }
        });
    }
}
