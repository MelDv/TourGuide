package com.example.android.tourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class SightsFragment extends Fragment {

    public SightsFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        final ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location(R.string.sarkka_title, R.string.sarkka_add, R.string.sarkka_desc, R.drawable.sarkanniemi));
        locations.add(new Location(R.string.finlayson_title, R.string.finlayson_add, R.string.finlayson_desc, R.drawable.finlayson));
        locations.add(new Location(R.string.vapriikki_title, R.string.vapriikki_add, R.string.vapriikki_desc));
        locations.add(new Location(R.string.muumi_title, R.string.muumi_add, R.string.muumi_desc, R.drawable.muumi));

        LocationAdapter adapter = new LocationAdapter(getActivity(), locations, R.color.sights);

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}
