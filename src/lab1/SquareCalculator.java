package lab1;

import java.util.Scanner;

public class SquareCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter an integer: ");
            int number = scanner.nextInt();
            int square = number * number;
            System.out.println("Square of the entered integer: " + square);
        } catch (java.util.InputMismatchException e) {
            System.out.println("Error: Invalid input. Please enter a valid integer.");
        } finally {
            scanner.close();
        }
    }
}
