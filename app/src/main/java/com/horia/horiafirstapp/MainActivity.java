package com.horia.horiafirstapp;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

import java.util.Random;


public class MainActivity extends ActionBarActivity {

    public final static String EXTRA_MESSAGE = "com.horia.horiafirstapp.MESSAGE";
    public final static int EXERCISE_TYPE_TO_PASS = 0;

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

    // Called when the user clicks the Send button
    public void sendMessage(View view) {

        int exercise_type=0;

        switch (view.getId()) {
            case R.id.button_legs:
                exercise_type = 1;
                break;
            case R.id.button_chest:
                exercise_type = 2;
                break;
            case R.id.button_back:
                exercise_type = 3;
                break;
            case R.id.button:
                exercise_type = 0;
                break;
        }

        Intent intent = new Intent(this, DisplayMessageActivity.class);
        String message = GenerateRandom.generateRandom(exercise_type);
        intent.putExtra(EXTRA_MESSAGE, message);
        intent.putExtra("EXERCISE_TYPE_TO_PASS", exercise_type);
        startActivity(intent);
    }


}
