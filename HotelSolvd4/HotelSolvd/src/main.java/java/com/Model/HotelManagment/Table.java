package com.Model.HotelManagment;

import java.util.LinkedList;

public final class Table {
    private int tableNumber;
    private int serverId;
    private int customerId;

    public Table(int tableNumber, int serverId, int customerId) {
        this.tableNumber = tableNumber;
        this.serverId = serverId;
        this.customerId = customerId;
    }

    public static LinkedList<Table> tables = new LinkedList<>();

    public int getTableNumber() {
        return tableNumber;
    }

    public void setTableNumber(int tableNumber) {
        this.tableNumber = tableNumber;
    }

    public int getServerId() {
        return serverId;
    }

    public void setServerId(int serverId) {
        this.serverId = serverId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    @Override
    public String toString() {
        return "Table{" +
                "tableNumber=" + tableNumber +
                ", serverId=" + serverId +
                ", customerId=" + customerId +
                '}';
    }
}

