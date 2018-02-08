package com.infinitylabs.infinitymiles;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;

import static com.infinitylabs.infinitymiles.R.id.battleshipView;
import static com.infinitylabs.infinitymiles.R.id.buttonA2;
import static com.infinitylabs.infinitymiles.R.id.buttonA3;
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
        if ((view.getId() == buttonA2) || (view.getId() == buttonA3))

        {
            Toast.makeText(getApplicationContext(), R.string.toastHit,
                    Toast.LENGTH_SHORT)
                    .show();
        } else {
            Toast.makeText(getApplicationContext(), toastMiss,
                    Toast.LENGTH_SHORT)
                    .show();
        }

        View b = findViewById(view.getId());
        b.setVisibility(View.GONE);

    }
        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_battleship);

        shipLocations = new ArrayList<Integer>();

        shipLocations.add(R.id.buttonA2);
        shipLocations.add(R.id.buttonA3);
    }
}
