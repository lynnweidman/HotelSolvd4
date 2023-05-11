package com.Model.HotelManagment;


import exceptions.CheckCorrectNameFormatException;
import exceptions.CheckCorrectYearFormatException;
import exceptions.CheckDuplicateEmployeeIdException;
import interfaces.GreatPlaceToWork;
import interfaces.SalaryIncrease;
import enums.Division;

import java.util.ArrayList;
import java.util.List;

public class HotelEmployee<E> implements SalaryIncrease, GreatPlaceToWork {
    protected int hotelEmployeeId;
    protected int hotelId;
    protected String hotelEmployeeFirstName;
    protected String hotelEmployeeLastName;
    protected int salary;
    protected int yearHired;
    protected Division division;

    public HotelEmployee(int hotelEmployeeId, int hotelId, String hotelEmployeeFirstName, String hotelEmployeeLastName, int salary, int yearHired, Division division) {
        this.hotelEmployeeId = hotelEmployeeId;
        this.hotelId = hotelId;
        this.hotelEmployeeFirstName = hotelEmployeeFirstName;
        this.hotelEmployeeLastName = hotelEmployeeLastName;
        this.salary = salary;
        this.yearHired = yearHired;
        this.division = division;
    }

    public static List<HotelEmployee> allHotelEmployees = new ArrayList<>();

    public static List<HotelEmployee> getAllHotelEmployees() {
        return allHotelEmployees;
    }

    public static void setAllHotelEmployees(List<HotelEmployee> allHotelEmployees) {
        HotelEmployee.allHotelEmployees = allHotelEmployees;
    }

    public int getHotelEmployeeId() {
        return hotelEmployeeId;
    }

    public void setHotelEmployeeId(int hotelEmployeeId) throws CheckDuplicateEmployeeIdException {
        for (HotelEmployee employee : HotelEmployee.allHotelEmployees) {
            if (String.valueOf(employee.getHotelEmployeeId()).equals(String.valueOf(hotelEmployeeId))) {
                throw new CheckDuplicateEmployeeIdException("This Id is taken. Cannot have duplicate Ids.");
            } else {

                this.hotelEmployeeId = hotelEmployeeId;
            }
        }
    }

    public int getHotelId() {
        return hotelId;
    }

    public void setHotelId(int hotelId) {
        this.hotelId = hotelId;
    }

    public String getHotelEmployeeFirstName() {
        return hotelEmployeeFirstName;
    }

    public void setHotelEmployeeFirstName(String hotelEmployeeFirstName) throws CheckCorrectNameFormatException {
        if (hotelEmployeeFirstName.contains(" ")) {
            String message = "Names cannot contain spaces.";
            throw new CheckCorrectNameFormatException("Names cannot contain spaces");
        } else {
            this.hotelEmployeeFirstName = hotelEmployeeFirstName;
        }
    }

    public String getHotelEmployeeLastName() {
        return hotelEmployeeLastName;
    }

    public void setHotelEmployeeLastName(String hotelEmployeeLastName) {
        this.hotelEmployeeLastName = hotelEmployeeLastName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getYearHired() {
        return yearHired;
    }

    public void setYearHired(int yearHired) throws CheckCorrectYearFormatException {
        if (String.valueOf(yearHired).length() != 4) {
            String message = "Not proper date format.";
            throw new CheckCorrectYearFormatException("Improper date format.");
        } else {
            this.yearHired = yearHired;
        }
    }

    public Division getDivision() {
        return division;
    }

    public void setDivision(Division division) {
        this.division = division;
    }

    /*This final method is using the getSalaryIncrease from the SalaryIncrease interface. It can be used by subclasses,
        but cannot be overridden.*/
    @Override
    public final double getSalaryIncrease(int salary) {
        if (CURRENT_YEAR - yearHired < 5) {
            salary = (int) ((salary * FIVE_PERCENT) + salary);
        } else {
            salary = (int) ((salary * TEN_PERCENT) + salary);
        }
        return salary;
    }

    @Override
    public void getGreatPlaceToWork() {
        System.out.println("This hotel is a great place to work!");
    }

    @Override
    public String toString() {
        return "HotelEmployee{" +
                "hotelEmployeeId=" + hotelEmployeeId +
                ", hotelId=" + hotelId +
                ", hotelEmployeeFirstName='" + hotelEmployeeFirstName + '\'' +
                ", hotelEmployeeLastName='" + hotelEmployeeLastName + '\'' +
                ", salary=" + salary +
                ", yearHired=" + yearHired +
                ", division=" + division +
                '}';
    }
}