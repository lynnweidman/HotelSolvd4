package com.Model.HotelManagment;

import interfaces.ThankYou;

public abstract class Payment<T> implements ThankYou {
    private int paymentId;
    private int billId;
    private T t;

    public Payment(int paymentId, int billId) {
        this.paymentId = paymentId;
        this.billId = billId;
    }

    public int getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(int paymentId) {
        this.paymentId = paymentId;
    }

    public int getBillId() {
        return billId;
    }

    public void setBillId(int billId) {
        this.billId = billId;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public static <T> void printPayment(T[] arr) {
        for (T t : arr) {
            System.out.println(arr);
        }
    }

    @Override
    public String toString() {
        return "Payment{" +
                "paymentId=" + paymentId +
                ", billId=" + billId +
                ", t=" + t +
                '}';
    }
}

