package carorderapp;

public class MotorBike extends Vehicle{
    private int numberOfWheels;


    public MotorBike(String name, int qty, double price, Engine engine, int speed, int numberOfWheels) {
        super(name, qty, price, engine, speed);
        this.numberOfWheels = numberOfWheels;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    @Override
    public void totalAfterTax(Vehicle vehicle) {
        double tax = vehicle.getPrice() * getTAX();
        double total = vehicle.getPrice() + tax;
        System.out.println("Total after tax is " +  total);
    }

    @Override
    public String toString() {
        return getName() + " " + " speed: " + getSpeed();

    }
}
