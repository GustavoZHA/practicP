package SOLID.OpenClosedPrinciple;

/**
 * Suppose we now want to add another subclass called Truck.
 * We would have to modify the above class by adding another if statement,
 * which goes against the Open-Closed Principle.
 */
public class VehicleCalculations {
    public double calculateValue(Vehicle v) {
        if (v instanceof Car) {
            return v.getValue() * 0.8;
        }
        if (v instanceof Bike) {
            return v.getValue() * 0.5;
        }
        return 0;
    }
}
