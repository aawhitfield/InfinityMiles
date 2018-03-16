package com.infinitylabs.infinitymiles;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import static com.infinitylabs.infinitymiles.R.drawable.californiia;

/**
 * Created by Aaron Whitfield on 3/6/2018.
 */

public class StateAdapter extends ArrayAdapter<State> {
    public StateAdapter(@NonNull Context context, State[] states) {
        super(context, R.layout.state_row, states);
    }

    @NonNull
    @Override
    public View getView(final int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater myInflater = LayoutInflater.from(getContext());
        View customView = myInflater.inflate(R.layout.state_row, parent,     false);

        String stateItem = getItem(position).name;
        TextView stateText = (TextView) customView.findViewById(R.id.stateNameTextView);
        ImageView stateImage = (ImageView) customView.findViewById(R.id.licensePlateImageView);
        final CheckBox stateCheckbox = (CheckBox) customView.findViewById(R.id.stateFoundCheckbox);

        stateText.setText(stateItem);
        stateImage.setImageResource(getItem(position).licensePlateImage);
        if(getItem(position).isFound) {
            stateCheckbox.setChecked(true);
        }
        else
        {
            stateCheckbox.setChecked(false);
        }

        stateCheckbox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(compoundButton.isChecked()) {
                    b = true;
                    getItem(position).isFound = true;

                    SharedPreferences sharedPref = getContext().getApplicationContext().getSharedPreferences("com.infinitylabs.infinitymiles", Context.MODE_PRIVATE);
                    SharedPreferences.Editor editor = sharedPref.edit();
                    editor.putBoolean(getItem(position).name, getItem(position).isFound);
                    editor.apply();

                    // Boolean myStateStatus = sharedPref.getBoolean(getItem(position).name, false);


                    //Toast.makeText(getContext().getApplicationContext(), "" + getItem(position).name + " is " + myStateStatus, Toast.LENGTH_SHORT).show();
                }
                else
                {
                    b = false;
                    getItem(position).isFound = false;

                    SharedPreferences sharedPref = getContext().getApplicationContext().getSharedPreferences("com.infinitylabs.infinitymiles", Context.MODE_PRIVATE);
                    SharedPreferences.Editor editor = sharedPref.edit();
                    editor.putBoolean(getItem(position).name, getItem(position).isFound);
                    editor.apply();

                    // Boolean myStateStatus = sharedPref.getBoolean(getItem(position).name, false);


                    //Toast.makeText(getContext().getApplicationContext(), "" + getItem(position).name + " is " + myStateStatus, Toast.LENGTH_SHORT).show();
                }
            }
        });

        return customView;
    }
}
