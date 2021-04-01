package carorderapp;

import java.util.Comparator;

public class DriveableSpeedComparator implements Comparator<Driveable> {
    @Override
    public int compare(Driveable vehicle1, Driveable vehicle2) {
        if (vehicle1.milesPerHour() < vehicle2.milesPerHour()) {
            return -1;
        }
        return 1;
    }
}
