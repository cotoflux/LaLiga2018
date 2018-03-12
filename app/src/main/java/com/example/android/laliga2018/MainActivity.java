package com.example.android.laliga2018;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    int puntob = 0;
    int puntom = 0;
    int rfaultb = 0;
    int rfaultm = 0;
    int yfaultb = 0;
    int yfaultm = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(puntob);
        displayForTeamB(puntom);
        displayForRedFaultB(rfaultb);
        displayForRedFaultM(rfaultm);
        displayForYellFaultB(yfaultb);
        displayForYellFaultM(yfaultm);

    }


    /** This method is called when the order button is clicked **/

    //for Goal

    public void puntob(View view) {
        puntob = puntob + 1;
        displayForTeamA(puntob);
    }

    public void puntom(View view) {
        puntom = puntom + 1;
        displayForTeamB(puntom);
    }

    // for red card

    public void rfaultb(View view){
        rfaultb = rfaultb + 1;
        displayForRedFaultB(rfaultb);
    }

    public void rfaultm(View view){
        rfaultm = rfaultm + 1;
        displayForRedFaultM(rfaultm);
    }

    // for yellow card

    public void yfaultb(View view){
        yfaultb = yfaultb + 1;
        displayForYellFaultB(yfaultb);
    }

    public void yfaultm(View view){
        yfaultm = yfaultm + 1;
        displayForYellFaultM(yfaultm);
    }



    /** Displays back to 0 all scores with one resset button**/

    public void reset(View view) {
        puntob = 0;
        puntom = 0;
        rfaultb = 0;
        rfaultm = 0;
        yfaultb = 0;
        yfaultm = 0;
        displayForTeamA(puntob);
        displayForTeamB(puntom);
        displayForRedFaultB(rfaultb);
        displayForRedFaultM(rfaultm);
        displayForYellFaultB(yfaultb);
        displayForYellFaultM(yfaultm);
    }

    /**
     * Displays the given Goal for Barça.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given Goal for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the red faults for Barça.
     */
    public void displayForRedFaultB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_bar_redc);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the red faults  for Madrid.
     */
    public void displayForRedFaultM(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_mad_redc);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the yellow faults for Barça.
     */
    public void displayForYellFaultB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_bar_yellowc);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the yellow faults  for Madrid.
     */
    public void displayForYellFaultM(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_mad_yellowc);
        scoreView.setText(String.valueOf(score));
    }

}


