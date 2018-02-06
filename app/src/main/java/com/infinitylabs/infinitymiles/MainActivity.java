package com.infinitylabs.infinitymiles;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public void playBattleship(View view)
    {
        Intent battleshipIntent = new Intent(this, BattleshipActivity.class);
        startActivity(battleshipIntent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
