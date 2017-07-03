package com.example.android.tourguide;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by maela on 3.7.2017.
 */

public class LocationAdapter extends ArrayAdapter<Location> {
    private int mColorResourceId;

    public LocationAdapter(Context context, ArrayList<Location> locations, int colorResourceId) {
        super(context, 0, locations);
        mColorResourceId = colorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Location currentLocation = getItem(position);

        TextView title = (TextView) listItemView.findViewById(R.id.list_title);
        title.setText(currentLocation.getTitle());

        TextView description = (TextView) listItemView.findViewById(R.id.list_description);
        description.setText(currentLocation.getDescription());

        TextView address = (TextView) listItemView.findViewById(R.id.list_address);
        address.setText(currentLocation.getAddress());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        if (currentLocation.hasImage()) {
            imageView.setImageResource(currentLocation.getImage());
        } else {
            imageView.setVisibility(View.GONE);
        }

        View locationContainer = listItemView.findViewById(R.id.location_container);
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        locationContainer.setBackgroundColor(color);

//        Log.i(LocationAdapter.class.getName(), "LOGcolor: "+ color);

        return listItemView;
    }
}
