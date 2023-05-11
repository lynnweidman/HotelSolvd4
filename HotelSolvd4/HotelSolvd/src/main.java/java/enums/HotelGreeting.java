package enums;

public enum HotelGreeting {
    HILTON("Hilton- It matters where you stay."),
    MARRIOTT("Welcome to the Marriott");

    private String greeting;

    HotelGreeting(String greeting) {
        this.greeting = greeting;
    }

    public String getGreeting() {
        return greeting;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }
}
