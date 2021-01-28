package com.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int i=0,j=0;
    public void incrementByThree(View view)
    {
        i=i+3;
        displayForTeamA(i);
    }
    public void incrementByThree3(View view)
    {
        j=j+3;
        displayForTeamB(j);
    }
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void incrementByTwo(View view) {
        i=i+2;
        displayForTeamA(i);
    }
    public void incrementByTwo2(View view) {
        j=j+2;
        displayForTeamB(j);
    }
    public void incrementByOne(View view) {
        i=i+1;
        displayForTeamA(i);
    }
    public void incrementByOne1(View view) {
        j=j+1;
        displayForTeamB(j);
    }

    public void displayScores(View view) {
        j=0;
        i=0;
        displayForTeamB(j);
        displayForTeamA(i);
    }
}