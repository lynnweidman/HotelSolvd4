package com.Model.HotelManagment;

import enums.Division;

public class Manager<E> extends HotelEmployee {
    Manager(int hotelEmployeeId, int hotelId, String hotelEmployeeFirstName, String hotelEmployeeLastName, int salary, int yearHired, Division division) {
        super(hotelEmployeeId, hotelId,hotelEmployeeFirstName, hotelEmployeeLastName, salary, yearHired, division);
    }
}

