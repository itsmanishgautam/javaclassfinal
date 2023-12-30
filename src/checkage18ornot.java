
    import java.util.*;

    class InvalidAgeException extends Exception {
        InvalidAgeException(String message) {
            super(message);
        }
    }

    public class checkage18ornot {
        public static void main(String[] args) {
            int age;
            Scanner scanner = new Scanner(System.in);

            try {
                System.out.println("ENTER AGE:");
                age = scanner.nextInt();

                if (age < 18) {
                    throw new InvalidAgeException("YOU ARE NOT ELIGIBLE TO VOTE");
                } else {
                    System.out.println("YOU ARE ELIGIBLE TO VOTE");
                }
            } catch (InvalidAgeException e) {
                System.out.println("CAUGHT AN EXCEPTION");
                System.out.println(e.getMessage());
            } finally {
                System.out.println("Code executed");
            }


            scanner.close();
        }
    }


