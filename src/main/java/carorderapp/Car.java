package carorderapp;

public class Car extends Vehicle implements Driveable {

    public Car(String name, int qty, double price, Engine engine, int speed) {
        super(name, qty, price, engine, speed);
    }


    @Override
    public int milesPerHour() {
        return getSpeed();
    }

    @Override
    public void totalAfterTax(Vehicle vehicle) {
        double tax = vehicle.getPrice() * getTAX();
        double total = vehicle.getPrice() + tax;
        System.out.println("Total after tax is " +  total * getQty());

    }

    @Override
    public String toString() {
        return getName() + " " + " speed: " + getSpeed();
    }
}
