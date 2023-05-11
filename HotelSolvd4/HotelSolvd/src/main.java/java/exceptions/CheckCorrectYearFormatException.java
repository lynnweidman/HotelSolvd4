package exceptions;

public class CheckCorrectYearFormatException extends Exception{

    public CheckCorrectYearFormatException(String message) {
        super(message);
        System.out.println(message);
    }
}
