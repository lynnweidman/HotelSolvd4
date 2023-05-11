package exceptions;

public class CheckHotelIdException extends Exception {

    public CheckHotelIdException(String message) {
        super(message);
        System.out.println(message);
    }
}
