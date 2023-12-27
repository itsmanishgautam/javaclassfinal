package self;

class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}
public class assign5 {


    //public class CustomExceptionDemo {
        static void validateAge(int age) throws CustomException {
            if (age < 18) throw new CustomException("Age must be 18 or older.");
            System.out.println("Age is valid: " + age);
        }

        public static void main(String[] args) {
            try {
                validateAge(15);
            } catch (CustomException e) {
                System.out.println("Custom Exception: " + e.getMessage());
            }
        }
    }

//}
