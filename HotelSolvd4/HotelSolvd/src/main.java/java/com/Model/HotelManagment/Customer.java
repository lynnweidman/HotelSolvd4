package com.Model.HotelManagment;

public class Customer {
    private int customerId;
    private String customerName;
    private int billId;
    private int orderId;
    private int paymentId;

    public Customer(int customerId, String customerName, int billId, int orderId, int paymentId) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.billId = billId;
        this.orderId = orderId;
        this.paymentId = paymentId;
    }
    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getBillId() {
        return billId;
    }

    public void setBillId(int billId) {
        this.billId = billId;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(int paymentId) {
        this.paymentId = paymentId;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                ", customerName='" + customerName + '\'' +
                ", billId=" + billId +
                ", orderId=" + orderId +
                ", paymentId=" + paymentId +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Customer customer = (Customer) o;

        if (customerId != customer.customerId) return false;
        if (billId != customer.billId) return false;
        if (orderId != customer.orderId) return false;
        if (paymentId != customer.paymentId) return false;
        return customerName.equals(customer.customerName);
    }

    @Override
    public int hashCode() {
        int result = customerId;
        result = 31 * result + customerName.hashCode();
        result = 31 * result + billId;
        result = 31 * result + orderId;
        result = 31 * result + paymentId;
        return result;
    }
}

