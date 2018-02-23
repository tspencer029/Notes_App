package com.example.spencetyle.notes_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class subjectsJava extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.subjects);
    }
    public void onClick(View view) {
        if (view.getId() == R.id.recentlyViewed) {
            Intent i = new Intent(subjectsJava.this, recentlyViewed.class);
            startActivity(i);
        }
    }
}
