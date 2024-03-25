package SOLID.OpenClosedPrinciple;

public class Car extends Vehicle {
    public double calculateValue() {
        return this.getValue() * 0.8;
    }
}
