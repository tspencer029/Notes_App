package com.example.spencetyle.notes_app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by Madeleine on 24/02/2018.
 */

public class recentlyViewed extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recently_viewed);
    }

    public void onClick(View view) {
        if(view.getId()==R.id.recentlyViewed) {
            Intent i = new Intent(recentlyViewed.this, subjectsJava.class);
            startActivity(i);
        }
    }
}
