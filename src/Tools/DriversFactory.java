package Tools;

import Infrastructure.Employees.VehicleDriver;

import java.util.ArrayList;
import java.util.List;

public class DriversFactory {
    public static List<VehicleDriver> getDrivers() {

        List<VehicleDriver> vehicleDrivers = new ArrayList<>();

        vehicleDrivers.add(new VehicleDriver("John", "Doe"));
        vehicleDrivers.add(new VehicleDriver("Stanley", "O'Connor"));
        vehicleDrivers.add(new VehicleDriver("Bibi", "King"));
        vehicleDrivers.add(new VehicleDriver("Pedro", "Martines"));
        vehicleDrivers.add(new VehicleDriver("Ivan", "Terrible"));
        vehicleDrivers.add(new VehicleDriver("Jimmy", "Sommerville"));
        vehicleDrivers.add(new VehicleDriver("Gunter", "Hohenlohe"));
        vehicleDrivers.add(new VehicleDriver("Manfred", "Neumann"));

        return vehicleDrivers;

    }
}
