package exceptions;

public class CheckCorrectNameFormatException extends Exception {

    public CheckCorrectNameFormatException(String message) {
        super(message);
        System.out.println(message);
    }
}
