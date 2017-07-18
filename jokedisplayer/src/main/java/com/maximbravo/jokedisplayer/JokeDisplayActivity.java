package com.maximbravo.jokedisplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by Maxim Bravo on 7/18/2017.
 */

public class JokeDisplayActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke_display);

        TextView jokeTextView = (TextView) findViewById(R.id.joke_text);

        Intent jokeIntent = getIntent();
        if(jokeIntent != null) {
            if(jokeIntent.hasExtra("joke")) {
                String joke = jokeIntent.getStringExtra("joke");
                jokeTextView.setText(joke);
            }
        }
    }
}
