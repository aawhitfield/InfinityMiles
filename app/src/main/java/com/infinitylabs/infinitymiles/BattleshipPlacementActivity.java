package com.infinitylabs.infinitymiles;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class BattleshipPlacementActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_battleship_placement);

        Intent battleshipIntent = new Intent(this, BattleshipActivity.class);
        startActivity(battleshipIntent);
    }
}
