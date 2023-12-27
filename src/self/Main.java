package self;
import java.util.Scanner;

class Shape {
    // Common method for all shapes to display area
    void displayArea(double area, String shapeName) {
        System.out.println("Area of " + shapeName + ": " + area);
    }
}

class Circle extends Shape {
    double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }
}

class Triangle extends Shape {
    double calculateArea(double base, double height) {
        return 0.5 * base * height;
    }
}

class Rectangle extends Shape {
    double calculateArea(double length, double width) {
        return length * width;
    }

    double calculatePerimeter(double length, double width) {
        return 2 * (length + width);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Circle
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();
        Circle circle = new Circle();
        circle.displayArea(circle.calculateArea(radius), "Circle");

        // Triangle
        System.out.print("Enter the base of the triangle: ");
        double base = scanner.nextDouble();
        System.out.print("Enter the height of the triangle: ");
        double height = scanner.nextDouble();
        Triangle triangle = new Triangle();
        triangle.displayArea(triangle.calculateArea(base, height), "Triangle");

        // Rectangle
        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();
        System.out.print("Enter the width of the rectangle: ");
        double width = scanner.nextDouble();
        Rectangle rectangle = new Rectangle();
        rectangle.displayArea(rectangle.calculateArea(length, width), "Rectangle");
        System.out.println("Perimeter of Rectangle: " + rectangle.calculatePerimeter(length, width));

        scanner.close();
    }
}
