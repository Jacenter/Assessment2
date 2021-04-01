package carorderapp;

public class Truck extends Vehicle implements Driveable {
    public final double TAX = .020;
    public Truck(String name, int qty, double price, Engine engine, int speed) {
        super(name, qty, price, engine, speed);
    }



    @Override
    public void totalAfterTax(Vehicle vehicle) {
            double tax = vehicle.getPrice() * TAX;
            double total = vehicle.getPrice() + tax + tax;
            System.out.println("Total after tax is " + total * vehicle.getQty());
        }

    @Override
    public int milesPerHour() {
        return getSpeed();
    }

    @Override
    public String toString() {
        return getName() + " " + " speed: " + getSpeed();
    }
}



