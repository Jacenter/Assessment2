package carorderapp;

public abstract class Vehicle extends Product {
    private int qty;
    private double price;
    private Engine engine;
    private int speed;
    private final double TAX = 0.015;

    public Vehicle(String name, int qty, double price, Engine engine, int speed) {
        super(name);
        this.qty = qty;
        this.price = price;
        this.engine = engine;
        this.speed = speed;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getTAX() {
        return TAX;
    }

    public double totalBeforeTax(Vehicle vehicle) {
        return vehicle.price * vehicle.qty;
    }

    public double calcTax(Vehicle vehicle){
        return vehicle.price * vehicle.TAX;
    }

    public abstract void totalAfterTax(Vehicle vehicle);
}
