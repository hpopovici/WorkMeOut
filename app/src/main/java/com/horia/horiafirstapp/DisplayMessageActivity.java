package com.horia.horiafirstapp;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class DisplayMessageActivity extends ActionBarActivity {

    int exercise_type = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);
        //get the message from the intent
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        exercise_type = intent.getIntExtra("EXERCISE_TYPE_TO_PASS", 0);
        TextView view = (TextView) findViewById(R.id.exercise_name);
        //setting the text for the first exercise on the second screen
        view.setText(message);
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

    //update the text on the second screen with new exercise name
    public void newExercise(View view) {
        TextView view2 = (TextView) findViewById(R.id.exercise_name);
        view2.setText(GenerateRandom.generateRandom(exercise_type));
    }
}