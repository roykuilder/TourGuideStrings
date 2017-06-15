package com.example.android.tourguidestrings;

public class Card {

    // private variavles are created/
    private int cardTitle;
    private int cardMainText;
    private int cardPhoneNumber;
    private int cardAddress;
    private int cardLink;
    private int cardPicture;

    //Constructor for new Card Object/
    public Card(int title, int mainText, int phoneNumber, int address, int link, int picture) {
        cardTitle = title;
        cardMainText = mainText;
        cardPhoneNumber = phoneNumber;
        cardAddress = address;
        cardLink = link;
        cardPicture = picture;
    }

    // Getter methods for all the variables/

    public int getCardTitle() {
        return cardTitle;
    }

    public int getCardMainText() {
        return cardMainText;
    }

    public int getCardPhoneNumber() {
        return cardPhoneNumber;
    }

    public int getCardAddress() {
        return cardAddress;
    }

    public int getCardLink() {
        return cardLink;
    }

    public int getCardPicture() {
        return cardPicture;
    }

}
