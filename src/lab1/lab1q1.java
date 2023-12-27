package lab1;

public class lab1q1 {



    interface Shape {
        double calculateArea();
        void displayInfo();
    }

    static class Circle implements Shape {
        private double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        @Override
        public double calculateArea() {
            return Math.PI * Math.pow(radius, 2);
        }

        @Override
        public void displayInfo() {
            System.out.println("Circle - Radius: " + radius);
        }
    }

    static class Rectangle implements Shape {
        private double length;
        private double width;

        public Rectangle(double length, double width) {
            this.length = length;
            this.width = width;
        }

        @Override
        public double calculateArea() {
            return length * width;
        }

        @Override
        public void displayInfo() {
            System.out.println("Rectangle - Length: " + length + ", Width: " + width);
        }
    }

    static class Triangle implements Shape {
        private double base;
        private double height;

        public Triangle(double base, double height) {
            this.base = base;
            this.height = height;
        }

        @Override
        public double calculateArea() {
            return (base * height) / 2;
        }

        @Override
        public void displayInfo() {
            System.out.println("Triangle - Base: " + base + ", Height: " + height);
        }
    }


        public static void main(String[] args) {
            Shape[] shapes = {
                    new Circle(5),
                    new Rectangle(4, 6),
                    new Triangle(3, 8)
            };

            for (Shape shape : shapes) {
                double area = shape.calculateArea();
                System.out.println("Area: " + area);
                shape.displayInfo();
                System.out.println();
            }
        }
    }







