package com.royalcoast.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void scoreThree(View view){
        score += 3;
        display(score);
    }

    public void scoreTwo(View view){
        score += 2;
        display(score);
    }

    public void freeThrow(View view){
        score += 1;
        display(score);
    }

    public void resetScore(View view){
        score = 0;
        display(score);
    }

    public void display(int number){
        TextView displayScore = findViewById(R.id.score);
        displayScore.setText("" + number);
    }
}
