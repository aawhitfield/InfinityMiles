package com.infinitylabs.infinitymiles;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Ted on 3/5/2018.
 */

public class StateAdapter extends BaseAdapter {
    private Context myContext;
    private LayoutInflater myInflater;
    private ArrayList<String> myDataSource;

    public StateAdapter(Context context, ArrayList<String> items)
    {
        myContext = context;
        myDataSource = items;
        myInflater = (LayoutInflater) myContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return myDataSource.size();
    }

    @Override
    public Object getItem(int position) {
        return myDataSource.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        View rowView = myInflater.inflate(R.layout.list_item_recipe, viewGroup, false);

        // Get title element
        TextView titleTextView = (TextView) rowView.findViewById(R.id.recipe_list_title);

        // Get subtitle element
        TextView subtitleTextView = (TextView) rowView.findViewById(R.id.recipe_list_subtitle);

        // Get detail element
        TextView detailTextView = (TextView) rowView.findViewById(R.id.recipe_list_detail);

        // Get thumbnail element
        TextView thumbnailImageView = (TextView) rowView.findViewById(R.id.recipe_list_thumbnail);

        titleTextView.setText("Test");
        subtitleTextView.setText("Subtitle");
        detailTextView.setText("Detail");

        
        return rowView;
    }
}
