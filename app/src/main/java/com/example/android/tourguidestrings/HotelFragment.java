package com.example.android.tourguidestrings;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class HotelFragment extends Fragment {

    public HotelFragment() {
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
         * title, mainText, phoneNumber, address, link, picture
         */
        final ArrayList<Card> hotel = new ArrayList<Card>();
        hotel.add(new Card(R.string.hotel_hampshire_title, R.string.hotel_hampshire_main_text,
                R.string.hotel_hampshire_phone_number, R.string.hotel_hampshire_adress,
                R.string.hotel_hampshire_site, R.drawable.hotel_hampshire));
        hotel.add(new Card(R.string.hotel_nh_title, R.string.hotel_nh_main_text,
                R.string.hotel_nh_phone_number, R.string.hotel_nh_adress, R.string.hotel_nh_site,
                R.drawable.hotel_nh_groningen));
        hotel.add(new Card(R.string.hotel_corps_de_garde_title, R.string.hotel_corps_de_garde_main_text,
                R.string.hotel_corps_de_garde_phone_number, R.string.hotel_corps_de_garde_adress,
                R.string.hotel_corps_de_garde_site, R.drawable.hotel_corps_de_garde));
        hotel.add(new Card(R.string.hotel_prinsenhof_title, R.string.hotel_prinsenhof_main_text, R.string.hotel_prinsenhof_phone_number,
                R.string.hotel_prinsenhof_adress, R.string.hotel_prinsenhof_site, R.drawable.hotel_prinsenhof));
        // A custom Arraydapter is created/
        CardAdapter adapter = new CardAdapter(getActivity(), hotel);
        // A ListView object is created/
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        // The adapter is set on the ListView/
        listView.setAdapter(adapter);
        //Return the created View tot the ViewPager/
        return rootView;
    }

}