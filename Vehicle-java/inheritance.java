class Vehicle {
    String brand;
    Vehicle(String brand) {
        this.brand = brand;
    }
    void displayBrand() {
        System.out.println("Vehicle Brand: " + brand);
    }
}

class Car extends Vehicle {
    String model;
    Car(String brand, String model) {
        super(brand);
        this.model = model;
    }
    void displayModel() {
        System.out.println("Vehicle Model: " + model);
    }
}

class Bike extends Car {
    String fuelType;
    Bike(String brand, String model, String fuelType) {
        super(brand, model);
        this.fuelType = fuelType;
    }
    void displayFuelType() {
        System.out.println("Fuel Type: " + fuelType);
    }
    void displayFullDetails() {
        displayBrand();
        displayModel(); 
        displayFuelType();
    }
}

public class inheritance {
    public static void main(String[] args) {
        Bike myBike = new Bike("Honda", "Activa 5G", "Petrol");
        myBike.displayFullDetails();
    }
}