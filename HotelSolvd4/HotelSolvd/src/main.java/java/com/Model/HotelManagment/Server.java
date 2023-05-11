package com.Model.HotelManagment;

import java.util.Objects;

public class Server<E> extends RestaurantEmployee {
    private int serverId;
    private int orderId;

    public Server(int employeeId, String employeeFirtName, String employeeLastName, int salary, int yearHired, int serverId, int orderId) {
        super(employeeId,employeeFirtName, employeeLastName, salary, yearHired);
        this.serverId = serverId;
        this.orderId = orderId;
    }

    public int getServerId() {
        return serverId;
    }

    public void setServerId(int serverId) {
        this.serverId = serverId;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    @Override
    public void declaration() {
        System.out.println(getEmployeeFirstName() + " is a Server.");
    }

    @Override
    public String toString() {
        return "Server{" +
                "serverId=" + serverId +
                ", orderId=" + orderId +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Server server = (Server) o;
        return serverId == server.serverId && orderId == server.orderId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(serverId, orderId);
    }
}

