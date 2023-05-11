package exceptions;

public class CheckDuplicateEmployeeIdException extends Exception {

    //Custom exception to see if there is a duplicate Id. Throws the exception and prints a message if there is.
    public CheckDuplicateEmployeeIdException(String message) {
        super(message);
        System.out.println(message);
    }
}




