package com.Model.HotelManagment;

public class Card extends Payment {

    public Card(int paymentId, int billId) {
        super(paymentId, billId);
    }

    @Override
    public void getThankYou() {
        System.out.println("Thank you for your credit card payment");
    }

}

