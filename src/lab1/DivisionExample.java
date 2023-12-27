package lab1;
class DivisionByZeroException extends Exception {
    public DivisionByZeroException(String message) {
        super(message);
    }
}

public class DivisionExample {
    public static void main(String[] args) {
        try {
            // Test cases
            divide(10, 2);  // Valid division
            divide(5, 0);   // Division by zero
             // Another valid division
        } catch (DivisionByZeroException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    static void divide(int numerator, int denominator) throws DivisionByZeroException {
        try {
            if (denominator == 0) {
                throw new DivisionByZeroException("Cannot divide by zero");
            }
            int result = numerator / denominator;
            System.out.println("Result of division: " + result);
        } catch (DivisionByZeroException e) {
            System.out.println("Caught exception: " + e.getMessage());
            throw e;  // Rethrow the exception after handling
        }
    }
}
