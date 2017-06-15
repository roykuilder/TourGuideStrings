package com.example.android.tourguidestrings;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class LeisureFragment extends Fragment {


    public LeisureFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Set the rootView for the Leisure fragment
        View rootView = inflater.inflate(R.layout.content_list, container, false);

        /**
         * An ArrayList of Card objects is made. The Card class takes in the following
         * string resource id's.
         *
         * title, mainText, phoneNumber, address, link, picture
         */
        final ArrayList<Card> cards = new ArrayList<Card>();
        cards.add(new Card(R.string.leisure_boertange_title, R.string.leisure_boertange_main_text,
                R.string.leisure_boertange_phone_number, R.string.leisure_boertange_adress,
                R.string.leisure_boertange_site, R.drawable.leisure_boertange));
        cards.add(new Card(R.string.leisure_groninger_museum_title, R.string.leisure_groninger_museum_main_text,
                R.string.leisure_groninger_museum_phone_number, R.string.leisure_groninger_museum_adress,
                R.string.leisure_groninger_museum_site, R.drawable.leisure_groninger_museum));
        cards.add(new Card(R.string.leisure_martini_toren_title, R.string.leisure_martini_toren_main_text,
                R.string.leisure_martini_toren_phone_number, R.string.leisure_martini_toren_adress,
                R.string.leisure_martini_toren_site, R.drawable.leisure_martini_toren));
        cards.add(new Card(R.string.leisure_scheepvaartmuseum_title, R.string.leisure_scheepvaartmuseum_main_text, R.string.leisure_scheepvaartmuseum_phone_number,
                R.string.leisure_scheepvaartmuseum_adress, R.string.leisure_scheepvaartmuseum_site, R.drawable.leisure_scheepvaartmuseum));
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
