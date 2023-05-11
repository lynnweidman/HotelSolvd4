package com.Model.HotelManagment;

import java.util.Objects;

public class Chef<E> extends RestaurantEmployee {
    private int chefId;
    private int orderId;

    public Chef(int employeeId, String employeeFirtName, String employeeLastName, int salary, int yearHired, int chefId, int orderId) {
        super(employeeId,employeeFirtName, employeeLastName, salary, yearHired);
        this.chefId = chefId;
        this.orderId = orderId;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getChefId() {
        return chefId;
    }

    @Override
    public void declaration() {

        System.out.println(getEmployeeFirstName() + " is a Chef.");
    }

    @Override
    public String toString() {
        return "Chef{" +
                "chefId=" + chefId +
                ", orderId=" + orderId +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Chef chef = (Chef) o;
        return chefId == chef.chefId && orderId == chef.orderId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(chefId, orderId);
    }
}

