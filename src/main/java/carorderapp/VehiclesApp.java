package carorderapp;

import java.util.ArrayList;
import java.util.Collections;

public class VehiclesApp {

    public static void printVehicleNamesAndPrices(Vehicle[] vehicles){
        for (Vehicle x : vehicles) {
            System.out.println(x);
        }

    }

    public static void getSpeedOfDriveableVehicles(ArrayList<Driveable> driveables) {
        for (Driveable x : driveables) {
            System.out.println(x.milesPerHour());
        }

    }

    public static void sortAndPrintDriveableVehiclesBySpeed(ArrayList<Driveable>driveableArrayList){
        Collections.sort(driveableArrayList, new DriveableSpeedComparator());
        for (Driveable x : driveableArrayList) {
            System.out.println(x.milesPerHour());
        }

    }

    public static void main(String[] args) {

        Engine carEngine = new Engine();
        Engine truckEngine = new Engine();
        Engine bikeEngine = new Engine();

        Car car = new Car("Honda", 5, 50.0, carEngine, 100);
        Truck truck = new Truck("GM", 5, 100.0, truckEngine, 75);
        MotorBike motorBike = new MotorBike("Suzuki", 5,75.00, bikeEngine, 50, 2);

        Vehicle[] vehicles = {car,truck,motorBike};

        ArrayList<Driveable> driveables = new ArrayList<>();
        driveables.add(car);
        driveables.add(truck);

        printVehicleNamesAndPrices(vehicles);
        getSpeedOfDriveableVehicles(driveables);

        System.out.println(car.totalBeforeTax(car));
        car.totalAfterTax(car);

        System.out.println(truck.totalBeforeTax(truck));
        truck.totalAfterTax(truck);

        sortAndPrintDriveableVehiclesBySpeed(driveables);
    }

}
