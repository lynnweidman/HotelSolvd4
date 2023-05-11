package com.Model.HotelManagment;

import enums.TrafficLight;

public class PracticeEnums {
    private int i;
    private String s;
    String message;

    PracticeEnums(int i, String s, String message) {
        this.i = i;
        this.s = s;
        this.message = message;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "PracticeEnums{" +
                "i=" + i +
                ", s='" + s + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
