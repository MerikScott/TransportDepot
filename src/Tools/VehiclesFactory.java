package Tools;

import Infrastructure.Employees.VehicleDriver;
import Infrastructure.Vehicles.Bus;
import Infrastructure.Vehicles.PassengerCar;
import Infrastructure.Vehicles.Truck;
import Infrastructure.Vehicles.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class VehiclesFactory {

    public static List<Vehicle> getVehicles() {

        List<Vehicle> depotVehicles = new ArrayList<Vehicle>();

        depotVehicles.add(new PassengerCar("KR001", "Pontiac Transam", 2130.00, 10, true));
        depotVehicles.add(new PassengerCar("KR002", "Ford Mondeo", 1684.00, 345000, true));
        depotVehicles.add(new PassengerCar("KR003", "Saab 95", 1984.00, 235200, true));
        depotVehicles.add(new Truck("WY001", "Volvo", 8340.00, 1600230, true));
        depotVehicles.add(new Truck("WY002", "Scania", 7974.00, 2313192, true));
        depotVehicles.add(new Truck("WY003", "Star660M1", 5650.00, 412890, true));
        depotVehicles.add(new Bus("WX001", "Autosan", 7700.00, 140010, true));
        depotVehicles.add(new Bus("WX002", "Ikarus", 8300.00, 650010, true));
        depotVehicles.add(new Bus("WX003", "Van Hool", 9230.00, 1040010, true));

        // add "no driver" state
        VehicleDriver fakeDriver = new VehicleDriver("noname", "noSurename", false);
        for (Vehicle depotVehicle : depotVehicles) {
            depotVehicle.setDriver(fakeDriver);
        }
        return depotVehicles;

    }


}
