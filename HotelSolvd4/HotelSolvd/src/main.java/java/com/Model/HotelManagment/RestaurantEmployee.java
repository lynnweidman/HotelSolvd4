package com.Model.HotelManagment;

import interfaces.GreatPlaceToWork;
import interfaces.SalaryIncrease;
import java.util.ArrayList;
import java.util.List;

public class RestaurantEmployee<E> implements SalaryIncrease, GreatPlaceToWork {
    private int employeeId;
    private String employeeFirstName;
    private String employeeLastName;
    private int salary;
    private int yearHired;

    public RestaurantEmployee(int employeeId, String employeeFirstName, String employeeLastName, int salary, int yearHired){
        this.employeeId = employeeId;
        this.employeeFirstName = employeeFirstName;
        this.employeeLastName = employeeLastName;
        this.salary = salary;
        this.yearHired = yearHired;
    }

    public static List<RestaurantEmployee> allRestaurantEmployees = new ArrayList<>();

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeFirstName() {
        return employeeFirstName;
    }

    public void setEmployeeFirstName(String employeeFirstName) {
        this.employeeFirstName = employeeFirstName;
    }

    public String getEmployeeLastName() {
        return employeeLastName;
    }

    public void setEmployeeLastName(String employeeLastName) {
        this.employeeLastName = employeeLastName;
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

    public void setYearHired(int yearHired) {
        this.yearHired = yearHired;
    }

    public void declaration() {
    }

    /*This final method is using the getSalaryIncrease from the SalaryIncrease interface. It can be used by subclasses,
   but cannot be overridden.*/
    @Override
    public final double getSalaryIncrease(int salary) {
        //super();
        if (CURRENT_YEAR - salary < 5) {
            salary = (int) ((salary * FIVE_PERCENT) + salary);
        } else {
            salary = (int) ((salary * TEN_PERCENT) + salary);
        }
        return salary;
    }

    @Override
    public void getGreatPlaceToWork() {
        System.out.println("This restaurant is a great place to work!");
    }

    @Override
    public String toString() {
        return "RestaurantEmployee{" +
                "employeeId=" + employeeId +
                ", employeeFirstName='" + employeeFirstName + '\'' +
                ", employeeLastName='" + employeeLastName + '\'' +
                ", salary=" + salary +
                ", yearHired=" + yearHired +
                '}';
    }
}


