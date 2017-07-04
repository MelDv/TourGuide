package com.example.android.tourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class CafeFragment extends Fragment {

    public CafeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        final ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location(R.string.oma_title, R.string.oma_address, R.string.oma_description, R.drawable.oma));
        locations.add(new Location(R.string.pyynikki_title, R.string.pyynikki_add, R.string.pyynikki_desc, R.drawable.pyynikki));
        locations.add(new Location(R.string.amuri_title, R.string.amuri_add, R.string.amuri_desc, R.drawable.amuri));
        locations.add(new Location(R.string.europa_title, R.string.europa_add, R.string.europa_desc, R.drawable.europa));
        locations.add(new Location(R.string.tallipiha_title, R.string.tallipiha_add, R.string.tallipiha_desc, R.drawable.tallipiha));

        LocationAdapter adapter = new LocationAdapter(getActivity(), locations, R.color.cafe);

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}
