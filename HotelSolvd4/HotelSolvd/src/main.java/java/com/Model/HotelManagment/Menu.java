package com.Model.HotelManagment;

import java.util.HashMap;
import java.util.LinkedList;

public class Menu {
    private int itemId;
    private String itemName;
    private double price;

    public Menu(int itemId, String itemName, double price) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.price = price;
    }

    public static HashMap<String, Double> menuItemsWithPrice = new HashMap();

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "itemId=" + itemId +
                ", itemName='" + itemName + '\'' +
                ", amount=" + price +
                '}';
    }
}

