package lab1;

class Vehicle {
    protected String brand;
    protected String model;

    public Vehicle(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public void printInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
    }
}

class Car extends Vehicle {
    private int numberOfDoors;

    public Car(String brand, String model, int numberOfDoors) {
        super(brand, model);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Number of doors: " + numberOfDoors);
    }
}

class Bicycle extends Vehicle {
    private int numberOfGears;

    public Bicycle(String brand, String model, int numberOfGears) {
        super(brand, model);
        this.numberOfGears = numberOfGears;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Number of gears: " + numberOfGears);
    }
}

public class VehicleDemo {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Camry", 4);
        Bicycle bicycle = new Bicycle("Giant", "Defy", 21);

        System.out.println("Car Information:");
        car.printInfo();

        System.out.println("\nBicycle Information:");
        bicycle.printInfo();
    }
}
