package App;

import Infrastructure.Employees.VehicleDriver;
import Infrastructure.Vehicles.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class SystemOperator {


    public static void findVehicle(List<Vehicle> vehiclesInUseList , String driverSurname) {
        Boolean vehicleFound = false;

        for (Vehicle vehicle : vehiclesInUseList) {
            if (vehicle.getDriver().getSurname().equals(driverSurname)) {
                System.out.println("Vehicle driven by " + driverSurname +
                        " found at " + vehicle.getTransmitter().getLatitude() +
                        " N, " + vehicle.getTransmitter().getLongitude() + " E");
                vehicleFound = true;
                break;
            }
        }
        if (!vehicleFound) {
            System.out.println("No vehicle driven by " + driverSurname + " found.");
        }
    }

}

