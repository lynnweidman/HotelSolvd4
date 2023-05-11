package com.Model.HotelManagment;

public class Cash extends Payment {

    public Cash(int paymentId, int billId) {
        super(paymentId, billId);
    }

    @Override
    public void getThankYou() {
        System.out.println("Thank you for your cash payment");
    }


}

