package com.example.android.rnr;

import android.app.Activity;
import android.content.Context;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    /**
     * These methods will add DONE button for closing keybord after enter the name of the band.
     */

    class DoneOnEditorActionListener implements TextView.OnEditorActionListener {
        @Override
        public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
            if (actionId == EditorInfo.IME_ACTION_DONE) {
                InputMethodManager imm = (InputMethodManager)v.getContext().getSystemService(Context.INPUT_METHOD_SERVICE);
                imm.hideSoftInputFromWindow(v.getWindowToken(), 0);
                return true;
            }
            return false;
        }
    }

    public class SampleActivity extends Activity {
        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main); // sample_activity_layout contains our target EditText, target_edittext

            EditText Band1EditText = (EditText)findViewById(R.id.band1);
            Band1EditText.setOnEditorActionListener(new DoneOnEditorActionListener());

            EditText Band2EditText = (EditText)findViewById(R.id.band2);
            Band2EditText.setOnEditorActionListener(new DoneOnEditorActionListener());

            EditText Band3EditText = (EditText)findViewById(R.id.band3);
            Band3EditText.setOnEditorActionListener(new DoneOnEditorActionListener());

        }
    }

    /**
     * Prices
     */
    int priceOfHeineken = 100;
    int priceOfImperial = 75;
    int priceOfIsenbeck = 55;
    int priceOfLevite = 25;
    int priceOfGasiosa = 55;

    /**
     * Room1
     */

    int quantityHeinekenRoom1 = 0;
    int quantityImperialRoom1 = 0;
    int quantityIsenbeckRoom1 = 0;
    int quantityLeviteRoom1 = 0;
    int quantityGasiosaRoom1 = 0;
    int totalRoom1 = 0;


    /**
     * Room2
     */

    int quantityHeinekenRoom2 = 0;
    int quantityImperialRoom2 = 0;
    int quantityIsenbeckRoom2 = 0;
    int quantityLeviteRoom2 = 0;
    int quantityGasiosaRoom2 = 0;
    int totalRoom2 = 0;

    /**
     * Room3
     */

    int quantityHeinekenRoom3 = 0;
    int quantityImperialRoom3 = 0;
    int quantityIsenbeckRoom3 = 0;
    int quantityLeviteRoom3 = 0;
    int quantityGasiosaRoom3 = 0;
    int totalRoom3 = 0;


    static final String STATE_SCORE_ROOM1_HEINEKEN = "HeinekenRoom1";
    static final String STATE_SCORE_ROOM1_IMPERIAL = "ImperialRoom1";
    static final String STATE_SCORE_ROOM1_ISENBECK = "IsenbeckRoom1";
    static final String STATE_SCORE_ROOM1_LEVITE = "LeviteRoom1";
    static final String STATE_SCORE_ROOM1_GASIOSA = "GasiosaRoom1";
    static final String STATE_SCORE_ROOM1_TOTAL = "totalRoom1";

    static final String STATE_SCORE_ROOM2_HEINEKEN = "HeinekenRoom2";
    static final String STATE_SCORE_ROOM2_IMPERIAL = "ImperialRoom2";
    static final String STATE_SCORE_ROOM2_ISENBECK = "IsenbeckRoom2";
    static final String STATE_SCORE_ROOM2_LEVITE = "LeviteRoom2";
    static final String STATE_SCORE_ROOM2_GASIOSA = "GasiosaRoom2";
    static final String STATE_SCORE_ROOM2_TOTAL = "totalRoom2";

    static final String STATE_SCORE_ROOM3_HEINEKEN = "HeinekenRoom3";
    static final String STATE_SCORE_ROOM3_IMPERIAL = "ImperialRoom3";
    static final String STATE_SCORE_ROOM3_ISENBECK = "IsenbeckRoom3";
    static final String STATE_SCORE_ROOM3_LEVITE = "LeviteRoom3";
    static final String STATE_SCORE_ROOM3_GASIOSA = "GasiosaRoom3";
    static final String STATE_SCORE_ROOM3_TOTAL = "totalRoom3";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * To save and restore the data after switching between Portrait/Landscape mode.
     */


    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        // Save the user's current score state Room 1
        savedInstanceState.putInt(STATE_SCORE_ROOM1_HEINEKEN, quantityHeinekenRoom1);
        savedInstanceState.putInt(STATE_SCORE_ROOM1_IMPERIAL, quantityImperialRoom1);
        savedInstanceState.putInt(STATE_SCORE_ROOM1_ISENBECK, quantityIsenbeckRoom1);
        savedInstanceState.putInt(STATE_SCORE_ROOM1_LEVITE, quantityLeviteRoom1);
        savedInstanceState.putInt(STATE_SCORE_ROOM1_GASIOSA, quantityGasiosaRoom1);
        savedInstanceState.putInt(STATE_SCORE_ROOM1_TOTAL, totalRoom1);

        // Save the user's current score state Room 2
        savedInstanceState.putInt(STATE_SCORE_ROOM2_HEINEKEN, quantityHeinekenRoom2);
        savedInstanceState.putInt(STATE_SCORE_ROOM2_IMPERIAL, quantityImperialRoom2);
        savedInstanceState.putInt(STATE_SCORE_ROOM2_ISENBECK, quantityIsenbeckRoom2);
        savedInstanceState.putInt(STATE_SCORE_ROOM2_LEVITE, quantityLeviteRoom2);
        savedInstanceState.putInt(STATE_SCORE_ROOM2_GASIOSA, quantityGasiosaRoom2);
        savedInstanceState.putInt(STATE_SCORE_ROOM2_TOTAL, totalRoom2);

        // Save the user's current score state Room 3
        savedInstanceState.putInt(STATE_SCORE_ROOM3_HEINEKEN, quantityHeinekenRoom3);
        savedInstanceState.putInt(STATE_SCORE_ROOM3_IMPERIAL, quantityImperialRoom3);
        savedInstanceState.putInt(STATE_SCORE_ROOM3_ISENBECK, quantityIsenbeckRoom3);
        savedInstanceState.putInt(STATE_SCORE_ROOM3_LEVITE, quantityLeviteRoom3);
        savedInstanceState.putInt(STATE_SCORE_ROOM3_GASIOSA, quantityGasiosaRoom3);
        savedInstanceState.putInt(STATE_SCORE_ROOM3_TOTAL, totalRoom3);

        // Always call the superclass so it can save the view hierarchy state
        super.onSaveInstanceState(savedInstanceState);
    }

    public void onRestoreInstanceState(Bundle savedInstanceState) {
        // Always call the superclass so it can restore the view hierarchy
        super.onRestoreInstanceState(savedInstanceState);

        // Restore state members from saved instance Room1
        quantityHeinekenRoom1 = savedInstanceState.getInt(STATE_SCORE_ROOM1_HEINEKEN);
        quantityImperialRoom1 = savedInstanceState.getInt(STATE_SCORE_ROOM1_IMPERIAL);
        quantityIsenbeckRoom1 = savedInstanceState.getInt(STATE_SCORE_ROOM1_ISENBECK);
        quantityLeviteRoom1 = savedInstanceState.getInt(STATE_SCORE_ROOM1_LEVITE);
        quantityGasiosaRoom1 = savedInstanceState.getInt(STATE_SCORE_ROOM1_GASIOSA);
        totalRoom1 = savedInstanceState.getInt(STATE_SCORE_ROOM1_TOTAL);

        // Restore state members from saved instance Room2
        quantityHeinekenRoom2 = savedInstanceState.getInt(STATE_SCORE_ROOM2_HEINEKEN);
        quantityImperialRoom2 = savedInstanceState.getInt(STATE_SCORE_ROOM2_IMPERIAL);
        quantityIsenbeckRoom2 = savedInstanceState.getInt(STATE_SCORE_ROOM2_ISENBECK);
        quantityLeviteRoom2 = savedInstanceState.getInt(STATE_SCORE_ROOM2_LEVITE);
        quantityGasiosaRoom2 = savedInstanceState.getInt(STATE_SCORE_ROOM2_GASIOSA);
        totalRoom2 = savedInstanceState.getInt(STATE_SCORE_ROOM2_TOTAL);

        // Restore state members from saved instance Room3
        quantityHeinekenRoom3 = savedInstanceState.getInt(STATE_SCORE_ROOM3_HEINEKEN);
        quantityImperialRoom3 = savedInstanceState.getInt(STATE_SCORE_ROOM3_IMPERIAL);
        quantityIsenbeckRoom3 = savedInstanceState.getInt(STATE_SCORE_ROOM3_ISENBECK);
        quantityLeviteRoom3 = savedInstanceState.getInt(STATE_SCORE_ROOM3_LEVITE);
        quantityGasiosaRoom3 = savedInstanceState.getInt(STATE_SCORE_ROOM3_GASIOSA);
        totalRoom3 = savedInstanceState.getInt(STATE_SCORE_ROOM3_TOTAL);


        displayHeinekenRoom1 (quantityHeinekenRoom1);
        displayImperialRoom1 (quantityImperialRoom1);
        displayIsenbeckRoom1(quantityIsenbeckRoom1);
        displayLeviteRoom1(quantityLeviteRoom1);
        displayGasiosaRoom1(quantityGasiosaRoom1);
        displayTotalRoom1(totalRoom1);

        displayHeinekenRoom2 (quantityHeinekenRoom2);
        displayImperialRoom2 (quantityImperialRoom2);
        displayIsenbeckRoom2(quantityIsenbeckRoom2);
        displayLeviteRoom2(quantityLeviteRoom2);
        displayGasiosaRoom2(quantityGasiosaRoom2);
        displayTotalRoom2(totalRoom2);

        displayHeinekenRoom3 (quantityHeinekenRoom3);
        displayImperialRoom3 (quantityImperialRoom3);
        displayIsenbeckRoom3(quantityIsenbeckRoom3);
        displayLeviteRoom3(quantityLeviteRoom3);
        displayGasiosaRoom3(quantityGasiosaRoom3);
        displayTotalRoom3(totalRoom3);
    }


    /**
     *Add quantity of the drinks for Room1.
     */

    public void addHeinekenRoom1 (View view) {
        quantityHeinekenRoom1 +=  1;
        totalRoom1 = totalRoom1 + priceOfHeineken;
        displayHeinekenRoom1(quantityHeinekenRoom1);
        displayTotalRoom1(totalRoom1);
    }
    public void addImperialRoom1 (View view) {
        quantityImperialRoom1 += 1;
        totalRoom1 = totalRoom1 + priceOfImperial;
        displayImperialRoom1(quantityHeinekenRoom1);
        displayTotalRoom1(totalRoom1);
    }

    public void addIsenbeckRoom1 (View view) {
        quantityIsenbeckRoom1 += 1;
        totalRoom1 = totalRoom1 + priceOfIsenbeck;
        displayIsenbeckRoom1(quantityIsenbeckRoom1);
        displayTotalRoom1(totalRoom1);
    }

    public void addLeviteRoom1 (View view) {
        quantityLeviteRoom1 += 1;
        totalRoom1 = totalRoom1 + priceOfLevite;
        displayLeviteRoom1(quantityLeviteRoom1);
        displayTotalRoom1(totalRoom1);
    }

    public void addGasiosaRoom1 (View view) {
        quantityGasiosaRoom1 += 1;
        totalRoom1 = totalRoom1 + priceOfGasiosa;
        displayGasiosaRoom1(quantityGasiosaRoom1);
        displayTotalRoom1(totalRoom1);
    }


    /**
     *Add quantity of the drinks for Room2.
     */

    public void addHeinekenRoom2 (View view) {
        quantityHeinekenRoom2 +=  1;
        totalRoom2 = totalRoom2 + priceOfHeineken;
        displayHeinekenRoom2(quantityHeinekenRoom2);
        displayTotalRoom2(totalRoom2);
    }
    public void addImperialRoom2 (View view) {
        quantityImperialRoom2 += 1;
        totalRoom2 = totalRoom2 + priceOfImperial;
        displayImperialRoom2(quantityImperialRoom2);
        displayTotalRoom2(totalRoom2);
    }

    public void addIsenbeckRoom2 (View view) {
        quantityIsenbeckRoom2 += 1;
        totalRoom2 = totalRoom2 + priceOfIsenbeck;
        displayIsenbeckRoom2(quantityIsenbeckRoom2);
        displayTotalRoom2(totalRoom2);
    }

    public void addLeviteRoom2 (View view) {
        quantityLeviteRoom2 += 1;
        totalRoom2 = totalRoom2 + priceOfLevite;
        displayLeviteRoom2(quantityLeviteRoom2);
        displayTotalRoom2(totalRoom2);
    }

    public void addGasiosaRoom2 (View view) {
        quantityGasiosaRoom2 += 1;
        totalRoom2 = totalRoom2 + priceOfGasiosa;
        displayGasiosaRoom2(quantityGasiosaRoom2);
        displayTotalRoom2(totalRoom2);
    }

    /**
     *Add quantity of the drinks for Room3.
     */

    public void addHeinekenRoom3 (View view) {
        quantityHeinekenRoom3 +=  1;
        totalRoom3 = totalRoom3 + priceOfHeineken;
        displayHeinekenRoom3(quantityHeinekenRoom3);
        displayTotalRoom3(totalRoom3);
    }
    public void addImperialRoom3 (View view) {
        quantityImperialRoom3 += 1;
        totalRoom3 = totalRoom3 + priceOfImperial;
        displayImperialRoom3(quantityImperialRoom3);
        displayTotalRoom3(totalRoom3);
    }

    public void addIsenbeckRoom3 (View view) {
        quantityIsenbeckRoom3 += 1;
        totalRoom3 = totalRoom3 + priceOfIsenbeck;
        displayIsenbeckRoom3(quantityIsenbeckRoom3);
        displayTotalRoom3(totalRoom3);
    }

    public void addLeviteRoom3 (View view) {
        quantityLeviteRoom3 += 1;
        totalRoom3 = totalRoom3 + priceOfLevite;
        displayLeviteRoom3(quantityLeviteRoom3);
        displayTotalRoom3(totalRoom3);
    }

    public void addGasiosaRoom3 (View view) {
        quantityGasiosaRoom3 += 1;
        totalRoom3 = totalRoom3 + priceOfGasiosa;
        displayGasiosaRoom3(quantityGasiosaRoom3);
        displayTotalRoom3(totalRoom3);
    }



    /**
     *Reset the quantity of all the drinks in the Room1.
     */

    public void ResetRoom1 (View view){
        quantityHeinekenRoom1 = 0;
        quantityImperialRoom1 = 0;
        quantityIsenbeckRoom1 = 0;
        quantityLeviteRoom1 = 0;
        quantityGasiosaRoom1 = 0;
        totalRoom1 = 0;
        displayHeinekenRoom1(quantityHeinekenRoom1);
        displayImperialRoom1(quantityImperialRoom1);
        displayIsenbeckRoom1(quantityIsenbeckRoom1);
        displayLeviteRoom1(quantityLeviteRoom1);
        displayGasiosaRoom1(quantityGasiosaRoom1);
        displayTotalRoom1(totalRoom1);
        EditText Band1EditText = (EditText)findViewById(R.id.band1);
        Band1EditText.getText().clear();
    }

    /**
     *Reset the quantity of all the drinks in the Room2.
     */

    public void ResetRoom2 (View view){
        quantityHeinekenRoom2 = 0;
        quantityImperialRoom2 = 0;
        quantityIsenbeckRoom2 = 0;
        quantityLeviteRoom2 = 0;
        quantityGasiosaRoom2 = 0;
        totalRoom2 = 0;
        displayHeinekenRoom2(quantityHeinekenRoom2);
        displayImperialRoom2(quantityImperialRoom2);
        displayIsenbeckRoom2(quantityIsenbeckRoom2);
        displayLeviteRoom2(quantityLeviteRoom2);
        displayGasiosaRoom2(quantityGasiosaRoom2);
        displayTotalRoom2(totalRoom2);
        EditText Band1EditText = (EditText)findViewById(R.id.band2);
        Band1EditText.getText().clear();
    }

    /**
     *Reset the quantity of all the drinks in the Room3.
     */

    public void ResetRoom3 (View view){
        quantityHeinekenRoom3 = 0;
        quantityImperialRoom3 = 0;
        quantityIsenbeckRoom3 = 0;
        quantityLeviteRoom3 = 0;
        quantityGasiosaRoom3 = 0;
        totalRoom3 = 0;
        displayHeinekenRoom3(quantityHeinekenRoom3);
        displayImperialRoom3(quantityImperialRoom3);
        displayIsenbeckRoom3(quantityIsenbeckRoom3);
        displayLeviteRoom3(quantityLeviteRoom3);
        displayGasiosaRoom3(quantityGasiosaRoom3);
        displayTotalRoom3(totalRoom3);
        EditText Band1EditText = (EditText)findViewById(R.id.band3);
        Band1EditText.getText().clear();
    }






    /**
     * Display the number of drinks for Room1.
     * @param number
     */

    private void displayHeinekenRoom1 (int number) {
        TextView HeinekenRoom1TextView = (TextView) findViewById(R.id.quantity_of_Heineken_room1);
        HeinekenRoom1TextView.setText ("" + number);
    }

    private void displayImperialRoom1 (int number) {
        TextView ImperialRoom1TextView = (TextView) findViewById(R.id.quantity_of_Imperial_room1);
        ImperialRoom1TextView.setText ("" + number);
    }

    private void displayIsenbeckRoom1 (int number) {
        TextView IsenbeckRoom1TextView = (TextView) findViewById(R.id.quantity_of_Isenbeck_room1);
        IsenbeckRoom1TextView.setText ("" + number);
    }

    private void displayLeviteRoom1 (int number) {
        TextView LeviteRoom1TextView = (TextView) findViewById(R.id.quantity_of_Levite_room1);
        LeviteRoom1TextView.setText ("" + number);
    }

    private void displayGasiosaRoom1 (int number) {
        TextView GasiosaRoom1TextView = (TextView) findViewById(R.id.quantity_of_Gasiosa_room1);
        GasiosaRoom1TextView.setText ("" + number);
    }


    /**
     * Display the number of drinks for Room2.
     * @param number
     */

    private void displayHeinekenRoom2 (int number) {
        TextView HeinekenRoom1TextView = (TextView) findViewById(R.id.quantity_of_Heineken_room2);
        HeinekenRoom1TextView.setText ("" + number);
    }

    private void displayImperialRoom2 (int number) {
        TextView ImperialRoom1TextView = (TextView) findViewById(R.id.quantity_of_Imperial_room2);
        ImperialRoom1TextView.setText ("" + number);
    }

    private void displayIsenbeckRoom2 (int number) {
        TextView IsenbeckRoom1TextView = (TextView) findViewById(R.id.quantity_of_Isenbeck_room2);
        IsenbeckRoom1TextView.setText ("" + number);
    }

    private void displayLeviteRoom2 (int number) {
        TextView LeviteRoom1TextView = (TextView) findViewById(R.id.quantity_of_Levite_room2);
        LeviteRoom1TextView.setText ("" + number);
    }

    private void displayGasiosaRoom2 (int number) {
        TextView GasiosaRoom1TextView = (TextView) findViewById(R.id.quantity_of_Gasiosa_room2);
        GasiosaRoom1TextView.setText ("" + number);
    }

    /**
     * Display the number of drinks for Room3.
     * @param number
     */

    private void displayHeinekenRoom3 (int number) {
        TextView HeinekenRoom1TextView = (TextView) findViewById(R.id.quantity_of_Heineken_room3);
        HeinekenRoom1TextView.setText ("" + number);
    }

    private void displayImperialRoom3 (int number) {
        TextView ImperialRoom1TextView = (TextView) findViewById(R.id.quantity_of_Imperial_room3);
        ImperialRoom1TextView.setText ("" + number);
    }

    private void displayIsenbeckRoom3 (int number) {
        TextView IsenbeckRoom1TextView = (TextView) findViewById(R.id.quantity_of_Isenbeck_room3);
        IsenbeckRoom1TextView.setText ("" + number);
    }

    private void displayLeviteRoom3 (int number) {
        TextView LeviteRoom1TextView = (TextView) findViewById(R.id.quantity_of_Levite_room3);
        LeviteRoom1TextView.setText ("" + number);
    }

    private void displayGasiosaRoom3 (int number) {
        TextView GasiosaRoom1TextView = (TextView) findViewById(R.id.quantity_of_Gasiosa_room3);
        GasiosaRoom1TextView.setText ("" + number);
    }



    /**
     * Display the total price.
     * @param number
     */

    private void displayTotalRoom1 (int number) {
        TextView TotalRoom1TextView = (TextView) findViewById(R.id.total_room1);
        TotalRoom1TextView.setText ("" + number);
    }

    private void displayTotalRoom2 (int number) {
        TextView TotalRoom1TextView = (TextView) findViewById(R.id.total_room2);
        TotalRoom1TextView.setText ("" + number);
    }

    private void displayTotalRoom3 (int number) {
        TextView TotalRoom1TextView = (TextView) findViewById(R.id.total_room3);
        TotalRoom1TextView.setText ("" + number);
    }





}

