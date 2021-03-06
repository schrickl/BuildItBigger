package com.bill.android.jokedisplayerandroidlib;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class JokeDisplayerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke_teller);

        TextView mJokeView = findViewById(R.id.tv_joke);
        String mTheJoke = getIntent().getStringExtra(getResources().getString(R.string.joke_extra));
        if (mTheJoke != null) {
            mJokeView.setText(mTheJoke);
        } else {
            mJokeView.setText(getResources().getString(R.string.joke_error));
        }
    }
}
