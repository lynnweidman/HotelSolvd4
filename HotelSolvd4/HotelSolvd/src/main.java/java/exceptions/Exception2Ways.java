package exceptions;

public class Exception2Ways {
    /*An ArithmeticException exception with try/catch that prints an error message if there is division by 0.*/
    public static int computeDivision(int a, int b) {
        int quotient = 0;

        try {
            quotient = a / b;
        } catch (ArithmeticException ex) {
            System.out.println("NumberFormatException occurred. Cannot divide by 0.");
        }
        return quotient;
    }

    public static int computeDivisionWithThrows(int a, int b) throws ArithmeticException {
        int quotient = 0;
        quotient = a / b;

        System.out.println("NumberFormatException occurred. Cannot divide by 0.");
        return quotient;
    }
}
