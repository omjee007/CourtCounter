package com.example.omjee.courtcounter;

import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import static com.example.omjee.courtcounter.R.id.score_teamA;

public class MainActivity extends AppCompatActivity {
    int counter_score = 0;
    int counter_scoreB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        display(counter_score);
        displayb(counter_scoreB);
    }

    // The  display method of the Team A.
    public void display(int a) {
        TextView Score_teamA = (TextView) findViewById(R.id.score_teamA);
        Score_teamA.setText("" + a);
    }

    //This method is called when +3 button is clicked
    public void threeincrement(View view) {
        counter_score = counter_score + 3;
        display(counter_score);
    }

    //This method is called when the +2 button is clicked
    public void twoincrement(View view) {
        counter_score = counter_score + 2;
        display(counter_score);
    }

    //this method is called for a free throw
    public void freeThrow(View view) {
        counter_score = counter_score + 1;
        display(counter_score);
    }

    public void displayb(int b) {
        TextView score_teamB = (TextView) findViewById(R.id.score_teamB);
        score_teamB.setText("" + b);
    }

    public void increment3(View view) {
        counter_scoreB = counter_scoreB + 3;
        displayb(counter_scoreB);
    }

    public void increment2(View view) {
        counter_scoreB = counter_scoreB + 2;
        displayb(counter_scoreB);
    }

    public void frethrow(View view) {
        counter_scoreB = counter_scoreB + 1;
        displayb(counter_scoreB);
    }

    public void reset(View view) {
        display(0);
        displayb(0);
    }
}
