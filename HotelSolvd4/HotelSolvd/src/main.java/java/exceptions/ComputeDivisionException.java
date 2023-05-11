package exceptions;

public class ComputeDivisionException extends Exception {

    public ComputeDivisionException(String message) {
        super(message);
        System.out.println(message);
    }
}
