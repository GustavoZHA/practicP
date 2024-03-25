package SOLID.OpenClosedPrinciple;

public class Truck extends Vehicle {
    public double calculateValue() {
        return this.getValue() * 0.9;
    }
}
