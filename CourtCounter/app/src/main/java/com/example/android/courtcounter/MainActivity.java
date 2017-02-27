package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int totalScoreA = 0;
    int totalScoreB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void onPoint3A(View view){
        totalScoreA = totalScoreA + 3;
        displayForTeamA(totalScoreA);
    }

    public void onPoint2A(View view){
        totalScoreA = totalScoreA + 2;
        displayForTeamA(totalScoreA);
    }

    public void onFreeThrowA(View view){
        totalScoreA = totalScoreA + 1;
        displayForTeamA(totalScoreA);
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void onPoint3B(View view){
        totalScoreB = totalScoreB + 3;
        displayForTeamB(totalScoreB);
    }

    public void onPoint2B(View view){
        totalScoreB = totalScoreB + 2;
        displayForTeamB(totalScoreB);
    }

    public void onFreeThrowB(View view){
        totalScoreB = totalScoreB + 1;
        displayForTeamB(totalScoreB);
    }

    public void resetAll(View view){
        totalScoreA = 0;
        totalScoreB = 0;
        displayForTeamA(totalScoreA);
        displayForTeamB(totalScoreB);
    }
}

