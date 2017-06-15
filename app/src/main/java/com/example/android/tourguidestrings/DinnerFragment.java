package com.example.android.tourguidestrings;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class DinnerFragment extends Fragment {

    public DinnerFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Set the rootView for the Hotel fragment
        View rootView = inflater.inflate(R.layout.content_list, container, false);

        /**
         * An ArrayList of Card objects is made. The Card class takes in the following
         * string resource id's.
         *
         * title, mainText, phoneNumber, address, link, (drawable)picture
         */
        final ArrayList<Card> cards = new ArrayList<Card>();
        cards.add(new Card(R.string.restaurant_humphreys_title, R.string.restaurant_humphreys_main_text,
                R.string.restaurant_humphreys_phone_number, R.string.restaurant_humphreys_adress,
                R.string.restaurant_humphreys_site, R.drawable.restaurant_humphreys));
        cards.add(new Card(R.string.restaurant_feithuis_title, R.string.restaurant_feithuis_main_text,
                R.string.restaurant_feithuis_phone_number, R.string.restaurant_feithuis_adress, R.string.restaurant_feithuis_site,
                R.drawable.restaurant_feithuis));
        cards.add(new Card(R.string.restaurant_voila_title, R.string.restaurant_voila_main_text,
                R.string.restaurant_voila_phone_number, R.string.restaurant_voila_adress,
                R.string.restaurant_voila_site, R.drawable.restaurant_voila));
        cards.add(new Card(R.string.restaurant_prinsenhof_title, R.string.restaurant_prinsenhof_main_text, R.string.restaurant_prinsenhof_phone_number,
                R.string.restaurant_prinsenhof_adress, R.string.restaurant_prinsenhof_site, R.drawable.restaurant_prinsenhof));

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
