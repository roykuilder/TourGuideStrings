package com.example.android.tourguidestrings;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CardAdapter extends ArrayAdapter<Card> {

    ViewHolder viewHolder;
    /**
     * Constructor for a new CardAdapter class.
     *
     * @param context takes in the context where the adapter is created.
     * @param list    the ArrayList<Card> from the current Activity.
     */
    public CardAdapter(Context context, ArrayList<Card> list) {
        super(context, 0, list);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.card_layout, parent, false);

            viewHolder = new ViewHolder(listItemView);
            listItemView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        //Get the card object for the current position.
        final Card currentCard = getItem(position);

        // Find and set the title for the current Card.
        //TextView cardTitle = (TextView) listItemView.findViewById(R.id.card_title);
        viewHolder.titleTextView.setText(currentCard.getCardTitle());

        // Find and set the main body text.
        //TextView cardMainText = (TextView) listItemView.findViewById(R.id.card_main_text);
        //cardMainText.setText(currentCard.getCardMainText());
        viewHolder.mainTextTextView.setText(currentCard.getCardMainText());

        // Find and set the phone number on the card.
        //TextView cardPhoneNumber = (TextView) listItemView.findViewById(R.id.card_phone_number);
        //cardPhoneNumber.setText(currentCard.getCardPhoneNumber());
        viewHolder.phoneNumberTextView.setText(currentCard.getCardPhoneNumber());

        // Find and set the address on the card.
        //TextView cardAddress = (TextView) listItemView.findViewById(R.id.card_adress);
        //cardAddress.setText(currentCard.getCardAddress());
        viewHolder.addressTextView.setText(currentCard.getCardAddress());

        // Find and set the OnclickListener of the ImageView for the link on the card.
        // An Intent is used to open the corresponding web page.
//        ImageView cardLink = (ImageView) listItemView.findViewById(R.id.card_link);
//        cardLink.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent goToWebPage = new Intent(Intent.ACTION_VIEW);
//                goToWebPage.setData(Uri.parse(getContext().getResources().getString(currentCard.getCardLink())));
//                getContext().startActivity(goToWebPage);
//            }
//        });
        viewHolder.linkImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToWebPage = new Intent(Intent.ACTION_VIEW);
                goToWebPage.setData(Uri.parse(getContext().getResources().getString(currentCard.getCardLink())));
                getContext().startActivity(goToWebPage);
            }
        });

        // Find the ImageView in the list_item.xml layout with the ID image.
        //ImageView imageView = (ImageView) listItemView.findViewById(R.id.card_image);
        //imageView.setImageResource(currentCard.getCardPicture());
        viewHolder.fotoImageView.setImageResource(currentCard.getCardPicture());

        // Returns the created ListItem/
        return listItemView;
    }

    class ViewHolder {
        private TextView titleTextView;
        private TextView mainTextTextView;
        private TextView phoneNumberTextView;
        private TextView addressTextView;
        private ImageView linkImageView;
        private ImageView fotoImageView;

        public ViewHolder(@NonNull View view) {
            this.titleTextView = (TextView) view.findViewById(R.id.card_title);
            this.mainTextTextView = (TextView) view.findViewById(R.id.card_main_text);
            this.phoneNumberTextView = (TextView) view.findViewById(R.id.card_phone_number);
            this.addressTextView = (TextView) view.findViewById(R.id.card_adress);
            this.linkImageView = (ImageView) view.findViewById(R.id.card_link);
            this.fotoImageView = (ImageView) view.findViewById(R.id.card_image);
        }
    }
}
