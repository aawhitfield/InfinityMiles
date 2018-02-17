package com.infinitylabs.infinitymiles;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;

import static com.infinitylabs.infinitymiles.R.*;
import static com.infinitylabs.infinitymiles.R.id.battleshipView;
import static com.infinitylabs.infinitymiles.R.id.buttonA2;
import static com.infinitylabs.infinitymiles.R.id.buttonA3;
import static com.infinitylabs.infinitymiles.R.layout.activity_battleship;
import static com.infinitylabs.infinitymiles.R.string.*;
import static com.infinitylabs.infinitymiles.R.string.toastHit;
import static com.infinitylabs.infinitymiles.R.string.toastMiss;


public class BattleshipActivity extends AppCompatActivity {

    String selection = "";
    ArrayList<Integer> shipLocations;

    public void returnHome(View view)
    {
        finish();
    }



    public void displayResult(View view) {
        if(shipLocations.contains(view.getId()))

        {
            Toast.makeText(getApplicationContext(), toastHit,
                    Toast.LENGTH_SHORT)
                    .show();
        } else {
            Toast.makeText(getApplicationContext(), toastMiss,
                    Toast.LENGTH_SHORT)
                    .show();
        }

        Button b = (Button) view.findViewById(view.getId());
        b.setText(alreadyChosen);
        b.setEnabled(false);

    }
        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //getActionBar().setDisplayHomeAsUpEnabled(true);
        setContentView(activity_battleship);

        shipLocations = new ArrayList<Integer>();

        shipLocations.add(id.buttonA2);
        shipLocations.add(id.buttonA3);
    }
}
