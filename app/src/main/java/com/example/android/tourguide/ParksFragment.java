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
public class ParksFragment extends Fragment {

    public ParksFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        final ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location(R.string.koskipuisto_title, R.string.koskipuisto_add, R.string.koskipuisto_desc, R.drawable.koskipuisto));
        locations.add(new Location(R.string.nottbeckinpuisto_title, R.string.nottbeckinpuisto_add, R.string.nottbeckinpuisto_desc, R.drawable.nottbeck));
        locations.add(new Location(R.string.sorsapuisto_title, R.string.sorsapuistoo_add, R.string.sorsapuisto_desc, R.drawable.sorsapuisto));
        locations.add(new Location(R.string.hameenpuisto_title, R.string.hameenpuisto_add, R.string.hameenpuisto_desc, R.drawable.hameenpuisto));

        LocationAdapter adapter = new LocationAdapter(getActivity(), locations, R.color.parks);

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}
