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
public class NatureFragment extends Fragment {


    public NatureFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        final ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location(R.string.nasi_title,R.string.nasi_add, R.string.nasi_desc, R.drawable.nasi));
        locations.add(new Location(R.string.pyha_title,R.string.pyha_add, R.string.pyha_desc, R.drawable.pyha));
        locations.add(new Location(R.string.koski_title,R.string.koski_add, R.string.koski_desc, R.drawable.koski));
        locations.add(new Location(R.string.kolu_title,R.string.kolu_add, R.string.kolu_desc, R.drawable.kolu));

        LocationAdapter adapter = new LocationAdapter(getActivity(), locations, R.color.lakes);

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}
