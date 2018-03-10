package com.infinitylabs.infinitymiles;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class LicensePlateActivity extends AppCompatActivity {

    final int numberOfStates = 50;

    ArrayList<String> stateList = new ArrayList<String>();
    Integer[] stateLicensePlateImageArray = {R.drawable.alabama, R.drawable.alaska, R.drawable.arizona,
    R.drawable.arkansas, R.drawable.californiia, R.drawable.colorado, R.drawable.conneticut, R.drawable.delaware, R.drawable.florida, R.drawable.goerga, R.drawable.hawaii, R.drawable.idaho,
    R.drawable.illinois,R.drawable.indiana, R.drawable.iowa, R.drawable.kansas, R.drawable.kentucky, R.drawable.louisiana,
    R.drawable.maine, R.drawable.maryland, R.drawable.massechussetts, R.drawable.michigan, R.drawable.minnesota, R.drawable.mississippi, R.drawable.missouri,
    R.drawable.montana, R.drawable.nebraska, R.drawable.nevada, R.drawable.newhampshire, R.drawable.newjersey, R.drawable.newmexico, R.drawable.newyork,
    R.drawable.northcarolina, R.drawable.northdakota, R.drawable.ohio, R.drawable.oklahoma, R.drawable.oregon, R.drawable.pennsylvania, R.drawable.rhodeisland,
    R.drawable.southcarolina, R.drawable.southdakota, R.drawable.tennassee, R.drawable.texas, R.drawable.utah, R.drawable.vermont, R.drawable.virginai,
    R.drawable.wahington, R.drawable.westvirginia, R.drawable.wisconsin, R.drawable.wyoming};
    boolean[] stateFoundArray = new boolean[numberOfStates];
    State[] stateArray = new State[numberOfStates];



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
        stateList.add("louisiana");
        stateList.add("Maine");
        stateList.add("Maryland");
        stateList.add("Massachusetts");
        stateList.add("michigan");
        stateList.add("Minnesota");
        stateList.add("Mississippi");
        stateList.add("Missouri");
        stateList.add("Montana");
        stateList.add("Nebraska");
        stateList.add("Nevada");
        stateList.add("New Hampshire");
        stateList.add("New Jersey");
        stateList.add("New Mexico");
        stateList.add("New York");
        stateList.add("North Carolina");
        stateList.add("North Dakota");
        stateList.add("Ohio");
        stateList.add("Oklahoma");
        stateList.add("Oregon");
        stateList.add("Pennsylvania");
        stateList.add("Rhode Island");
        stateList.add("South Carolina");
        stateList.add("South Dakota");
        stateList.add("Tennessee");
        stateList.add("Texas");
        stateList.add("Utah");
        stateList.add("Vermont");
        stateList.add("Virginia");
        stateList.add("Washington");
        stateList.add("West Virginia");
        stateList.add("Wisconsin");
        stateList.add("Wyoming");
    }

    public void createStateObjects()
    {

        for (int i = 0; i < stateArray.length; i++)
        {
            stateArray[i] = new State(stateList.get(i), stateLicensePlateImageArray[i], stateFoundArray[i]);
        }

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_license_plate);

        ListView licensePlateListView = (ListView) findViewById(R.id.licensePlateTextView);

        initStateList();
        createStateObjects();



        /* Default Array Adapter
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
        android.R.layout.simple_list_item_1, android.R.id.text1, values); */

        StateAdapter adapter = new StateAdapter(this, stateArray);


        licensePlateListView.setAdapter(adapter);
        licensePlateListView.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);
    }
}
