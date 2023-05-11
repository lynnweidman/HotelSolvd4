package com.Model.HotelManagment;

import exceptions.CheckHotelExistsException;
import exceptions.CheckHotelIdException;

import java.util.ArrayList;
import java.util.Objects;

public class Hotel {
    private int hotelId;
    private String hotelName;
    private static int NUMBER_OF_EMPLOYEES = 0;

    public Hotel(int hotelId, String hotelName, int NUMBER_OF_EMPLOYEES) {
        this.hotelId = hotelId;
        this.hotelName = hotelName;
        this.NUMBER_OF_EMPLOYEES = NUMBER_OF_EMPLOYEES;
    }

    public static ArrayList<Hotel> allHotels = new ArrayList<>();

    public int getHotelId() {
        return hotelId;
    }

    public void setHotelId(int hotelId) throws CheckHotelIdException {
        if (hotelId <= 0) {
            throw new CheckHotelIdException("Id cannot be 0");
        } else {
            this.hotelId = hotelId;
        }
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) throws CheckHotelExistsException {
        for (Hotel h : allHotels)
            if (h.getHotelName().equals(hotelName)) {
                throw new CheckHotelExistsException("This hotel already exists");
            } else {
                this.hotelName = hotelName;
            }
    }

    public static int getNumberOfEmployees() {
        return NUMBER_OF_EMPLOYEES;
    }

    public static void setNumberOfEmployees(int numberOfEmployees) {
        NUMBER_OF_EMPLOYEES = numberOfEmployees;
    }

    public static ArrayList<Hotel> getAllHotels() {
        return allHotels;
    }


    public static void setAllHotels(ArrayList<Hotel> allHotels) {
        Hotel.allHotels = allHotels;
    }


    /*public static void setAllHotels(Hotel allHotels) throws CheckHotelExists{
        for(Hotel h : allHotels) {
            if(getAllHotels().contains(h.getHotelName())) {
                throw new CheckHotelExists("This hotel already exists");
            }
            Hotel.allHotels = allHotels;

        }

        //Hotel.allHotels = allHotels;
    }*/

    @Override
    public String toString() {
        return "HotelManagement{" +
                "hotelName='" + hotelName + '\'' +
                ", NUM_OF_EMPLOYEES=" + NUMBER_OF_EMPLOYEES +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hotel hotel = (Hotel) o;
        return NUMBER_OF_EMPLOYEES == hotel.NUMBER_OF_EMPLOYEES && Objects.equals(hotelName, hotel.hotelName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hotelName, NUMBER_OF_EMPLOYEES);
    }
}

