package App;

import Environment.Place;
import Infrastructure.Employees.VehicleDriver;
import Infrastructure.Vehicles.Vehicle;
import Tools.DriversFactory;
import Tools.PlacesFactory;
import Tools.VehiclesFactory;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Vehicle> vehiclesList = VehiclesFactory.getVehicles();
        for (Vehicle vehicle : vehiclesList) {
            System.out.println(vehicle.toString());
        }

        List<VehicleDriver> driversList = DriversFactory.getDrivers();
        for (VehicleDriver vehicleDriver : driversList) {
            System.out.println(vehicleDriver.toString());
        }

        List<Place> placesList = PlacesFactory.getPlaces();
        for (Place place : placesList) {
            System.out.println(place.toString());
        }

    }
}

