package lab1;

class NegativeValueException extends Exception {
    public NegativeValueException(String message) {
        super(message);
    }
}

public class PositiveIntegerInput {
    public static void main(String[] args) {
        try {
            // Prompt the user to enter a positive integer
            int userInput = promptUserForPositiveInteger();
            System.out.println("You entered: " + userInput);
        } catch (NegativeValueException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    static int promptUserForPositiveInteger() throws NegativeValueException {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int input = scanner.nextInt();

        scanner.close();

        if (input < 0) {
            throw new NegativeValueException("Negative value entered. Please enter a positive integer.");
        }

        return input;
    }
}
