package exceptions;

public class CheckHotelExistsException extends Exception{

    public CheckHotelExistsException(String message) {
        super(message);
        System.out.println(message);
    }
}
