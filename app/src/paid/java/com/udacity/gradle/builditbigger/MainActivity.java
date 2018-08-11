package com.udacity.gradle.builditbigger;

import android.content.Intent;
import com.bill.android.jokedisplayerandroidlib.JokeDisplayerActivity;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.bill.android.jokeproviderjavalib.JokeProvider;


public class MainActivity extends AppCompatActivity {

    private JokeProvider mJp = new JokeProvider();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void tellJoke(View view) {
        //new TellJokeTask().execute(this);
        Intent intent = new Intent(this, JokeDisplayerActivity.class);
        intent.putExtra(getResources().getString(R.string.joke_extra), mJp.getJoke());
        startActivity(intent);
    }
}
