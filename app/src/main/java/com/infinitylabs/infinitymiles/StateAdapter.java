package com.infinitylabs.infinitymiles;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import static com.infinitylabs.infinitymiles.R.drawable.californiia;

/**
 * Created by Ted on 3/6/2018.
 */

public class StateAdapter extends ArrayAdapter<State> {
    public StateAdapter(@NonNull Context context, State[] states) {
        super(context, R.layout.state_row, states);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater myInflater = LayoutInflater.from(getContext());
        View customView = myInflater.inflate(R.layout.state_row, parent,     false);

        String stateItem = getItem(position).name;
        TextView stateText = (TextView) customView.findViewById(R.id.stateNameTextView);
        ImageView stateImage = (ImageView) customView.findViewById(R.id.licensePlateImageView);

        stateText.setText(stateItem);
        stateImage.setImageResource(getItem(position).licensePlateImage);

        return customView;
    }
}
