package com.infinitylabs.infinitymiles;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class LicensePlateActivity extends AppCompatActivity {

    ArrayList<String> stateList = new ArrayList<String>();

    public void initStateList()
    {
        stateList.add("Alabama");
        stateList.add("Alaska");
        stateList.add("Arizona");
        stateList.add("Arkansas");
        stateList.add("California");
        stateList.add("Colorado");
        stateList.add("Connecticut");
        stateList.add("Delaware");
        stateList.add("Florida");
        stateList.add("Georgia");
        stateList.add("Hawaii");
        stateList.add("Idaho");
        stateList.add("Illinois");
        stateList.add("Indiana");
        stateList.add("Iowa");
        stateList.add("Kansas");
        stateList.add("Kentucky");
        stateList.add("Louisiana");
    }




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_license_plate);

        ListView licensePlateListView = (ListView) findViewById(R.id.licensePlateTextView);

        initStateList();

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_checked, stateList);

        licensePlateListView.setAdapter(adapter);
        licensePlateListView.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);
    }
}
