package com.infinitylabs.infinitymiles;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class SpotTheCarActivity extends AppCompatActivity {

    public ListView carsListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spot_the_car);

        carsListView = (ListView) findViewById(R.id.carsListView);

        final ArrayList<String> carList = new ArrayList<String>();

        carList.add("Red Car");
        carList.add("Blue Car");
        carList.add("Green Car");
        carList.add("Black Car");

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_checked, carList);

        carsListView.setAdapter(adapter);
        carsListView.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);

        carsListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(SpotTheCarActivity.this, "You have clicked on " + carList.get(i), Toast.LENGTH_LONG).show();
            }
        });



    }
}
