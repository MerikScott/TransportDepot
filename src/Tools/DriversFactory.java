package Tools;

import Infrastructure.Employees.VehicleDriver;

import java.util.ArrayList;
import java.util.List;

public class DriversFactory {
    public static List<VehicleDriver> getDrivers() {

        List<VehicleDriver> vehicleDrivers = new ArrayList<>();

        vehicleDrivers.add(new VehicleDriver("John", "Doe", true));
        vehicleDrivers.add(new VehicleDriver("Stanley", "O'Connor", true));
        vehicleDrivers.add(new VehicleDriver("Bibi", "King", true));
        vehicleDrivers.add(new VehicleDriver("Pedro", "Martines", true));
        vehicleDrivers.add(new VehicleDriver("Ivan", "Terrible", true));
        vehicleDrivers.add(new VehicleDriver("Jimmy", "Sommerville", true));
        vehicleDrivers.add(new VehicleDriver("Gunter", "Hohenlohe", true));
        vehicleDrivers.add(new VehicleDriver("Manfred", "Neumann", true));

        return vehicleDrivers;

    }
}
