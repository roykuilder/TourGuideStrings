package com.example.android.tourguidestrings;

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
public class TheatreFragment extends Fragment {

    public TheatreFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Set the rootView for the Theatre fragment
        View rootView = inflater.inflate(R.layout.content_list, container, false);

        /**
         * An ArrayList of Card objects is made. The Card class takes in the following
         * string resource id's.
         *
         * title, mainText, phoneNumber, address, link, picture
         */
        final ArrayList<Card> cards = new ArrayList<Card>();
        cards.add(new Card(R.string.theatre_stadsschouwburg_title, R.string.theatre_stadsschouwburg_main_text,
                R.string.theatre_stadsschouwburg_phone_number, R.string.theatre_stadsschouwburg_adress,
                R.string.theatre_stadsschouwburg_site, R.drawable.theatre_stadsschouwburg));
        cards.add(new Card(R.string.theatre_martiniplaza_title, R.string.theatre_martiniplaza_main_text,
                R.string.theatre_martiniplaza_phone_number, R.string.theatre_martiniplaza_adress, R.string.theatre_martiniplaza_site,
                R.drawable.theatre_martiniplaza));
        cards.add(new Card(R.string.theatre_de_oosterpoort_title, R.string.theatre_de_oosterpoort_main_text,
                R.string.theatre_de_oosterpoort_phone_number, R.string.theatre_de_oosterpoort_adress,
                R.string.theatre_de_oosterpoort_site, R.drawable.theatre_oosterpoort));
        cards.add(new Card(R.string.theatre_grand_theatre_title, R.string.theatre_grand_theatre_main_text, R.string.theatre_grand_theatre_phone_number,
                R.string.theatre_grand_theatre_adress, R.string.theatre_grand_theatre_site, R.drawable.theatre_grand_theatre));
        // A custom Arraydapter is created/
        CardAdapter adapter = new CardAdapter(getActivity(), cards);
        // A ListView object is created/
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        // The adapter is set on the ListView/
        listView.setAdapter(adapter);
        //Return the created View tot the ViewPager/
        return rootView;
    }

}
