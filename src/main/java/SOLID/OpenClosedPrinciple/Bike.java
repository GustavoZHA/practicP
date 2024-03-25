package SOLID.OpenClosedPrinciple;

public class Bike extends Vehicle {
    public double calculateValue() {
        return this.getValue() * 0.9;
    }
}